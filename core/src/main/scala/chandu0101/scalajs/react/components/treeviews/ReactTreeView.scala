package chandu0101.scalajs.react.components
package treeviews

import chandu0101.scalajs.react.components.searchboxes.ReactSearchBox
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.collection.mutable
import scala.scalajs.js

/**
 * Created by chandrasekharkode
 */

case class TreeItem(item: Any, children: TreeItem*) {
  def apply(item: Any): TreeItem = this(item, Nil)
}

object ReactTreeView {

  trait Style {

    def reactTreeView = Seq[TagMod]()

    def treeGroup = Seq(^.margin := 0, ^.padding := "0 0 0 14px")

    def treeItem = Seq(^.listStyleType := "none")

    def treeItemContent = Seq(cursorPointer)

    def selectedTreeItemContent = Seq(^.backgroundColor := "#1B8EB0" ,
      ^.color := "white" , ^.fontWeight := 400 ,
      ^.padding := "0 7px")

    def treeItemBefore = Seq(
     displayInlineBlock,
     ^.fontSize := "11px",
     ^.color := "grey",
     ^.margin := "3px 7px 0 0",
     textAlignCenter,
     ^.width := "11px"
    )

    def treeItemHasChildrenClosed = Seq(^.contentStyle := "▶")

    def treeItemHasChildrenOpened = Seq(^.contentStyle := "▼")


  }
  
  val nodeRefs : mutable.Map[String,RefComp[NodeProps,NodeState,NodeBackend,TopNode]] = mutable.Map.empty

  case class State(filterText:   String = "",
                   filterMode:   Boolean = false,
                   selectedNode: U[BackendScope[NodeProps, NodeState]] = uNone)

  case class Backend(t: BackendScope[Props, State]) {

    def onNodeSelect(node: BackendScope[NodeProps, NodeState]): Callback = {
      val c1: U[Callback] = t.state.selectedNode.map{
        selectedNode =>
          val unSelect: U[Callback] =
            selectedNode
              .undef
              .filterNot(_ == node)
              .filter(_.isMounted())
              .map(_.modState(_.copy(selected = false)))

          val changeSelected: Callback =
            t.modState(_.copy(selectedNode = node, filterMode = false))

          val updateNode: Callback =
            node.modState(_.copy(selected = true))

          unSelect.voidU >> changeSelected >> updateNode
      }

      val c2: U[CallbackTo[Any]] =
        t.props.onItemSelect.mapply(
          node.props.root.item.toString,
          node.props.parent,
          node.props.depth
        )

      c1.voidU >> c2.voidU
    }

    def onTextChange(text: String): Callback =
      t.modState(_.copy(filterText = text,filterMode = true))

    def render(P: Props, S: State) = {
      <.div(P.style.reactTreeView)(
        P.showSearchBox ?= ReactSearchBox(onTextChange = onTextChange),
        TreeNode.withKey("root")(
          NodeProps(
            root = P.root,
            open = if (S.filterText.nonEmpty) true else P.open,
            onNodeSelect = onNodeSelect,
            filterText = S.filterText,
            style = P.style,
            filterMode = S.filterMode
          )
        )
      )
    }
  }


  case class NodeBackend(t: BackendScope[NodeProps, NodeState]) {

   def onItemSelect(e:ReactEventH): Callback =
     t.props.onNodeSelect(t) >>
     e.preventDefaultCB >>
     e.stopPropagationCB

    def onTreeMenuToggle(e: ReactEventH): Callback = {
      val c1 =
        (if (t.state.children.isEmpty) t.modState(_.copy(children = t.props.root.children))
        else t.modState(_.copy(children = Nil)))
      .filter(t.props.root.children.nonEmpty)

      c1 >> e.preventDefaultCB >> e.stopPropagationCB
    }

    def isFilterTextExist(filterText : String,data : TreeItem) : Boolean = {
      def loop(data : Seq[TreeItem]) : Boolean = {
       data.view.exists(item => if(item.children.isEmpty) item.item.toString.toLowerCase.contains(filterText.toLowerCase) else loop(item.children))
      }
      data.item.toString.toLowerCase.contains(filterText.toLowerCase) || loop(data.children)
    }

    def render(P: NodeProps, S: NodeState) = {
     val children =  S.children
     val depth = P.depth + 1
     val parent =  if(P.parent.isEmpty) P.root.item.toString  else s"${P.parent}<-${P.root.item.toString}"
     val treeMenuToggle  : TagMod = if(children.nonEmpty) <.span(^.onClick ==> onTreeMenuToggle, ^.key := "arrow",P.style.treeItemBefore)("▼")
                        else if(P.root.children.nonEmpty && children.isEmpty) <.span(^.onClick ==> onTreeMenuToggle, ^.key := "arrow",P.style.treeItemBefore)("▶")
                        else ""
     <.li(P.style.treeItem,treeMenuToggle, ^.key := "toggle", P.style.treeItemContent)(<.span(S.selected ?= P.style.selectedTreeItemContent, ^.onClick ==> onItemSelect,P.root.item.toString))(
      <.ul(P.style.treeGroup)(
       children.map(child => {
         val key : js.Any = s"$parent$depth${child.item}"
         val open = if(!P.filterText.trim.isEmpty) true else false
        isFilterTextExist(P.filterText,child) ?=  TreeNode.withKey(key)(P.copy(root = child,depth = depth,parent = parent,open = open,filterText = P.filterText))
       }) )
     )

    }
  }

  case class NodeState(children: Seq[TreeItem] = Nil, selected: Boolean = false)

  case class NodeProps(root: TreeItem,
                       open: Boolean,
                       depth: Int = 0,
                       parent: String = "",
                       onNodeSelect: (BackendScope[NodeProps, NodeState]) => Callback,
                       filterText: String,
                       style: Style,
                       filterMode: Boolean)

 lazy val TreeNode : ReactComponentC.ReqProps[NodeProps,NodeState,NodeBackend,TopNode] = ReactComponentB[NodeProps]("ReactTreeNode")
    .initialState_P(p => if(p.open) NodeState(p.root.children) else NodeState())
    .backend(NodeBackend)
    .render($ => $.backend.render($.props, $.state))
    .componentWillReceiveProps { (scope, nextProps) =>
     val c1: Callback =
       if (nextProps.open)
         scope.modState(_.copy(children = nextProps.root.children))
       else
         scope.modState(_.copy(children = Nil))

     c1.filter(nextProps.filterMode)
    }
    .build


  val component = ReactComponentB[Props]("ReactTreeView")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.props, $.state))
    .build

  case class Props(
    root:          TreeItem,
    open:          Boolean,
    onItemSelect:  U[StringStringIntCbAny],
    showSearchBox: Boolean,
    style:         Style
  )


  def apply(
    root:          TreeItem,
    openByDefault: Boolean                 = false,
    onItemSelect:  U[StringStringIntCbAny] = uNone,
    showSearchBox: Boolean                 = false,
    ref:           U[String]               = "",
    key:           js.Any                  = "dude",
    style:         Style                   = new Style {}) =

    component.set(key, ref)(
      Props(root, openByDefault, onItemSelect, showSearchBox, style)
    )
}

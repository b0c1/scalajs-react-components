package chandu0101.scalajs.react.components
package demo.components.reacttreeview

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.treeviews.{ReactTreeView, TreeItem}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom


/**
 * Created by chandrasekharkode .
 */
object ReactTreeViewDemo {

  val code =
    """
      | val data = TreeItem("root",
      |    TreeItem("dude1",
      |        TreeItem("dude1c")),
      |    TreeItem("dude2"),
      |    TreeItem("dude3"),
      |    TreeItem("dude4",
      |      TreeItem("dude4c",
      |        TreeItem("dude4cc")))
      |  )
      |ReactTreeView(root = data, openByDefault = true, onItemSelect = B.onItemSelect ,showSearchBox = true),
      |
    """.stripMargin

  object Style {
    def treeViewDemo = Seq(^.display := "flex")

    def selectedContent = Seq(^.alignSelf := "center", ^.margin := "0 40px")
  }

  case class State(content: String = "")

  case class Backend(t: BackendScope[Unit, State]) {
    val onItemSelect: StringStringIntCbAny = {
      case (item, parent, depth) =>
        val content =
          s"""Selected Item : $item <br>
              |Its Parent  : $parent <br>
              |Its depth :  $depth <br> """.stripMargin
        CallbackTo(dom.document.getElementById("treeviewcontent").innerHTML = content)
    }

    def render(S: State) = {
      <.div(
        <.h3("Demo"),
        CodeExample(code)(
          <.div(Style.treeViewDemo)(
            ReactTreeView(root = data, openByDefault = true, onItemSelect = onItemSelect, showSearchBox = false),
            <.strong(^.id := "treeviewcontent", Style.selectedContent)
          )
        )
      )
    }
  }

  val component = ReactComponentB[Unit]("ReactTreeViewDemo")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.state))
    .buildU

  lazy val data = TreeItem("root",
    TreeItem("dude1",
        TreeItem("dude1c")),
    TreeItem("dude2"),
    TreeItem("dude3"),
    TreeItem("dude4",
      TreeItem("dude4c",
        TreeItem("dude4cc")))
  )

  def apply() = component()

}

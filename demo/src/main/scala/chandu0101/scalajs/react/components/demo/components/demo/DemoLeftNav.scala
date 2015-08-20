package chandu0101.scalajs.react.components
package demo.components.demo

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react._
import scala.scalajs.js

/**
 * Created by chandrasekharkode .
 */
object DemoLeftNav {

  case class Menu(text: String, route: String)

  trait Style {

    def leftNav: TagMod = Seq[TagMod](^.display := "flex", ^.flexDirection := "column")

    def menuItem: TagMod = Seq(
      ^.lineHeight := "48px",
      ^.padding := "0 25px",
      ^.color := "black",
//    ^.width := "190px",
      ^.textDecoration := "none"
    )

    def selectedMenuItem: TagMod = Seq(
      ^.color := "red",
      ^.fontWeight := 500
    )

    def menuItemHover: TagMod = Seq(
      ^.color := "#555555",
      ^.backgroundColor := "#ecf0f1"
    )

  }


  case class State(hoveredItem: String = "")

  case class Backend(t: BackendScope[Props, State]) {

    def onMouseEnterCb(item: String) = {
      t.modState(_.copy(hoveredItem = item))
    }

    val onMouseLeaveCb = {
      t.modState(_.copy(hoveredItem = ""))
    }

    def render(P: Props, S: State) = {
      <.div(P.style.leftNav)(
        P.menu.map { item => {
          val selected = item.text == P.selectedItem
          val hover = S.hoveredItem == item.text
          <.a(
            ^.key := item.text,
            P.style.menuItem,
            selected ?= P.style.selectedMenuItem,
            hover ?= P.style.menuItemHover,
            onMouseEnter --> onMouseEnterCb(item.text),
            ^.onMouseOut --> onMouseLeaveCb,
            ^.href := item.route,
            item.text
          )
        }
        }
      )
    }
  }

  val component = ReactComponentB[Props]("DemoLeftNav")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.props, $.state))
    .build

  case class Props(menu: List[Menu], selectedItem: String, style: Style)


  def apply(menu: List[Menu], selectedItem: String = "", style: Style = new Style {}, ref: U[String] = "", key: js.Any = {}) = component.set(key, ref)(Props(menu, selectedItem, style))


}

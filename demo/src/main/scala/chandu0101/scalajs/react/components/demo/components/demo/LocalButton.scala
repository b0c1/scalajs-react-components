package chandu0101.scalajs.react.components
package demo.components.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

/**
 * Created by chandrasekharkode .
 */
object LocalDemoButton {

  trait Style {

    val button = Seq(^.backgroundColor := "#F2706D",
      ^.border := "1px solid transparent",
      ^.boxShadow := "0 1px 3px 0 rgba(0, 0, 0, 0.12), 0 1px 2px 0 rgba(0, 0, 0, 0.24)",
      ^.color := "#F5F4F4",
      ^.cursor := "pointer",
      ^.display := "inline-block",
      ^.fontSize := "15px",
      ^.textDecoration := "none",
      ^.padding := "5px 7px",
      WebkitBoxShadow := "0 1px 3px 0 rgba(0, 0, 0, 0.12), 0 1px 2px 0 rgba(0, 0, 0, 0.24)")

    val buttonHover: TagMod = Seq(^.backgroundColor := "#DA423E",
      ^.textDecoration := "none")


  }

  case class State(buttonHover: Boolean = false)

  case class Backend(t: BackendScope[Props, State]) {

    val onButtonClickCb: REventICb =
      e => t.props.onButtonClick.mapply(e).voidU >> e.preventDefaultCB

    val onMouseEnterCb: Callback =
      t.modState(_.copy(buttonHover = true))

    val onMouseLeaveCb: Callback =
      t.modState(_.copy(buttonHover = false))

    def render(P: Props, S: State) = {
      val buttonStyle = styleSet1(P.style.button, P.style.buttonHover -> S.buttonHover)
      if (P.linkButton)<.a(buttonStyle, ^.href := P.href,^.target := "_blank", onMouseEnter --> onMouseEnterCb, onMouseLeave --> onMouseLeaveCb)(P.name)
      else <.a(
        buttonStyle,
        ^.onClick    ==>? P.onButtonClick.liftParam,
        onMouseEnter -->  onMouseEnterCb,
        onMouseLeave -->  onMouseLeaveCb)(P.name)

    }
  }

  val component = ReactComponentB[Props]("LocalDemoButton")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.props, $.state))
    .build

  case class Props(name: String, onButtonClick: U[REventHCb], linkButton: Boolean, href: String, style: Style)

  def apply(name: String, onButtonClick: U[REventHCb] = uNone, linkButton: Boolean = false, href: String = "", style: Style = new Style {}, ref: U[String] = "", key: js.Any = {}) = component.set(key, ref)(Props(name, onButtonClick, linkButton, href, style))

}

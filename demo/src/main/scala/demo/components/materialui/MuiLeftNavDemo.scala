package demo
package components
package materialui

import chandu0101.macros.tojs.GhPagesMacros
import chandu0101.scalajs.react.components._
import chandu0101.scalajs.react.components.materialui._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

object MuiLeftNavDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val menuItems = js.Array(
    MuiMenuItemJson(route = "get-started", text = "Get-started"),
    MuiMenuItemJson(route = "toggle", text = "Toggle", toggle = true, selected = true),
    MuiMenuItemJson(`type` = MuiMenuItemType.SUBHEADER, text = "Resources"),
    MuiMenuItemJson(`type` = MuiMenuItemType.LINK, disabled = true, text = "Github", payload = "https://github.com/chandu0101/scalajs-react-components")
  )

  case class State(isDocked: Boolean = false)

  class Backend(t: BackendScope[Unit, State]) {
    val dockedLeftRef = RefHolder[MuiLeftNavM]
    val leftRef = RefHolder[MuiLeftNavM]

    val handleDockedLeftNav: ReactEventH => Callback =
      e => dockedLeftRef().map(_.toggle()) >>
        t.modState(s => s.copy(isDocked = !s.isDocked))

    val handleHidableLeftNav: ReactEventH => Callback =
      e => leftRef().map(_.toggle())

    def render(S: State) = {
      <.div(
        CodeExample(code, "MuiAppBar")(
          <.div(
            MuiLeftNav(
              ref = leftRef.set,
              menuItems = menuItems,
              docked = false,
              onChange = DummyEvents.f3("onChange"),
              onNavOpen = DummyEvents.f0("onNavOpen"),
              onNavClose = DummyEvents.f0("onNavClose"),
              openRight = false
            )(),
            MuiLeftNav(
              ref = dockedLeftRef.set,
              menuItems = menuItems,
              docked = S.isDocked,
              onChange = DummyEvents.f3("onChange"))(),
            MuiRaisedButton(label = "Show Hideable Left Nav", onTouchTap = handleHidableLeftNav)(),
            <.br(),
            <.br(),
            MuiRaisedButton(centerRipple = S.isDocked, label = "Toggle Docked Left Nav", onTouchTap = handleDockedLeftNav)()
          )
        )
      )
    }
  }

  val component = ReactComponentB[Unit]("MuiLeftNavDemo")
    .initialState(State())
    .renderBackend[Backend]
    .buildU

  // EXAMPLE:END

  def apply() = component()
}

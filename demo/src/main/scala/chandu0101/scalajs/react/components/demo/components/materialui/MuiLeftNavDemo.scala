package chandu0101.scalajs.react.components
package demo.components.materialui

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.materialui._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

object MuiLeftNavDemo {

  val code =
    """
      | lazy val menuItems = js.Array(
      |    MuiMenuItem(route = "get-started", text = "Get-started"),
      |    MuiMenuItem(`type` = MuiMenuItemType.SUBHEADER, text = " Resources"),
      |    MuiMenuItem(`type` = MuiMenuItemType.LINK,
      |      text = "Github",
      |      payload = "https://github.com/chandu0101/scalajs-react-components")
      |  )
      |  // hidebale left nav
      |    MuiLeftNav(ref = "leftnav",
      |            menuItems = menuItems,docked = false
      |          ),
      |
      |    MuiLeftNav(ref = "leftnavdocked",
      |            menuItems = menuItems,docked = S.isDocked
      |      ),
      |
    """.stripMargin


  lazy val menuItems = js.Array(
    MuiMenuItem(route = "get-started", text = "Get-started"),
    MuiMenuItem(`type` = MuiMenuItemType.SUBHEADER, text = " Resources"),
    MuiMenuItem(`type` = MuiMenuItemType.LINK,
      text = "Github",
      payload = "https://github.com/chandu0101/scalajs-react-components")
  )

  lazy val dockedLeftnavRef = Ref.toJS[MuiLeftNavM]("leftnavdocked")

  lazy val nondockedLeftnavRef = Ref.toJS[MuiLeftNavM]("leftnav")

  case class State(isDocked : Boolean = false)

  case class Backend(t: BackendScope[Unit, State]) {

    val handleDockedLeftNav: ReactEvent => Callback = {
      e =>
        Callback(dockedLeftnavRef(t).get.toggle()) >>
        t.modState(s => s.copy(isDocked = !s.isDocked))
    }

    val handleHidableLeftNav: ReactEvent => Callback =
      e => Callback(nondockedLeftnavRef(t).get.toggle())

    def render(S: State) = {
      <.div(
        CodeExample(code, "MuiAppBar")(
          <.div(
            MuiLeftNav(
              ref = "leftnav", menuItems = menuItems, docked = false
            ),
            MuiLeftNav(
              ref = "leftnavdocked", menuItems = menuItems, docked = S.isDocked
            ),
            MuiRaisedButton(label = "Toggle Docked Left Nav", onTouchTap = handleDockedLeftNav)(),
            <.br(),
            <.br(),
            MuiRaisedButton(label = "Show Hideable Left Nav", onTouchTap = handleHidableLeftNav)()
          )
        )
      )
    }
  }

  val component = ReactComponentB[Unit]("MuiLeftNavDemo")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.state))
    .buildU

  def apply() = component()
}

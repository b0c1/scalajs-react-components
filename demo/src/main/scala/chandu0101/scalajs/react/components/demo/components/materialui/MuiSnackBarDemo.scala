package chandu0101.scalajs.react.components
package demo.components.materialui

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.materialui.{MuiRaisedButton, MuiSnackBarM, MuiSnackBar, MuiAppBar}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom

import scala.scalajs.js

object MuiSnackBarDemo {

  val code =
    """
      |  MuiSnackBar(message = " Event added to your calender",
      |          action = "undo",
      |          ref = "snackbar",
      |          onActionTouchTap = B.handleAction _)
      |
    """.stripMargin

  case class Backend(t : BackendScope[Unit, Unit]) {

    val handleAction: ReactEvent => Callback =
      e => Callback(dom.window.alert("We removed Event from your cal"))

    val buttonClick: ReactEvent => Callback =
      e => Callback(snackBarRef(t).get.show())

    def render = {
      <.div(
        CodeExample(code, "MuiSnackBar")(
          MuiSnackBar(message = "Event added to your calender",
            action = "undo",
            ref = "snackbar",
            onActionTouchTap = handleAction),
          MuiRaisedButton(label = "Snack Bar Demo", onTouchTap = buttonClick)()
        )
      )
    }
  }

  val snackBarRef = Ref.toJS[MuiSnackBarM]("snackbar")

  val component = ReactComponentB[Unit]("MuiAppBarDemo")
    .stateless
    .backend(Backend)
    .render(_.backend.render)
    .buildU

  def apply() = component()
}

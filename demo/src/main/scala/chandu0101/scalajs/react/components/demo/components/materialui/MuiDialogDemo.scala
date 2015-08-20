package chandu0101.scalajs.react.components
package demo.components.materialui

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.fascades.LatLng
import chandu0101.scalajs.react.components.materialui._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

object MuiDialogDemo {

  val code =
    """
      | val actions : js.Array[ReactElement] = js.Array(
      |     MuiFlatButton(label = "Cancel",secondary = true,onTouchTap = B.handleDialogCancel _)(),
      |     MuiFlatButton(label = "Submit",secondary = true,onTouchTap = B.handleDialogSubmit _)()
      |    )
      |  MuiDialog(title = "Dialog With Actions",
      |          actions = actions,
      |          ref = "dialogref")(
      |            "Dialog example with floating buttons"
      |          )
      |
    """.stripMargin

  case class Backend(t : BackendScope[_,_]) {
    def handleDialogCancel(e : ReactEventH) =
      Callback(println("Cancel Clicked"))      >>
      Callback(dialogRef.foreach(_.dismiss()))

    def handleDialogSubmit(e : ReactEventH) =
      Callback(println("Submit Clicked"))      >>
      Callback(dialogRef.foreach(_.dismiss()))

    def openDialog(e : ReactEventH) =
      Callback(dialogRef.foreach(_.show()))

    def render = {
      val actions : js.Array[ReactElement] = js.Array(
       MuiFlatButton(label = "Cancel",secondary = true, onTouchTap = handleDialogCancel _)(),
       MuiFlatButton(label = "Submit",secondary = true, onTouchTap = handleDialogSubmit _)()
      )
      <.div(
        CodeExample(code,"MuiDialog")(
        <.div(
          MuiDialog(title = "Dialog With Actions",
            actions = actions,
            ref = (d: MuiDialogM) => dialogRef = d)(
              "Dialog example with floating buttons"
            ),
          MuiRaisedButton(label = "Dialog", onTouchTap = openDialog _)()
        )
        )
      )
    }
  }

  var dialogRef: U[MuiDialogM] = uNone

  val component = ReactComponentB[Unit]("MuiDialogDemo")
    .stateless
    .backend(Backend)
    .render(_.backend.render)
    .buildU

  def apply() = component()

}

package chandu0101.scalajs.react.components
package demo.components.materialui

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.fascades.LatLng
import chandu0101.scalajs.react.components.materialui.{MuiDatePickerMode, MuiDatePicker, MuiAppBar}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom

import scala.scalajs.js

object MuiDatePickerDemo {

  val code =
    """
      | MuiDatePicker(hintText = "Protrait Dialog"),
      | MuiDatePicker(hintText = "Landscape Dialog",mode = MuiDatePickerMode.LANDSCAPE)
      |
    """.stripMargin

  val component = ReactComponentB[Unit]("MuiDatePickerDemo")
    .render(P => {
    <.div(
      CodeExample(code,"MuiDatePicker")(
       MuiDatePicker(hintText = "Protrait Dialog"),
       MuiDatePicker(
         hintText = "Landscape Dialog",
         mode = MuiDatePickerMode.LANDSCAPE,
         onDismiss = Callback(dom.console.info("dismiss")),
         onShow = Callback(dom.console.info("show")),
         onChange = (d1: js.Date, d2: js.Date) => Callback(dom.alert(s"change: $d1, $d2")),
         shouldDisableDate = (d: js.Date) => d.getDay() == 1,
         formatDate = (d: js.Date) => d.toDateString().toUpperCase
       )
      )
    )
  }).buildU

  def apply() = component()
}

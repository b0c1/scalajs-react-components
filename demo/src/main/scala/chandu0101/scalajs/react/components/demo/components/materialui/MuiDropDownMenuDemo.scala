package chandu0101.scalajs.react.components
package demo.components.materialui

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.materialui.MuiDropdownMenu
import chandu0101.scalajs.react.components.materialui.MuiDropdownMenu.Item
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

object MuiDropDownMenuDemo {

  val code =
    """
      | val menuItems = js.Array(
      |      MuiDropdownMenu.Item(payload = "1",text = "Never"),
      |      MuiDropdownMenu.Item(payload = "2",text = "Every Night"),
      |      MuiDropdownMenu.Item(payload = "3",text = "Weeknights"),
      |      MuiDropdownMenu.Item(payload = "4",text = "Weekends"),
      |      MuiDropdownMenu.Item(payload = "5",text = "Weekly")
      |    )
      |
      | MuiDropdownMenu(menuItems = menuItems)
      |
    """.stripMargin


  val component = ReactComponentB[Unit]("MuiDropDownMenuDemo")
    .render(P => {
    val menuItems = js.Array(
      MuiDropdownMenu.Item(payload = "1",text = "Never"),
      MuiDropdownMenu.Item(payload = "2",text = "Every Night"),
      MuiDropdownMenu.Item(payload = "3",text = "Weeknights"),
      MuiDropdownMenu.Item(payload = "4",text = "Weekends"),
      MuiDropdownMenu.Item(payload = "5",text = "Weekly")
    )
    val onChange: (ReactEvent, Int, Item) => Callback =
      (e, idx, item) => Callback.info(s"Selected $item")

    <.div(
      CodeExample(code, "MuiDropDownMenu")(
        MuiDropdownMenu(menuItems = menuItems, onChange = onChange)
      )
    )
  }).buildU


  def apply() = component()
}

package chandu0101.scalajs.react.components
package demo.components.materialui.svgicons

import chandu0101.scalajs.react.components.materialui.MuiSvgIcon
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all.svg._
import japgolly.scalajs.react.vdom.prefix_<^._

object ActionGrade {


  val component = ReactComponentB[Unit]("ActionGrade")
    .render(P => {
    MuiSvgIcon()(
      path(^.key := "acg", d := "M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z")
    )
  }).buildU

  def apply() = component()
}

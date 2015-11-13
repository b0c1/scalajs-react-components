package chandu0101.scalajs.react.components
package spinners

import japgolly.scalajs.react._
import scala.scalajs.js
import chandu0101.macros.tojs.JSMacro

case class Spinner(key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   className: js.UndefOr[String] = js.undefined) {

  def apply() = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Spinner)
    f(JSMacro[Spinner](this)).asInstanceOf[ReactComponentU_]
  }
}

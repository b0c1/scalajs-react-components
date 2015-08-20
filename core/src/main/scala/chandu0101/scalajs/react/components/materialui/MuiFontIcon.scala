package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
className: React.PropTypes.string,
    hoverColor: React.PropTypes.string

 */
object MuiFontIcon {
  def apply(
    style:      U[js.Any] = uNone,
    ref:        U[String] = uNone,
    key:        U[String] = uNone,
    className:  U[String] = uNone,
    hoverColor: U[String] = uNone) = {

    val p = new TypedJsProps
    style     .foreach(p.setV("style"))
    ref       .foreach(p.setV("ref"))
    key       .foreach(p.setV("key"))
    className .foreach(p.setV("className"))
    hoverColor.foreach(p.setV("hoverColor"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.FontIcon)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

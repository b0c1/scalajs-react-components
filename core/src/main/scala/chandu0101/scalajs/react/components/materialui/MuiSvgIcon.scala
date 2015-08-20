package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
viewBox: React.PropTypes.string

 */
case class MuiSvgIcon(
  key:     U[String] = uNone,
  style:   U[js.Any] = uNone,
  ref:     U[String] = uNone,
  viewBox: U[String] = uNone) {

  def toJS = {
    val p = new TypedJsProps
    key    .foreach(p.setV("key"))
    style  .foreach(p.setV("style"))
    ref    .foreach(p.setV("ref"))
    viewBox.foreach(p.setV("viewBox"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.SvgIcon)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
 className: React.PropTypes.string,
    disabled: React.PropTypes.bool,
    iconClassName: React.PropTypes.string,
    iconStyle: React.PropTypes.js.Any,
    onBlur: React.PropTypes.ReavtEvent => Callback,
    onFocus: React.PropTypes.ReactEvent => Callback,
    tooltip: React.PropTypes.string,
    touch: React.PropTypes.bool,

 */
case class MuiIconButton(
  iconClassName: U[String]                 = uNone,
  onBlur:        U[ReactEvent => Callback] = uNone,
  touch:         U[Boolean]                = uNone,
  style:         U[js.Any]                 = uNone,
  iconStyle:     U[js.Any]                 = uNone,
  ref:           U[String]                 = uNone,
  key:           U[String]                 = uNone,
  className:     U[String]                 = uNone,
  onFocus:       U[ReactEvent => Callback] = uNone,
  disabled:      U[Boolean]                = uNone,
  tooltip:       U[String]                 = uNone) {
  def toJS = {
    val p = new TypedJsProps
    iconClassName.foreach(p.setV("iconClassName"))
    onBlur       .foreach(p.setF1C("onBlur"))
    touch        .foreach(p.setV("touch"))
    style        .foreach(p.setV("style"))
    iconStyle    .foreach(p.setV("iconStyle"))
    ref          .foreach(p.setV("ref"))
    key          .foreach(p.setV("key"))
    className    .foreach(p.setV("className"))
    onFocus      .foreach(p.setF1C("onFocus"))
    disabled     .foreach(p.setV("disabled"))
    tooltip      .foreach(p.setV("tooltip"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.IconButton)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

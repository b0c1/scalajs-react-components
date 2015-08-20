package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
   ref: PropTypes.String,
   route: React.PropTypes.string,
   onActive: React.PropTypes.ReactElement => Callback,
   label: React.PropTypes.string

 * @param label
 * @param onActive
 * @param ref
 * @param key
 * @param route
 */
case class MuiTab(
  style:    U[js.Any]                   = uNone,
  label:    U[String]                   = uNone,
  onActive: U[ReactElement => Callback] = uNone,
  ref:      U[String]                   = uNone,
  key:      U[String]                   = uNone,
  route:    U[String]                   = uNone) {
 
  def toJS = {
    val p = new TypedJsProps
    style   .foreach(p.setV("style"))
    label   .foreach(p.setV("label"))
    onActive.foreach(p.setF1C("onActive"))
    ref     .foreach(p.setV("ref"))
    key     .foreach(p.setV("key"))
    route   .foreach(p.setV("route"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Tab)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

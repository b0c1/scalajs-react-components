package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
style: PropTypes.js.any,
ref: PropTypes.String,
  initialSelectedIndex: React.PropTypes.number,
    onActive: React.PropTypes.(Int,ReactElement) => Callback,
    tabWidth: React.PropTypes.number

 * @param style
 * @param onChange
 * @param ref
 * @param key
 * @param tabWidth
 * @param initialSelectedIndex
 */
case class MuiTabs(
  style:                U[js.Any]                          = uNone,
  onChange:             U[(Int, ReactElement) => Callback] = uNone,
  ref:                  U[String]                          = uNone,
  key:                  U[String]                          = uNone,
  tabWidth:             U[Int]                             = uNone,
  initialSelectedIndex: U[Int]                             = uNone) {
  def toJS = {
    val p = new TypedJsProps
    style               .foreach(p.setV("style"))
    onChange            .foreach(p.setF2C("onChange"))
    ref                 .foreach(p.setV("ref"))
    key                 .foreach(p.setV("key"))
    tabWidth            .foreach(p.setV("tabWidth"))
    initialSelectedIndex.foreach(p.setV("initialSelectedIndex"))
    p
  }

  def apply(children : ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Tabs)
    f(toJS,children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

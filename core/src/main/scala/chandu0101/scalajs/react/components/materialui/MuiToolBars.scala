package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  className: React.PropTypes.string,
 */
case class MuiToolbar(
  key:       U[String] = uNone,
  style:     U[js.Any] = uNone,
  ref:       U[String] = uNone,
  className: U[String] = uNone) {

  def toJS = {
    val p = new TypedJsProps
    key      .foreach(p.setV("key"))
    style    .foreach(p.setV("style"))
    ref      .foreach(p.setV("ref"))
    className.foreach(p.setV("className"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Toolbar)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}


object MuiToolbarSeparator {
  def apply(
    key:   U[String] = uNone,
    style: U[js.Any] = uNone,
    ref:   U[String] = uNone) = {

    val p = new TypedJsProps
    key.  foreach(p.setV("key"))
    style.foreach(p.setV("style"))
    ref.  foreach(p.setV("ref"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.ToolbarSeparator)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  text: React.PropTypes.string,

 */
object MuiToolbarTitle {

  def apply(
    key:   U[String] = uNone,
    style: U[js.Any] = uNone,
    ref:   U[String] = uNone,
    text:  U[String] = uNone) = {

    val p = new TypedJsProps
    key  .foreach(p.setV("key"))
    style.foreach(p.setV("style"))
    ref  .foreach(p.setV("ref"))
    text .foreach(p.setV("text"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.ToolbarTitle)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
 className: React.PropTypes.string,
    float: React.PropTypes.string

 */
case class MuiToolbarGroup(
  float:     U[String] = uNone,
  style:     U[js.Any] = uNone,
  ref:       U[String] = uNone,
  key:       U[String] = uNone,
  className: U[String] = uNone) {

  def toJS = {
    val p = new TypedJsProps
    float    .foreach(p.setV("float"))
    style    .foreach(p.setV("style"))
    ref      .foreach(p.setV("ref"))
    key      .foreach(p.setV("key"))
    className.foreach(p.setV("className"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.ToolbarGroup)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}


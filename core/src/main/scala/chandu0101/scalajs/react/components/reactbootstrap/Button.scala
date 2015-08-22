package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{Callback, React, ReactComponentU_}

import scala.scalajs.js

case class Button(
  bsSize:         U[String]   = uNone,
  onClick:        U[Callback] = uNone,
  navDropdown:    U[Boolean]  = uNone,
  block:          U[Boolean]  = uNone,
  disabled:       U[Boolean]  = uNone,
  bsStyle:        U[String]   = uNone,
  componentClass: U[String]   = uNone,
  navItem:        U[Boolean]  = uNone,
  bsClass:        U[String]   = uNone,
  active:         U[Boolean]  = uNone,
  hrefB:          U[String]   = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    active.foreach(p.setV("active"))
    hrefB.foreach(p.setV("href"))
    navItem.foreach(p.setV("navItem"))
    bsSize.foreach(p.setV("bsSize"))
    navDropdown.foreach(p.setV("navDropdown"))
    bsStyle.foreach(p.setV("bsStyle"))
    disabled.foreach(p.setV("disabled"))
    block.foreach(p.setV("block"))
    onClick.foreach(p.setC("block"))
    bsClass.foreach(p.setV("bsClass"))
    componentClass.foreach(p.setV("componentClass"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Button)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}
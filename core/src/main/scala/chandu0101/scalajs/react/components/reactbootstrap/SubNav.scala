package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class SubNav(
  bsSize:   U[String]  = uNone,
  text:     U[String]  = uNone,
  disabled: U[Boolean] = uNone,
  onSelect: U[js.Any]  = uNone,
  bsStyle:  U[String]  = uNone,
  title:    U[String]  = uNone,
  href:     U[String]  = uNone,
  bsClass:  U[String]  = uNone,
  active:   U[Boolean] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    active  .foreach(p.setV("active"))
    text    .foreach(p.setV("text"))
    onSelect.foreach(p.setV("onSelect"))
    bsSize  .foreach(p.setV("bsSize"))
    bsStyle .foreach(p.setV("bsStyle"))
    disabled.foreach(p.setV("disabled"))
    href    .foreach(p.setV("href"))
    title   .foreach(p.setV("title"))
    bsClass .foreach(p.setV("bsClass"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.SubNav)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

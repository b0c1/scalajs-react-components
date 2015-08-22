package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class ListGroupItem(
  bsSize:   U[String] = uNone,
  onClick:  U[js.Any] = uNone,
  header:   U[String] = uNone,
  disabled: U[js.Any] = uNone,
  bsStyle:  U[String] = uNone,
  eventKey: U[js.Any] = uNone,
  bsClass:  U[String] = uNone,
  active:   U[js.Any] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    active  .foreach(p.setV("active"))
    eventKey.foreach(p.setV("eventKey"))
    onClick .foreach(p.setV("onClick"))
    bsSize  .foreach(p.setV("bsSize"))
    bsStyle .foreach(p.setV("bsStyle"))
    disabled.foreach(p.setV("disabled"))
    bsClass .foreach(p.setV("bsClass"))
    header  .foreach(p.setV("header"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ListGroupItem)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

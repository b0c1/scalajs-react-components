package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Panel(
  bsSize:          U[String]  = uNone,
  defaultExpanded: U[Boolean] = uNone,
  expanded:        U[Boolean] = uNone,
  collapsable:     U[Boolean] = uNone,
  header:          U[String]  = uNone,
  onSelect:        U[js.Any]  = uNone,
  bsStyle:         U[String]  = uNone,
  eventKey:        U[js.Any]  = uNone,
  footer:          U[String]  = uNone,
  bsClass:         U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect       .foreach(p.setV("onSelect"))
    collapsable    .foreach(p.setV("collapsable"))
    expanded       .foreach(p.setV("expanded"))
    eventKey       .foreach(p.setV("eventKey"))
    bsSize         .foreach(p.setV("bsSize"))
    footer         .foreach(p.setV("footer"))
    bsStyle        .foreach(p.setV("bsStyle"))
    bsClass        .foreach(p.setV("bsClass"))
    header         .foreach(p.setV("header"))
    defaultExpanded.foreach(p.setV("defaultExpanded"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Panel)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

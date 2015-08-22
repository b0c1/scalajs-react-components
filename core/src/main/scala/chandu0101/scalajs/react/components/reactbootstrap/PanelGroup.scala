package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class PanelGroup(
  activeKey:        U[js.Any]  = uNone,
  bsSize:           U[String]  = uNone,
  collapsable:      U[Boolean] = uNone,
  defaultActiveKey: U[js.Any]  = uNone,
  onSelect:         U[js.Any]  = uNone,
  bsStyle:          U[String]  = uNone,
  bsClass:          U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    activeKey       .foreach(p.setV("activeKey"))
    defaultActiveKey.foreach(p.setV("defaultActiveKey"))
    onSelect        .foreach(p.setV("onSelect"))
    collapsable     .foreach(p.setV("collapsable"))
    bsSize          .foreach(p.setV("bsSize"))
    bsStyle         .foreach(p.setV("bsStyle"))
    bsClass         .foreach(p.setV("bsClass"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.PanelGroup)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Nav(
  stacked:         U[Boolean] = uNone,
  navbar:          U[Boolean] = uNone,
  justified:       U[Boolean] = uNone,
  defaultExpanded: U[Boolean] = uNone,
  expanded:        U[Boolean] = uNone,
  collapsable:     U[Boolean] = uNone,
  onSelect:        U[js.Any]  = uNone,
  bsStyle:         U[String]  = uNone,
  eventKey:        U[js.Any]  = uNone,
  right:           U[Boolean] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect       .foreach(p.setV("onSelect"))
    navbar         .foreach(p.setV("navbar"))
    collapsable    .foreach(p.setV("collapsable"))
    right          .foreach(p.setV("right"))
    stacked        .foreach(p.setV("stacked"))
    expanded       .foreach(p.setV("expanded"))
    eventKey       .foreach(p.setV("eventKey"))
    justified      .foreach(p.setV("justified"))
    bsStyle        .foreach(p.setV("bsStyle"))
    defaultExpanded.foreach(p.setV("defaultExpanded"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Nav)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

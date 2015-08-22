package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Popover(
  bsSize:          U[String] = uNone,
  positionLeft:    U[Double] = uNone,
  positionTop:     U[Double] = uNone,
  arrowOffsetLeft: U[Double] = uNone,
  placement:       U[String] = uNone,
  bsStyle:         U[String] = uNone,
  title:           U[String] = uNone,
  bsClass:         U[String] = uNone,
  arrowOffsetTop:  U[Double] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    arrowOffsetLeft.foreach(p.setV("arrowOffsetLeft"))
    placement      .foreach(p.setV("placement"))
    positionTop    .foreach(p.setV("positionTop"))
    positionLeft   .foreach(p.setV("positionLeft"))
    bsSize         .foreach(p.setV("bsSize"))
    bsStyle        .foreach(p.setV("bsStyle"))
    title          .foreach(p.setV("title"))
    bsClass        .foreach(p.setV("bsClass"))
    arrowOffsetTop .foreach(p.setV("arrowOffsetTop"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Popover)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

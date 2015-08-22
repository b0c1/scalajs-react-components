package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class TabbedArea(
  bsSize:    U[String]  = uNone,
  animation: U[Boolean] = uNone,
  onSelect:  U[js.Any]  = uNone,
  bsStyle:   U[String]  = uNone,
  bsClass:   U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect .foreach(p.setV("onSelect"))
    bsSize   .foreach(p.setV("bsSize"))
    bsStyle  .foreach(p.setV("bsStyle"))
    bsClass  .foreach(p.setV("bsClass"))
    animation.foreach(p.setV("animation"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.TabbedArea)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

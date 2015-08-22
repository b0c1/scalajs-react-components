package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Modal(
  backdrop:      U[String]  = uNone,
  onRequestHide: U[js.Any],
  keyboard:      U[Boolean] = uNone,
  bsSize:        U[String]  = uNone,
  closeButton:   U[Boolean] = uNone,
  animation:     U[Boolean] = uNone,
  bsStyle:       U[String]  = uNone,
  title:         U[String]  = uNone,
  bsClass:       U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    bsSize       .foreach(p.setV("bsSize"))
    keyboard     .foreach(p.setV("keyboard"))
    bsStyle      .foreach(p.setV("bsStyle"))
    title        .foreach(p.setV("title"))
    bsClass      .foreach(p.setV("bsClass"))
    backdrop     .foreach(p.setV("backdrop"))
    animation    .foreach(p.setV("animation"))
    onRequestHide.foreach(p.setV("onRequestHide"))
    closeButton  .foreach(p.setV("closeButton"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Modal)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

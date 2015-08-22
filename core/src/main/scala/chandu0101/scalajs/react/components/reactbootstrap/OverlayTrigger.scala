package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class OverlayTrigger(
  delay:               U[Double]            = uNone,
  overlay:             U[ReactComponentU_],
  delayShow:           U[Double]            = uNone,
  delayHide:           U[Double]            = uNone,
  placement:           U[String]            = uNone,
  defaultOverlayShown: U[Boolean]           = uNone,
  trigger:             U[String]            = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    delayShow          .foreach(p.setV("delayShow"))
    placement          .foreach(p.setV("placement"))
    delayHide          .foreach(p.setV("delayHide"))
    trigger            .foreach(p.setV("trigger"))
    overlay            .foreach(p.setV("overlay"))
    defaultOverlayShown.foreach(p.setV("defaultOverlayShown"))
    delay              .foreach(p.setV("delay"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.OverlayTrigger)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

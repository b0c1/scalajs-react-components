package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class PageItem(
  previous: U[Boolean] = uNone,
  next:     U[Boolean] = uNone,
  disabled: U[Boolean] = uNone,
  onSelect: U[js.Any]  = uNone,
  eventKey: U[js.Any]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect.foreach(p.setV("onSelect"))
    eventKey.foreach(p.setV("eventKey"))
    next    .foreach(p.setV("next"))
    disabled.foreach(p.setV("disabled"))
    previous.foreach(p.setV("previous"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.PageItem)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

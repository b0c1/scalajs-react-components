package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class MenuItem(
  divider:  U[Boolean] = uNone,
  header:   U[Boolean] = uNone,
  onSelect: U[js.Any]  = uNone,
  title:    U[String]  = uNone,
  href:     U[String]  = uNone,
  eventKey: U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect.foreach(p.setV("onSelect"))
    divider .foreach(p.setV("divider"))
    eventKey.foreach(p.setV("eventKey"))
    href    .foreach(p.setV("href"))
    title   .foreach(p.setV("title"))
    header  .foreach(p.setV("header"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.MenuItem)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

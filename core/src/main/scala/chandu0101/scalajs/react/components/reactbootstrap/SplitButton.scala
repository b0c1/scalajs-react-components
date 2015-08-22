package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class SplitButton(
  bsSize:       U[String]  = uNone,
  onClick:      U[js.Any]  = uNone,
  dropdownTitle:U[String]  = uNone,
  disabled:     U[Boolean] = uNone,
  onSelect:     U[js.Any]  = uNone,
  bsStyle:      U[String]  = uNone,
  title:        U[String]  = uNone,
  href:         U[String]  = uNone,
  pullRight:    U[Boolean] = uNone,
  bsClass:      U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect     .foreach(p.setV("onSelect"))
    dropdownTitle.foreach(p.setV("dropdownTitle"))
    pullRight    .foreach(p.setV("pullRight"))
    onClick      .foreach(p.setV("onClick"))
    bsSize       .foreach(p.setV("bsSize"))
    bsStyle      .foreach(p.setV("bsStyle"))
    disabled     .foreach(p.setV("disabled"))
    href         .foreach(p.setV("href"))
    title        .foreach(p.setV("title"))
    bsClass      .foreach(p.setV("bsClass"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.SplitButton)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

// TODO  onClick:   React.PropTypes.func,
//  onSelect:  React.PropTypes.func,
case class DropdownButton(
  bsSize:    U[String]  = uNone,
  onClick:   U[js.Any]  = uNone,
  dropup:    U[Boolean] = uNone,
  onSelect:  U[js.Any]  = uNone,
  bsStyle:   U[String]  = uNone,
  title:     U[String]  = uNone,
  href:      U[String]  = uNone,
  navItem:   U[Boolean] = uNone,
  pullRight: U[Boolean] = uNone,
  bsClass:   U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect.foreach(p.setV("onSelect"))
    navItem.foreach(p.setV("navItem"))
    pullRight.foreach(p.setV("pullRight"))
    onClick.foreach(p.setV("onClick"))
    bsSize.foreach(p.setV("bsSize"))
    bsStyle.foreach(p.setV("bsStyle"))
    href.foreach(p.setV("href"))
    title.foreach(p.setV("title"))
    dropup.foreach(p.setV("dropup"))
    bsClass.foreach(p.setV("bsClass"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.DropdownButton)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

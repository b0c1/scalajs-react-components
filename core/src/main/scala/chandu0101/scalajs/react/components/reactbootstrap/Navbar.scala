package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Navbar(
  onToggle:           U[js.Any]  = uNone,
  toggleButton:       U[String]  = uNone,
  bsSize:             U[String]  = uNone,
  fluid:              U[Boolean] = uNone,
  role:               U[String]  = uNone,
  fixedTop:           U[Boolean] = uNone,
  staticTop:          U[Boolean] = uNone,
  navExpanded:        U[Boolean] = uNone,
  brand:              U[String]  = uNone,
  inverse:            U[Boolean] = uNone,
  fixedBottom:        U[Boolean] = uNone,
  defaultNavExpanded: U[Boolean] = uNone,
  bsStyle:            U[String]  = uNone,
  componentClass:     U[String],
  bsClass:            U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    defaultNavExpanded.foreach(p.setV("defaultNavExpanded"))
    navExpanded       .foreach(p.setV("navExpanded"))
    inverse           .foreach(p.setV("inverse"))
    onToggle          .foreach(p.setV("onToggle"))
    staticTop         .foreach(p.setV("staticTop"))
    bsSize            .foreach(p.setV("bsSize"))
    bsStyle           .foreach(p.setV("bsStyle"))
    fixedBottom       .foreach(p.setV("fixedBottom"))
    fixedTop          .foreach(p.setV("fixedTop"))
    bsClass           .foreach(p.setV("bsClass"))
    componentClass    .foreach(p.setV("componentClass"))
    role              .foreach(p.setV("role"))
    toggleButton      .foreach(p.setV("toggleButton"))
    fluid             .foreach(p.setV("fluid"))
    brand             .foreach(p.setV("brand"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Navbar)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

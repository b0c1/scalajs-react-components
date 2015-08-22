package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class ButtonGroup(
  justified:U[Boolean] = uNone,
  bsSize:   U[String]  = uNone,
  vertical: U[Boolean] = uNone,
  bsStyle:  U[String]  = uNone,
  bsClass:  U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    justified.foreach(p.setV("justified"))
    bsSize   .foreach(p.setV("bsSize"))
    vertical .foreach(p.setV("vertical"))
    bsStyle  .foreach(p.setV("bsStyle"))
    bsClass  .foreach(p.setV("bsClass"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ButtonGroup)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

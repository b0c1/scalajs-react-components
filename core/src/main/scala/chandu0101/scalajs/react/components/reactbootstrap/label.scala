package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class label(
  bsClass: U[String] = uNone,
  bsStyle: U[String] = uNone,
  bsSize:  U[String] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    bsClass.foreach(p.setV("bsClass"))
    bsStyle.foreach(p.setV("bsStyle"))
    bsSize .foreach(p.setV("bsSize"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Label)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

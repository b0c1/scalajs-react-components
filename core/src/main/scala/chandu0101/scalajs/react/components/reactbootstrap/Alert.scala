package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

//TODO  onDismiss: React.PropTypes.func,
case class Alert(
  bsClass:      U[String] = uNone,
  bsStyle:      U[String] = uNone,
  bsSize:       U[String] = uNone,
  dismissAfter: U[Double] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    bsClass.foreach(p.setV("bsClass"))
    bsStyle.foreach(p.setV("bsStyle"))
    bsSize.foreach(p.setV("bsSize"))
    dismissAfter.foreach(p.setV("dismissAfter"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Alert)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

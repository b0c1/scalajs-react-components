package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

//TODO onClick: React.PropTypes.func
case class ListGroup(onClick: U[js.Any] = uNone) {
  def toJs: js.Any = {
    val p = new TypedJsProps
    onClick.foreach(p.setV("onClick"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ListGroup)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

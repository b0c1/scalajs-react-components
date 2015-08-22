package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

//TODO   onSelect: React.PropTypes.func
case class DropdownMenu(
  pullRight: U[Boolean] = uNone,
  onSelect:  U[js.Any]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    pullRight.foreach(p.setV("pullRight"))
    onSelect.foreach(p.setV("onSelect"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.DropdownMenu)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

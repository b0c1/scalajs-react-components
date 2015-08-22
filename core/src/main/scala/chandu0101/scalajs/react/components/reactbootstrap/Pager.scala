package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Pager(onSelect: U[js.Any] = uNone) {
  def toJs: js.Any = {
    val p = new TypedJsProps
    onSelect.foreach(p.setV("onSelect"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Pager)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

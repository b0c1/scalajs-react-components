package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Badge(pullRight: U[Boolean] = uNone) {
  def toJs: js.Any = {
    val p = new TypedJsProps
    pullRight.foreach(p.setV("pullRight"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Badge)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

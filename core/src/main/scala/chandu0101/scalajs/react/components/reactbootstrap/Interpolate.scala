package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Interpolate(format: U[String] = uNone) {
  def toJs: js.Any = {
    val p = new TypedJsProps
    format.foreach(p.setV("format"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Interpolate)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

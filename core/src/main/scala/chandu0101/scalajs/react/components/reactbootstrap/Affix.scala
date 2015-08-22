package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Affix(
  offset:       U[Double] = uNone,
  offsetTop:    U[Double] = uNone,
  offsetBottom: U[Double] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    offset      .foreach(p.setV("offset"))
    offsetTop   .foreach(p.setV("offsetTop"))
    offsetBottom.foreach(p.setV("offsetBottom"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Affix)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

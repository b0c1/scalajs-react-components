package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class ProgressBar(
  label:   U[String]  = uNone,
  bsStyle: U[String]  = uNone,
  key:     U[Int]     = uNone,
  striped: U[Boolean] = uNone,
  min:     U[Double]  = uNone,
  now:     U[Double]  = uNone,
  max:     U[Double]  = uNone,
  srOnly:  U[Boolean] = uNone,
  active:  U[Boolean] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    label  .foreach(p.setV("label"))
    bsStyle.foreach(p.setV("bsStyle"))
    key    .foreach(p.setV("key"))
    active .foreach(p.setV("active"))
    max    .foreach(p.setV("max"))
    striped.foreach(p.setV("striped"))
    now    .foreach(p.setV("now"))
    srOnly .foreach(p.setV("srOnly"))
    min    .foreach(p.setV("min"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ProgressBar)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

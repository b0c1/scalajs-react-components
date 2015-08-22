package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class table(
  bordered:   U[Boolean] = uNone,
  hover:      U[Boolean] = uNone,
  striped:    U[Boolean] = uNone,
  condensed:  U[Boolean] = uNone,
  responsive: U[Boolean] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    bordered  .foreach(p.setV("bordered"))
    striped   .foreach(p.setV("striped"))
    condensed .foreach(p.setV("condensed"))
    responsive.foreach(p.setV("responsive"))
    hover     .foreach(p.setV("hover"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Table)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

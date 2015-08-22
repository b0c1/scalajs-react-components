package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Jumbotron() {
  def toJs: js.Any = {
    val p = new TypedJsProps
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Jumbotron)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Accordion() {
  def toJs: js.Any = {
    val p = new TypedJsProps
    p
  }

  def apply(): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Accordion)
    f(toJs).asInstanceOf[ReactComponentU_]
  }
}

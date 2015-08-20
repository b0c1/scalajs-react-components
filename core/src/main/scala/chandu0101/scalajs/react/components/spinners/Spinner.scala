package chandu0101.scalajs.react.components
package spinners

import japgolly.scalajs.react._

import scala.scalajs.js

object Spinner {

  def apply(
    key:       U[String] = uNone,
    ref:       U[String] = uNone,
    className: U[String] = uNone) = {

    val p = new TypedJsProps
    key      .foreach(p.setV("key"))
    ref      .foreach(p.setV("ref"))
    className.foreach(p.setV("className"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Spinner)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

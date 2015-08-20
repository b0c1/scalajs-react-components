package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js


object MuiAvatar {

  def apply(
    backgroundColor: U[String]       = uNone,
    style:           U[js.Any]       = uNone,
    icon:            U[ReactElement] = uNone,
    ref:             U[String]       = uNone,
    color:           U[String]       = uNone,
    key:             U[String]       = uNone,
    src:             U[String]       = uNone) = {

    val p = new TypedJsProps
    backgroundColor.foreach(p.setV("backgroundColor"))
    style          .foreach(p.setV("style"))
    icon           .foreach(p.setV("icon"))
    ref            .foreach(p.setV("ref"))
    color          .foreach(p.setV("color"))
    key            .foreach(p.setV("key"))
    src            .foreach(p.setV("src"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Avatar)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

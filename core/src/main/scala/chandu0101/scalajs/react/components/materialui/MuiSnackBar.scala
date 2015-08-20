package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

object MuiSnackBar {
  def apply(
    openOnMount:      U[Boolean]                = uNone,
    style:            U[js.Any]                 = uNone,
    ref:              U[String]                 = uNone,
    key:              U[String]                 = uNone,
    onActionTouchTap: U[ReactEvent => Callback] = uNone,
    message:          String,
    action:           U[String]                 = uNone) = {

    val p = new TypedJsProps
    openOnMount     .foreach(p.setV("openOnMount"))
    style           .foreach(p.setV("style"))
    ref             .foreach(p.setV("ref"))
    key             .foreach(p.setV("key"))
    onActionTouchTap.foreach(p.setF1C("onActionTouchTap"))
    p.setV("message")(message)
    action          .foreach(p.setV("action"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Snackbar)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

trait MuiSnackBarM extends js.Object {

  def dismiss(): Unit = js.native

  def show(): Unit = js.native

}
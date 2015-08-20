package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js


/**
 * key: PropTypes.string,
    style: PropTypes.js.Any,
    ref: PropTypes.String,
    title: React.PropTypes.string,
    contentInnerStyle: React.PropTypes.js.Any,
actions: React.PropTypes.js.Array[ReactElement],
    actionFocus: React.PropTypes.string,
    contentClassName: React.PropTypes.string,
    contentStyle: React.PropTypes.js.Any,
    openImmediately: React.PropTypes.bool,
    onDismiss: React.PropTypes.Callback,
    onShow: React.PropTypes.Callback,
    repositionOnUpdate: React.PropTypes.bool,
    modal: React.PropTypes.bool
 */
case class MuiDialog(
  contentClassName:   U[String]                 = uNone,
  modal:              U[Boolean]                = uNone,
  onDismiss:          U[Callback]               = uNone,
  onShow:             U[Callback]               = uNone,
  openImmediately:    U[Boolean]                = uNone,
  style:              U[js.Any]                 = uNone,
  ref:                U[MuiDialogM => Unit]      = uNone,
  key:                U[String]                 = uNone,
  actions:            U[js.Array[ReactElement]] = uNone,
  contentInnerStyle:  U[js.Any]                 = uNone,
  contentStyle:       U[js.Any]                 = uNone,
  title:              U[String]                 = uNone,
  actionFocus:        U[String]                 = uNone,
  repositionOnUpdate: U[Boolean]                = uNone) {

  def toJS = {
    val p = new TypedJsProps
    contentClassName  .foreach(p.setV("contentClassName"))
    modal             .foreach(p.setV("modal"))
    onDismiss         .foreach(p.setC("onDismiss"))
    onShow            .foreach(p.setC("onShow"))
    openImmediately   .foreach(p.setV("openImmediately"))
    style             .foreach(p.setV("style"))
    ref               .foreach(p.setV("ref"))
    key               .foreach(p.setV("key"))
    actions           .foreach(p.setV("actions"))
    contentInnerStyle .foreach(p.setV("contentInnerStyle"))
    contentStyle      .foreach(p.setV("contentStyle"))
    title             .foreach(p.setV("title"))
    actionFocus       .foreach(p.setV("actionFocus"))
    repositionOnUpdate.foreach(p.setV("repositionOnUpdate"))
    p
  }

  def apply(children : ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Dialog)
    f(toJS,children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}


trait MuiDialogM extends js.Object {

  def dismiss(): Unit = js.native

  def show(): Unit = js.native
}

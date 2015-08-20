package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.{Date => JDate}


///**
// *
//key: PropTypes.string,
//    style: PropTypes.js.Any,
//    ref: PropTypes.String,
//    hintText: PropTypes.String,
//    defaultDate: React.PropTypes.JDate,
//    formatDate: React.PropTypes. JDate => String,
//    mode: React.PropTypes.MuiDatePickerMode,
//    onFocus: React.PropTypes. ReactEventI => Callback,
//    onTouchTap: React.PropTypes.ReactEventI => Callback,
//    onChange: React.PropTypes.(JDate,JDate) => Callback
//    onShow: React.PropTypes.Callback,
//    onDismiss: React.PropTypes.Callback,
//    minDate: React.PropTypes.JDate,
//    maxDate: React.PropTypes.JDate,
//    shouldDisableDate: React.PropTypes.func,
//    hideToolbarYearChange: React.PropTypes.bool,
//    autoOk: React.PropTypes.bool,
//    showYearSelector: React.PropTypes.bool
// */
//


object MuiDatePicker {

  def apply(
    defaultDate:           U[JDate]                      = uNone,
    onDismiss:             U[Callback]                   = uNone,
    onShow:                U[Callback]                   = uNone,
    style:                 U[js.Any]                     = uNone,
    onChange:              U[(JDate, JDate) => Callback] = uNone,
    autoOk:                U[Boolean]                    = uNone,
    ref:                   U[String]                     = uNone,
    maxDate:               U[JDate]                      = uNone,
    hintText:              U[String]                     = uNone,
    shouldDisableDate:     U[JDate => Boolean]            = uNone,
    key:                   U[String]                     = uNone,
    hideToolbarYearChange: U[Boolean]                    = uNone,
    minDate:               U[JDate]                      = uNone,
    onTouchTap:            U[ReactEventI => Callback]    = uNone,
    formatDate:            U[JDate => String]            = uNone,
    onFocus:               U[ReactEventI => Callback]    = uNone,
    mode:                  U[MuiDatePickerMode]          = uNone,
    showYearSelector:      U[Boolean]                    = uNone) = {

    val p = new TypedJsProps
    defaultDate          .foreach(p.setV  ("defaultDate"))
    onDismiss            .foreach(p.setC  ("onDismiss"))
    onShow               .foreach(p.setC  ("onShow"))
    style                .foreach(p.setV  ("style"))
    onChange             .foreach(p.setF2C("onChange"))
    autoOk               .foreach(p.setV  ("autoOk"))
    ref                  .foreach(p.setV  ("ref"))
    maxDate              .foreach(p.setV  ("maxDate"))
    hintText             .foreach(p.setV  ("hintText"))
    shouldDisableDate    .foreach(p.setV  ("shouldDisableDate"))
    key                  .foreach(p.setV  ("key"))
    hideToolbarYearChange.foreach(p.setV  ("hideToolbarYearChange"))
    minDate              .foreach(p.setV  ("minDate"))
    onTouchTap           .foreach(p.setF1C("onTouchTap"))
    formatDate           .foreach(p.setV  ("formatDate"))
    onFocus              .foreach(p.setF1C("onFocus"))
    mode                 .foreach(p.setV  ("mode"))
    showYearSelector     .foreach(p.setV  ("showYearSelector"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.DatePicker)
    f(p.p).asInstanceOf[ReactComponentU_]
  }
}

class MuiDatePickerMode private(val value: String) extends ComponentEnum

object MuiDatePickerMode {

  val PROTRAIT =  new MuiDatePickerMode("portrait")

  val LANDSCAPE = new MuiDatePickerMode("landscape")

  def newMode(mode: String ) = new MuiDatePickerMode(mode)

}


trait MuiDatePickerM extends js.Object {

  def getDate(): JDate = js.native

  def setDate(d: JDate): Unit = js.native
}
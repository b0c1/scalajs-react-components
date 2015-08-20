package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.{Date => JDate}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
hintText: PropTypes.String,
 defaultTime: React.PropTypes.JDate,
    format: React.PropTypes.MuiTimePickerFormat,
    onFocus: React.PropTypes.ReactEventI => Callback,
    onTouchTap: React.PropTypes.ReactEventI => Callback,
    onChange: React.PropTypes.(JDate,JDate) => Callback,
    onShow: React.PropTypes.Callback,
    onDismiss: React.PropTypes.Callback,
 */
object MuiTimePicker {
  def apply(
    format:      U[MuiTimePickerFormat]        = uNone,
    onDismiss:   U[Callback]                   = uNone,
    onShow:      U[Callback]                   = uNone,
    style:       U[js.Any]                     = uNone,
    onChange:    U[(JDate, JDate) => Callback] = uNone,
    ref:         U[String]                     = uNone,
    hintText:    U[String]                     = uNone,
    key:         U[String]                     = uNone,
    defaultTime: U[JDate]                      = uNone,
    onTouchTap:  U[ReactEventI => Callback]    = uNone,
    onFocus:     U[ReactEventI => Callback]    = uNone) = {

    val p = new TypedJsProps
    format     .foreach(p.setV("format"))
    onDismiss  .foreach(p.setC("onDismiss"))
    onShow     .foreach(p.setC("onShow"))
    style      .foreach(p.setV("style"))
    onChange   .foreach(p.setF2C("onChange"))
    ref        .foreach(p.setV("ref"))
    hintText   .foreach(p.setV("hintText"))
    key        .foreach(p.setV("key"))
    defaultTime.foreach(p.setV("defaultTime"))
    onTouchTap .foreach(p.setF1C("onTouchTap"))
    onFocus    .foreach(p.setF1C("onFocus"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.TimePicker)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


class MuiTimePickerFormat private(val value: String) extends ComponentEnum

object MuiTimePickerFormat {

  val AM_PM = new MuiTimePickerFormat("ampm")

  val TWENTY_FOUR_HOUR = new MuiTimePickerFormat("24hr")

  def newFormat(format: String) = new MuiTimePickerFormat(format)

}
package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
 errorText: React.PropTypes.string,
    floatingLabelText: React.PropTypes.string,
    hintText: React.PropTypes.string,
    id: React.PropTypes.string,
    multiLine: React.PropTypes.bool,
    disabled: React.PropTypes.bool,
    fullWidth: React.PropTypes.bool,
    onBlur: React.PropTypes.ReactEventI => Callback,
    onChange: React.PropTypes.ReactEventI => Callback,
    onFocus: React.PropTypes.ReactEventI => Callback,
    onKeyDown: React.PropTypes.ReactEventI => Callback,
    onEnterKeyDown: React.PropTypes.ReactEventI => Callback,
    type: React.PropTypes.string,
    rows: React.PropTypes.number,
    value :React.PropTypes.string,
    defaultValue:React.PropTypes.string

 */


object MuiTextField {
  def apply[T](
    onBlur:            U[ReactEventI => Callback] = uNone,
    multiLine:         U[Boolean]                 = uNone,
    fullWidth:         U[Boolean]                 = uNone,
    onEnterKeyDown:    U[ReactEventI => Callback] = uNone,
    onKeyDown:         U[ReactEventI => Callback] = uNone,
    style:             U[js.Any]                  = uNone,
    onChange:          U[ReactEventI => Callback] = uNone,
    ref:               U[String]                  = uNone,
    hintText:          U[String]                  = uNone,
    key:               U[String]                  = uNone,
    id:                U[String]                  = uNone,
    value:             U[T]                       = uNone,
    defaultValue:      U[T]                       = uNone,
    errorText:         U[String]                  = uNone,
    onFocus:           U[ReactEventI => Callback] = uNone,
    disabled:          U[Boolean]                 = uNone,
    floatingLabelText: U[String]                  = uNone,
    `type`:            U[String]                  = uNone,
    rows:              U[Int]                     = uNone) = {

    val p = new TypedJsProps
    onBlur           .foreach(p.setF1C("onBlur"))
    multiLine        .foreach(p.setV("multiLine"))
    fullWidth        .foreach(p.setV("fullWidth"))
    onEnterKeyDown   .foreach(p.setF1C("onEnterKeyDown"))
    onKeyDown        .foreach(p.setF1C("onKeyDown"))
    style            .foreach(p.setV("style"))
    onChange         .foreach(p.setF1C("onChange"))
    ref              .foreach(p.setV("ref"))
    hintText         .foreach(p.setV("hintText"))
    key              .foreach(p.setV("key"))
    id               .foreach(p.setV("id"))
    value            .foreach(v => p.setV("value")(v.asInstanceOf[js.Any]))
    defaultValue     .foreach(v => p.setV("defaultValue")(v.asInstanceOf[js.Any]))
    errorText        .foreach(p.setV("errorText"))
    onFocus          .foreach(p.setF1C("onFocus"))
    disabled         .foreach(p.setV("disabled"))
    floatingLabelText.foreach(p.setV("floatingLabelText"))
    `type`           .foreach(p.setV("type"))
    rows             .foreach(p.setV("rows"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.TextField)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


trait MuiTextFieldM[T] extends js.Object {

  def blur(): Unit = js.native

  def clearValue(): Unit = js.native

  def focus(): Unit = js.native

  def getValue(): T = js.native

  def setValue(newValue: T): Unit = js.native

}
package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js


/**
key: PropTypes.string,
   style: PropTypes.js.Any,
   ref: PropTypes.String,
   className: React.PropTypes.string,
   disabled: React.PropTypes.bool,
   mini: React.PropTypes.bool,
   hoverColor: React.PropTypes.string,
   label: React.PropTypes.string,
   labelStyle: React.PropTypes.js.Any,
   linkButton: React.PropTypes.bool,
   href: React.PropTypes.string,
   iconClassName:React.PropTypes.string,
   rippleColor: React.PropTypes.string,
   iconStyle:PropTypes.js.Any,
   secondary: React.PropTypes.bool,
    onBlur: React.PropTypes.ReactEventH => Callback,
    onFocus: React.PropTypes.ReactEventH => Callback,
    onMouseOut: React.PropTypes.ReactEventH => Callback,
    onMouseOver: React.PropTypes.ReactEventH => Callback,
    onTouchTap: React.PropTypes.ReactEventH => Callback,
  onMouseDown: React.PropTypes.ReactEventH => Callback,
    onMouseUp: React.PropTypes.ReactEventH => Callback,
    onTouchEnd: React.PropTypes.ReactEventH => Callback,
    onTouchStart: React.PropTypes.ReactEventH => Callback,

  */
case class MuiFloatingActionButton(
  iconClassName: U[String]                  = uNone,
  onBlur:        U[ReactEventH => Callback] = uNone,
  labelStyle:    U[js.Any]                  = uNone,
  onTouchStart:  U[ReactEventH => Callback] = uNone,
  mini:          U[Boolean]                 = uNone,
  rippleColor:   U[String]                  = uNone,
  style:         U[js.Any]                  = uNone,
  iconStyle:     U[js.Any]                  = uNone,
  label:         U[String]                  = uNone,
  ref:           U[String]                  = uNone,
  secondary:     U[Boolean]                 = uNone,
  onMouseUp:     U[ReactEventH => Callback] = uNone,
  onTouchEnd:    U[ReactEventH => Callback] = uNone,
  key:           U[String]                  = uNone,
  onMouseOver:   U[ReactEventH => Callback] = uNone,
  linkButton:    U[Boolean]                 = uNone,
  onTouchTap:    U[ReactEventH => Callback] = uNone,
  className:     U[String]                  = uNone,
  onMouseOut:    U[ReactEventH => Callback] = uNone,
  hoverColor:    U[String]                  = uNone,
  onFocus:       U[ReactEventH => Callback] = uNone,
  disabled:      U[Boolean]                 = uNone,
  href:          U[String]                  = uNone,
  onMouseDown:   U[ReactEventH => Callback] = uNone) {
  def toJS = {
    val p = new TypedJsProps
    iconClassName.foreach(p.setV("iconClassName"))
    onBlur       .foreach(p.setF1C("onBlur"))
    labelStyle   .foreach(p.setV("labelStyle"))
    onTouchStart .foreach(p.setF1C("onTouchStart"))
    mini         .foreach(p.setV("mini"))
    rippleColor  .foreach(p.setV("rippleColor"))
    style        .foreach(p.setV("style"))
    iconStyle    .foreach(p.setV("iconStyle"))
    label        .foreach(p.setV("label"))
    ref          .foreach(p.setV("ref"))
    secondary    .foreach(p.setV("secondary"))
    onMouseUp    .foreach(p.setF1C("onMouseUp"))
    onTouchEnd   .foreach(p.setF1C("onTouchEnd"))
    key          .foreach(p.setV("key"))
    onMouseOver  .foreach(p.setF1C("onMouseOver"))
    linkButton   .foreach(p.setV("linkButton"))
    onTouchTap   .foreach(p.setF1C("onTouchTap"))
    className    .foreach(p.setV("className"))
    onMouseOut   .foreach(p.setF1C("onMouseOut"))
    hoverColor   .foreach(p.setV("hoverColor"))
    onFocus      .foreach(p.setF1C("onFocus"))
    disabled     .foreach(p.setV("disabled"))
    href         .foreach(p.setV("href"))
    onMouseDown  .foreach(p.setF1C("onMouseDown"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.FloatingActionButton)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

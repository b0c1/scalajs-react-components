package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * Created by chandrasekharkode .
 *
 * key: PropTypes.string,
   ref: PropTypes.String,
   onLeftIconButtonTouchTap: React.PropTypes.ReactEventH => Callback,
    onRightIconButtonTouchTap: React.PropTypes.ReactEventH => Callback,
    showMenuIconButton: React.PropTypes.bool,
    iconClassNameLeft: React.PropTypes.string,
    iconClassNameRight: React.PropTypes.string,
    iconElementLeft: React.PropTypes.element,
    iconElementRight: React.PropTypes.element,
    iconStyleRight: React.PropTypes.object,
    title : React.PropTypes.string,
    zDepth: React.PropTypes.number,
 */
case class MuiAppBar(
  iconStyleRight:            U[js.Object]               = uNone,
  ref:                       U[String]                  = uNone,
  iconClassNameRight:        U[String]                  = uNone,
  iconClassNameLeft:         U[String]                  = uNone,
  zDepth:                    U[Int]                     = uNone,
  key:                       U[String]                  = uNone,
  iconElementLeft:           U[ReactElement]            = uNone,
  showMenuIconButton:        U[Boolean]                 = uNone,
  title:                     U[String]                  = uNone,
  onLeftIconButtonTouchTap:  U[ReactEventH => Callback] = uNone,
  iconElementRight:          U[ReactElement]            = uNone,
  onRightIconButtonTouchTap: U[ReactEventH => Callback] = uNone) {
  def toJS = {
    val p = new TypedJsProps
    iconStyleRight           .foreach(p.setV("iconStyleRight"))
    ref                      .foreach(p.setV("ref"))
    iconClassNameRight       .foreach(p.setV("iconClassNameRight"))
    iconClassNameLeft        .foreach(p.setV("iconClassNameLeft"))
    zDepth                   .foreach(p.setV("zDepth"))
    key                      .foreach(p.setV("key"))
    iconElementLeft          .foreach(p.setV("iconElementLeft"))
    showMenuIconButton       .foreach(p.setV("showMenuIconButton"))
    title                    .foreach(p.setV("title"))
    onLeftIconButtonTouchTap .foreach(p.setF1C("onLeftIconButtonTouchTap"))
    iconElementRight         .foreach(p.setV("iconElementRight"))
    onRightIconButtonTouchTap.foreach(p.setF1C("onRightIconButtonTouchTap"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.AppBar)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}


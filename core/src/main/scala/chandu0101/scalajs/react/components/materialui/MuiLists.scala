package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  inset: React.PropTypes.bool,

 */
object MuiListDivider {

  def apply(
    key:   U[String]  = uNone,
    style: U[js.Any]  = uNone,
    ref:   U[String]  = uNone,
    inset: U[Boolean] = uNone) = {

    val p = new TypedJsProps
    key  .foreach(p.setV("key"))
    style.foreach(p.setV("style"))
    ref  .foreach(p.setV("ref"))
    inset.foreach(p.setV("inset"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.ListDivider)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
    disableTouchTap: React.PropTypes.bool,
    insetChildren: React.PropTypes.bool,
    leftAvatar: React.PropTypes.element,
    leftCheckbox: React.PropTypes.element,
    leftIcon: React.PropTypes.element,
    onMouseOut: React.PropTypes.ReactEvent => Callback,
    onMouseOver: React.PropTypes.ReactEvent => Callback,
    rightAvatar: React.PropTypes.element,
    rightIcon: React.PropTypes.element,
    rightToggle: React.PropTypes.element,
    secondaryText: React.PropTypes.node,
    secondaryTextLines: React.PropTypes.number

 */
case class MuiListItem(
  secondaryText:      U[ReactElement]           = uNone,
  style:              U[js.Any]                 = uNone,
  disableTouchTap:    U[Boolean]                = uNone,
  insetChildren:      U[Boolean]                = uNone,
  ref:                U[String]                 = uNone,
  rightAvatar:        U[ReactElement]           = uNone,
  leftAvatar:         U[ReactElement]           = uNone,
  key:                U[String]                 = uNone,
  onMouseOver:        U[ReactEvent => Callback] = uNone,
  onMouseOut:         U[ReactEvent => Callback] = uNone,
  secondaryTextLines: U[Int]                    = uNone,
  leftIcon:           U[ReactElement]           = uNone,
  rightIcon:          U[ReactElement]           = uNone,
  rightToggle:        U[ReactElement]           = uNone,
  leftCheckbox:       U[ReactElement]           = uNone) {
  def toJS = {
    val p = new TypedJsProps
    secondaryText     .foreach(p.setV("secondaryText"))
    style             .foreach(p.setV("style"))
    disableTouchTap   .foreach(p.setV("disableTouchTap"))
    insetChildren     .foreach(p.setV("insetChildren"))
    ref               .foreach(p.setV("ref"))
    rightAvatar       .foreach(p.setV("rightAvatar"))
    leftAvatar        .foreach(p.setV("leftAvatar"))
    key               .foreach(p.setV("key"))
    onMouseOver       .foreach(p.setF1C("onMouseOver"))
    onMouseOut        .foreach(p.setF1C("onMouseOut"))
    secondaryTextLines.foreach(p.setV("secondaryTextLines"))
    leftIcon          .foreach(p.setV("leftIcon"))
    rightIcon         .foreach(p.setV("rightIcon"))
    rightToggle       .foreach(p.setV("rightToggle"))
    leftCheckbox      .foreach(p.setV("leftCheckbox"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.ListItem)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
 insetSubheader: React.PropTypes.bool,
    subheader: React.PropTypes.string,
    subheaderStyle: React.PropTypes.js.Any

 *
 */
case class MuiList(
  subheaderStyle: U[js.Any]  = uNone,
  insetSubheader: U[Boolean] = uNone,
  style:          U[js.Any]  = uNone,
  ref:            U[String]  = uNone,
  key:            U[String]  = uNone,
  subheader:      U[String]  = uNone) {

  def toJS = {
    val p = new TypedJsProps
    subheaderStyle.foreach(p.setV("subheaderStyle"))
    insetSubheader.foreach(p.setV("insetSubheader"))
    style         .foreach(p.setV("style"))
    ref           .foreach(p.setV("ref"))
    key           .foreach(p.setV("key"))
    subheader     .foreach(p.setV("subheader"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.List)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js


/**
 *
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
name:PropTypes.String,
defaultChecked:PropTypes.bool,
disabled:PropTypes.bool,
label:PropTypes.String,
labelPosition:PropTypes.MuiSwitchLabelPosition,
value:PropTypes.String,
  iconStyle: React.PropTypes.js.Any,
    onCheck: React.PropTypes.(ReactEventI,Boolean)=>Unit,
  checkedIcon: React.PropTypes.element,
    unCheckedIcon: React.PropTypes.element

 */


object MuiCheckBox {
  def apply(
    name:          U[String]                             = uNone,
    style:         U[js.Any]                             = uNone,
    iconStyle:     U[js.Any]                             = uNone,
    labelPosition: U[MuiSwitchLabelPosition]             = uNone,
    label:         U[String]                             = uNone,
    onCheck:       U[(ReactEventI, Boolean) => Callback] = uNone,
    ref:           U[String]                             = uNone,
    key:           U[String]                             = uNone,
    unCheckedIcon: U[ReactElement]                       = uNone,
    checkedIcon:   U[ReactElement]                       = uNone,
    disabled:      U[Boolean]                            = uNone,
    defaultChecked:U[Boolean]                            = uNone,
    value:         U[String]                             = uNone) = {

    val p = new TypedJsProps
    name          .foreach(p.setV("name"))
    style         .foreach(p.setV("style"))
    iconStyle     .foreach(p.setV("iconStyle"))
    labelPosition .foreach(p.setV("labelPosition"))
    label         .foreach(p.setV("label"))
    onCheck       .foreach(p.setF2C("onCheck"))
    ref           .foreach(p.setV("ref"))
    key           .foreach(p.setV("key"))
    unCheckedIcon .foreach(p.setV("unCheckedIcon"))
    checkedIcon   .foreach(p.setV("checkedIcon"))
    disabled      .foreach(p.setV("disabled"))
    defaultChecked.foreach(p.setV("defaultChecked"))
    value         .foreach(p.setV("value"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Checkbox)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
defaultChecked:PropTypes.bool,
disabled:PropTypes.bool,
label:PropTypes.String,
labelPosition:PropTypes.MuiSwitchLabelPosition,
value:PropTypes.String,
  iconStyle: React.PropTypes.js.Any,

 */

object MuiRadioButton {

  def apply(
    style:          U[js.Any]                 = uNone,
    iconStyle:      U[js.Any]                 = uNone,
    labelPosition:  U[MuiSwitchLabelPosition] = uNone,
    label:          U[String]                 = uNone,
    ref:            U[String]                 = uNone,
    key:            U[String]                 = uNone,
    disabled:       U[Boolean]                = uNone,
    defaultChecked: U[Boolean]                = uNone,
    value:          U[String]                 = uNone) = {

    val p = new TypedJsProps
    style         .foreach(p.setV("style"))
    iconStyle     .foreach(p.setV("iconStyle"))
    labelPosition .foreach(p.setV("labelPosition"))
    label         .foreach(p.setV("label"))
    ref           .foreach(p.setV("ref"))
    key           .foreach(p.setV("key"))
    disabled      .foreach(p.setV("disabled"))
    defaultChecked.foreach(p.setV("defaultChecked"))
    value         .foreach(p.setV("value"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.RadioButton)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
name: React.PropTypes.string.isRequired,
    valueSelected: React.PropTypes.string,
    defaultSelected: React.PropTypes.string,
    labelPosition: React.PropTypes.MuiSwitchLabelPosition,
		onChange: React.PropTypes.(ReactEventI,String) => Callback

 */
case class MuiRadioButtonGroup(
  name:            String,
  style:           U[js.Any]                            = uNone,
  onChange:        U[(ReactEventI, String) => Callback] = uNone,
  labelPosition:   U[MuiSwitchLabelPosition]            = uNone,
  ref:             U[String]                            = uNone,
  key:             U[String]                            = uNone,
  defaultSelected: U[String]                            = uNone,
  valueSelected:   U[String]                            = uNone) {
  def toJS = {
    val p = new TypedJsProps
    p.setV("name")(name)
    style          .foreach(p.setV("style"))
    onChange       .foreach(p.setF2C("onChange"))
    labelPosition  .foreach(p.setV("labelPosition"))
    ref            .foreach(p.setV("ref"))
    key            .foreach(p.setV("key"))
    defaultSelected.foreach(p.setV("defaultSelected"))
    valueSelected  .foreach(p.setV("valueSelected"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.RadioButtonGroup)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

trait MuiRadioButtonGroupM extends js.Object {

  def getSelectedValue(): String = js.native

  def setSelectedValue(value: String): Unit = js.native

  def clearValue(): Unit = js.native


}

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
name: React.PropTypes.string,
label: React.PropTypes.string,
name: React.PropTypes.string,
    labelPosition: React.PropTypes.MuiSwitchLabelPosition,
elementStyle: React.PropTypes.js.Any,
    onToggle: React.PropTypes.(ReactEvent,Boolean) => Callback,
    toggled: React.PropTypes.bool,
    defaultToggled: React.PropTypes.bool,
    disabled: React.PropTypes.bool

 */

object MuiToggle {
  def apply(
    onToggle:       U[(ReactEvent, Boolean) => Callback] = uNone,
    name:           U[String]                            = uNone,
    elementStyle:   U[js.Any]                            = uNone,
    style:          U[js.Any]                            = uNone,
    defaultToggled: U[Boolean]                           = uNone,
    labelPosition:  U[MuiSwitchLabelPosition]            = uNone,
    label:          U[String]                            = uNone,
    ref:            U[String]                            = uNone,
    key:            U[String]                            = uNone,
    disabled:       U[Boolean]                           = uNone,
    value:          U[String]                            = uNone,
    toggled:        U[Boolean]                           = uNone) = {

    val p = new TypedJsProps
    onToggle      .foreach(p.setF2C("onToggle"))
    name          .foreach(p.setV("name"))
    elementStyle  .foreach(p.setV("elementStyle"))
    style         .foreach(p.setV("style"))
    defaultToggled.foreach(p.setV("defaultToggled"))
    labelPosition .foreach(p.setV("labelPosition"))
    label         .foreach(p.setV("label"))
    ref           .foreach(p.setV("ref"))
    key           .foreach(p.setV("key"))
    disabled      .foreach(p.setV("disabled"))
    value         .foreach(p.setV("value"))
    toggled       .foreach(p.setV("toggled"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Toggle)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


trait MuiToggleM extends js.Object {

  def isToggled(): Boolean = js.native

  def setToggled(newToggledValue: Boolean): Unit = js.native

}

class MuiSwitchLabelPosition private(val value: String) extends ComponentEnum

object MuiSwitchLabelPosition {

  val LEFT = new MuiSwitchLabelPosition("left")
  val RIGHT = new MuiSwitchLabelPosition("right")
}

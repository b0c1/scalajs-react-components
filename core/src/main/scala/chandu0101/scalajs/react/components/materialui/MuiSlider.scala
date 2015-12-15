
package chandu0101.scalajs.react.components.materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`
  
case class MuiSlider(
	key:                js.UndefOr[String]                              = js.undefined,
	ref:                js.UndefOr[String]                              = js.undefined,
	/* default: 0: The default value of the slider.*/
	defaultValue:       js.UndefOr[Double]                              = js.undefined,
	/*  Describe the slider.*/
	description:        js.UndefOr[String]                              = js.undefined,
	/* default: false: If true, the slider will not be interactable.*/
	disabled:           js.UndefOr[Boolean]                             = js.undefined,
	/*  An error message for the slider.*/
	error:              js.UndefOr[String]                              = js.undefined,
	/* default: 1: The maximum value the slider can slide to on a scale from 0 to 1 inclusive. Cannot be equal to min.*/
	max:                js.UndefOr[Double]                              = js.undefined,
	/* default: 0: The minimum value the slider can slide to on a scale from 0 to 1 inclusive. Cannot be equal to max.*/
	min:                js.UndefOr[Double]                              = js.undefined,
	/* required: The name of the slider. Behaves like the name attribute of an input element.*/
	name:               String,
	/* default: true: Whether or not the slider is required in a form.*/
	required:           js.UndefOr[Boolean]                             = js.undefined,
	/* default: 0.01: The granularity the slider can step through values.*/
	step:               js.UndefOr[Double]                              = js.undefined,
	/*  Override the inline-styles of the Slider's root element.*/
	style:              js.UndefOr[CssProperties]                       = js.undefined,
	/*  The value of the slider.*/
	value:              js.UndefOr[Double]                              = js.undefined,
	/*  Callback function that is fired when the focus has left the slider.*/
	onBlur:             js.UndefOr[ReactEventH => Callback]             = js.undefined,
	/*  Callback function that is fired when the user changes the slider's value.*/
	onChange:           js.UndefOr[(ReactEventI, Double) => Callback]   = js.undefined,
	/*  Callback function that is fired when the slider has begun to move.*/
	onDragStart:        js.UndefOr[ReactDragEventH => Callback]         = js.undefined,
	/*  Callback function that is fried when teh slide has stopped moving.*/
	onDragStop:         js.UndefOr[ReactDragEventH => Callback]         = js.undefined,
	/*  Callback fired when the user has focused on the slider.*/
	onFocus:            js.UndefOr[ReactFocusEventH => Callback]        = js.undefined,
	disableFocusRipple: js.UndefOr[Boolean]                             = js.undefined)
{

  def apply() = {
    val props = JSMacro[MuiSlider](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Slider)
    f(props).asInstanceOf[ReactComponentU_]
  }
}
    

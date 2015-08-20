package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 *
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
required: React.PropTypes.bool,
    disabled: React.PropTypes.bool,
    min: React.PropTypes.Double,
    value: React.PropTypes.Double,
    defaultValue: React.PropTypes.Double,
    max: React.PropTypes.Double,
    step: React.PropTypes.number,
    error: React.PropTypes.string,
    description: React.PropTypes.string,
    name: React.PropTypes.string.isRequired,
    onChange: React.PropTypes.(ReactEventH,Double) => Callback,
    onFocus: React.PropTypes.func,
    onBlur: React.PropTypes.func,
    onDragStart: React.PropTypes.func,
    onDragStop: React.PropTypes.func,

 */



object MuiSlider {
  def apply(
    onBlur:       U[js.Function]                       = uNone,
    name:         String,
    onDragStart:  U[js.Function]                       = uNone,
    step:         U[Int]                               = uNone,
    style:        U[js.Any]                            = uNone,
    description:  U[String]                            = uNone,
    onChange:     U[(ReactEventH, Double) => Callback] = uNone,
    min:          U[Double]                            = uNone,
    ref:          U[String]                            = uNone,
    key:          U[String]                            = uNone,
    onDragStop:   U[js.Function]                       = uNone,
    max:          U[Double]                            = uNone,
    error:        U[String]                            = uNone,
    onFocus:      U[js.Function]                       = uNone,
    disabled:     U[Boolean]                           = uNone,
    required:     U[Boolean]                           = uNone,
    defaultValue: U[Double]                            = uNone,
    value:        U[Double]                            = uNone) = {

    val p = new TypedJsProps
    onBlur      .foreach(p.setV("onBlur"))
    p.setV("name")(name)
    onDragStart .foreach(p.setV("onDragStart"))
    step        .foreach(p.setV("step"))
    style       .foreach(p.setV("style"))
    description .foreach(p.setV("description"))
    onChange    .foreach(p.setF2C("onChange"))
    min         .foreach(p.setV("min"))
    ref         .foreach(p.setV("ref"))
    key         .foreach(p.setV("key"))
    onDragStop  .foreach(p.setV("onDragStop"))
    max         .foreach(p.setV("max"))
    error       .foreach(p.setV("error"))
    onFocus     .foreach(p.setV("onFocus"))
    disabled    .foreach(p.setV("disabled"))
    required    .foreach(p.setV("required"))
    defaultValue.foreach(p.setV("defaultValue"))
    value       .foreach(p.setV("value"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Slider)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

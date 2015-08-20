package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
 mode: React.PropTypes.MuiProgressMode,
      value: React.PropTypes.number,
      min:  React.PropTypes.number,
      max:  React.PropTypes.number,
      size: React.PropTypes.Double

 */

object MuiCircularProgress {
  def apply(
    size:  U[Double]          = uNone,
    style: U[js.Any]          = uNone,
    min:   U[Int]             = uNone,
    ref:   U[String]          = uNone,
    key:   U[String]          = uNone,
    max:   U[Int]             = uNone,
    mode:  U[MuiProgressMode] = uNone,
    value: U[Int]             = uNone) = {

    val p = new TypedJsProps
    size .foreach(p.setV("size"))
    style.foreach(p.setV("style"))
    min  .foreach(p.setV("min"))
    ref  .foreach(p.setV("ref"))
    key  .foreach(p.setV("key"))
    max  .foreach(p.setV("max"))
    mode .foreach(p.setV("mode"))
    value.foreach(p.setV("value"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.CircularProgress)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


object MuiLinearProgress {
  def apply(
    size:  U[Double]          = uNone,
    style: U[js.Any]          = uNone,
    min:   U[Int]             = uNone,
    ref:   U[String]          = uNone,
    key:   U[String]          = uNone,
    max:   U[Int]             = uNone,
    mode:  U[MuiProgressMode] = uNone,
    value: U[Int]             = uNone) = {

    val p = new TypedJsProps
    size .foreach(p.setV("size"))
    style.foreach(p.setV("style"))
    min  .foreach(p.setV("min"))
    ref  .foreach(p.setV("ref"))
    key  .foreach(p.setV("key"))
    max  .foreach(p.setV("max"))
    mode .foreach(p.setV("mode"))
    value.foreach(p.setV("value"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.LinearProgress)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


class MuiProgressMode private(val value: String) extends ComponentEnum


object MuiProgressMode {

  val DETERMINATE = new MuiProgressMode("determinate")

  val INDETERMINATE = new  MuiProgressMode("indeterminate")

  def newMode(mode: String) = new MuiProgressMode(mode)

}
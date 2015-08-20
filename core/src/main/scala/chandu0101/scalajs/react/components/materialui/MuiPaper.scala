package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js

/**
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
circle: React.PropTypes.bool,
rounded: React.PropTypes.bool,
zDepth: React.PropTypes.Int,
transitionEnabled: React.PropTypes.bool
  */
case class MuiPaper(
  circle:             U[Boolean] = uNone,
  style:              U[js.Any]  = uNone,
  rounded:            U[Boolean] = uNone,
  ref:                U[String]  = uNone,
  transitionEnabled:  U[Boolean] = uNone,
  zDepth:             U[Int]     = uNone,
  key:                U[String]  = uNone) {

  def toJS = {
    val p = new TypedJsProps
    circle           .foreach(p.setV("circle"))
    style            .foreach(p.setV("style"))
    rounded          .foreach(p.setV("rounded"))
    ref              .foreach(p.setV("ref"))
    transitionEnabled.foreach(p.setV("transitionEnabled"))
    zDepth           .foreach(p.setV("zDepth"))
    key              .foreach(p.setV("key"))
    p
  }

  def apply(children: ReactNode*) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Paper)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

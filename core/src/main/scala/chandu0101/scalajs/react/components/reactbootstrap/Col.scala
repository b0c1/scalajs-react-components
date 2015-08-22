package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class Col(
  xs:             U[Double] = uNone,
  lgPush:         U[Double] = uNone,
  xsOffset:       U[Double] = uNone,
  smPush:         U[Double] = uNone,
  xsPull:         U[Double] = uNone,
  xsPush:         U[Double] = uNone,
  smOffset:       U[Double] = uNone,
  lg:             U[Double] = uNone,
  sm:             U[Double] = uNone,
  lgPull:         U[Double] = uNone,
  mdOffset:       U[Double] = uNone,
  componentClass: U[String],
  mdPush:         U[Double] = uNone,
  md:             U[Double] = uNone,
  lgOffset:       U[Double] = uNone,
  smPull:         U[Double] = uNone,
  mdPull:         U[Double] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    lgPush.foreach(p.setV("lgPush"))
    lg.foreach(p.setV("lg"))
    mdOffset.foreach(p.setV("mdOffset"))
    mdPush.foreach(p.setV("mdPush"))
    sm.foreach(p.setV("sm"))
    lgPull.foreach(p.setV("lgPull"))
    xsOffset.foreach(p.setV("xsOffset"))
    smPull.foreach(p.setV("smPull"))
    lgOffset.foreach(p.setV("lgOffset"))
    xsPush.foreach(p.setV("xsPush"))
    md.foreach(p.setV("md"))
    smOffset.foreach(p.setV("smOffset"))
    mdPull.foreach(p.setV("mdPull"))
    smPush.foreach(p.setV("smPush"))
    componentClass.foreach(p.setV("componentClass"))
    xs.foreach(p.setV("xs"))
    xsPull.foreach(p.setV("xsPull"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Col)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

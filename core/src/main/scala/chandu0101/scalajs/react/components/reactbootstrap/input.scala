package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

case class input(
  groupClassName:   U[String]  = uNone,
  wrapperClassName: U[String]  = uNone,
  labelB:           U[String]  = uNone,
  labelClassName:   U[String]  = uNone,
  addonBefore:      U[String]  = uNone,
  buttonAfter:      U[String]  = uNone,
  help:             U[String]  = uNone,
  buttonBefore:     U[String]  = uNone,
  hasFeedback:      U[Boolean] = uNone,
  addonAfter:       U[String]  = uNone,
  disabledB:        U[Boolean] = uNone,
  bsStyle:          U[String]  = uNone,
  typeB:            U[String]  = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    labelB          .foreach(p.setV("label"))
    buttonBefore    .foreach(p.setV("buttonBefore"))
    groupClassName  .foreach(p.setV("groupClassName"))
    help            .foreach(p.setV("help"))
    wrapperClassName.foreach(p.setV("wrapperClassName"))
    hasFeedback     .foreach(p.setV("hasFeedback"))
    buttonAfter     .foreach(p.setV("buttonAfter"))
    bsStyle         .foreach(p.setV("bsStyle"))
    addonAfter      .foreach(p.setV("addonAfter"))
    disabledB       .foreach(p.setV("disabled"))
    typeB           .foreach(p.setV("type"))
    addonBefore     .foreach(p.setV("addonBefore"))
    labelClassName  .foreach(p.setV("labelClassName"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Input)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{React, ReactComponentU_}

import scala.scalajs.js

//TODO   onSelect: React.PropTypes.func,
// onSlideEnd: React.PropTypes.func,
case class Carousel(
  bsSize:             U[String]  = uNone,
  defaultActiveIndex: U[Double]  = uNone,
  onSlideEnd:         U[js.Any]  = uNone,
  direction:          U[String]  = uNone,
  wrap:               U[Boolean] = uNone,
  slide:              U[Boolean] = uNone,
  indicators:         U[Boolean] = uNone,
  activeIndex:        U[Double]  = uNone,
  pauseOnHover:       U[Boolean] = uNone,
  onSelect:           U[js.Any]  = uNone,
  bsStyle:            U[String]  = uNone,
  bsClass:            U[String]  = uNone,
  controls:           U[Boolean] = uNone) {

  def toJs: js.Any = {
    val p = new TypedJsProps
    controls.foreach(p.setV("controls"))
    onSelect.foreach(p.setV("onSelect"))
    indicators.foreach(p.setV("indicators"))
    bsSize.foreach(p.setV("bsSize"))
    defaultActiveIndex.foreach(p.setV("defaultActiveIndex"))
    activeIndex.foreach(p.setV("activeIndex"))
    bsStyle.foreach(p.setV("bsStyle"))
    slide.foreach(p.setV("slide"))
    pauseOnHover.foreach(p.setV("pauseOnHover"))
    bsClass.foreach(p.setV("bsClass"))
    direction.foreach(p.setV("direction"))
    wrap.foreach(p.setV("wrap"))
    onSlideEnd.foreach(p.setV("onSlideEnd"))
    p
  }

  def apply(children: TagMod*): ReactComponentU_ = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Carousel)
    f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
  }
}

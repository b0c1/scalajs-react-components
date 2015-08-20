package chandu0101.scalajs.react.components
package listviews

import japgolly.scalajs.react._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce


/**

key: PropTypes.string,
    ref: PropTypes.String,
    handleScroll: React.PropTypes.HTMLElement => Callback,
    preloadBatchSize: React.PropTypes.number,
    preloadAdditionalHeight: React.PropTypes.number,
    elementHeight: React.PropTypes.Seq[Double].isRequired,
    containerHeight: React.PropTypes.number.isRequired,
    infiniteLoadBeginBottomOffset: React.PropTypes.number,
    onInfiniteLoad: React.PropTypes.Callback,
    loadingSpinnerDelegate: React.PropTypes.node,
    isInfiniteLoading: React.PropTypes.bool,
    timeScrollStateLastsForAfterUserScrolls: React.PropTypes.number,
    className: React.PropTypes.string

  */
case class ReactInfinite(
  handleScroll:                            U[HTMLElement => Callback] = uNone,
  preloadAdditionalHeight:                 U[Int]                     = uNone,
  isInfiniteLoading:                       U[Boolean]                 = uNone,
  preloadBatchSize:                        U[Int]                     = uNone,
  containerHeight:                         Int,
  ref:                                     U[String]                  = uNone,
  loadingSpinnerDelegate:                  U[ReactElement]            = uNone,
  timeScrollStateLastsForAfterUserScrolls: U[Int]                     = uNone,
  elementHeight:                           Double,
  key:                                     U[String]                  = uNone,
  className:                               U[String]                  = uNone,
  infiniteLoadBeginBottomOffset:           U[Int]                     = uNone,
  onInfiniteLoad:                          U[Callback]                = uNone) {
  def toJS = {
    val p = new TypedJsProps
    handleScroll.foreach(p.setF1C("handleScroll"))
    preloadAdditionalHeight.foreach(p.setV("preloadAdditionalHeight"))
    isInfiniteLoading.foreach(p.setV("isInfiniteLoading"))
    preloadBatchSize.foreach(p.setV("preloadBatchSize"))
    p.setV("containerHeight")(containerHeight)
    ref.foreach(p.setV("ref"))
    loadingSpinnerDelegate.foreach(p.setV("loadingSpinnerDelegate"))
    timeScrollStateLastsForAfterUserScrolls.foreach(p.setV("timeScrollStateLastsForAfterUserScrolls"))
    p.setV("elementHeight")(elementHeight)
    key.foreach(p.setV("key"))
    className.foreach(p.setV("className"))
    infiniteLoadBeginBottomOffset.foreach(p.setV("infiniteLoadBeginBottomOffset"))
    onInfiniteLoad.foreach(p.setC("onInfiniteLoad"))
    p
  }

  def apply(children: Seq[ReactElement]) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Infinite)
    f(toJS, children.toJSArray).asInstanceOf[ReactComponentU_]
  }
}


trait ReactInfiniteM extends js.Object {
  def getScrollTop(): Double = js.native
}
package chandu0101.scalajs.react.components
package mixins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.extra.OnUnmount
import org.scalajs.dom

import scala.scalajs.js


/**
 * make sure u configure(OnUnmount.install)
 */
abstract class TimerMixin extends OnUnmount {

  var _timeouts: List[Int] = Nil

  def setTimeout(fn: js.Function0[Any], timeout: Double) = {
    val x = dom.window.setTimeout(fn, timeout)
    _timeouts +:= x
    x
  }

  def clearTimeout(id: Int) = dom.window.clearTimeout(id)

  def cleanup() = {
    _timeouts.foreach(clearTimeout)
    _timeouts = null

  }

  onUnmount(Callback(cleanup()))

}
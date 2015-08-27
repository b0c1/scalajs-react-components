package chandu0101.scalajs.react.components
package mixins

import chandu0101.scalajs.react.components.util.DomUtil
import japgolly.scalajs.react.ComponentScope.AnyMounted
import japgolly.scalajs.react._
import org.scalajs.dom
import org.scalajs.dom.{Event, html}

import scala.scalajs.js

/**
 * Created by chandrasekharkode .
 */
trait ClickAwayable {
  def onClickAway()

  var listener: js.Function1[Event, _] = null
}

object ClickAwayable {

  def mixin[P, S, B, N <: TopNode] = (c: ReactComponentB[P, S, B, N]) => {
    def initiateListener(t: AnyMounted[P, S, B, N]) = {
      val b = t.backend.asInstanceOf[ClickAwayable]
      b.listener =
        (e: dom.Event) => {
          val el = t.getDOMNode()
          if (t.isMounted() && el != e.target && !DomUtil.isDecedant(el, e.target.asInstanceOf[html.Element])) {
            b.onClickAway()
          }
        }
    }
    c.componentDidMount(scope => Callback {
      initiateListener(scope)
      dom.document.addEventListener("click", scope.backend.asInstanceOf[ClickAwayable].listener)
      }
    ).componentWillUnmount(scope =>
        Callback(
          dom.document.removeEventListener(
            "click",
            scope.backend.asInstanceOf[ClickAwayable].listener
          )
        )
      )
  }
}

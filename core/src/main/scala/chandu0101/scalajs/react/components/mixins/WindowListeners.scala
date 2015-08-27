package chandu0101.scalajs.react.components
package mixins

import chandu0101.scalajs.react.components.util.Events
import japgolly.scalajs.react._
import org.scalajs.dom
import org.scalajs.dom.Event

import scala.scalajs.js

/**
 * Created by chandrasekharkode .
 */
trait WindowListeners {
  def listeners: List[(String,js.Function1[Event,_])]
}

object WindowListeners {
  def mixin[P,S,B <: WindowListeners, N <: TopNode] = (c:ReactComponentB[P,S,B,N]) => {
    c.componentDidMount( scope =>
      Callback(
        scope.backend.listeners.foreach{
          case (name,function) => Events.on(dom.window,name,function)
        }
      )
    ).componentWillUnmount(scope =>
      Callback(
        scope.backend.listeners.foreach{
          case (name,function) => Events.off(dom.window,name,function)
        }
      )
    )
  }
}

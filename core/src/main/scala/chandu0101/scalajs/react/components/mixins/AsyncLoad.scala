package chandu0101.scalajs.react.components
package mixins

import japgolly.scalajs.react._
import org.scalajs.dom
import org.scalajs.dom.ext.PimpedNodeList

/**
 * Created by chandrasekharkode .
 *
 * To load resources(javascript,stylesheet) on fly
 */
trait AsyncLoad {

  def jsResources: Vector[String] = Vector.empty

  def cssResources: Vector[String] = Vector.empty

}

object AsyncLoad {
  def mixin[P, S, B <: AsyncLoad, N <: TopNode] = (c: ReactComponentB[P, S, B, N]) => {
    c.componentWillMount {
      scope =>
        val linksCb = Callback {
          val links = dom.document.getElementsByTagName("link")
          val head  = dom.document.head
          scope.backend.cssResources.foreach{s =>
            val link = dom.document.createElement("link")
            link.setAttribute("rel","stylesheet")
            link.setAttribute("href",s)
            if(!links.contains(link)) head.appendChild(link)
          }
        }

        val scriptsCb = Callback {
          val scripts = dom.document.getElementsByTagName("src")
          val body    = dom.document.body
          scope.backend.jsResources.foreach(s => {
            val script = dom.document.createElement("script")
            script.setAttribute("type","text/javascript")
            script.setAttribute("src",s)
            if(!scripts.contains(script)) body.appendChild(script)
          })
        }
        linksCb >> scriptsCb
    }
  }
}

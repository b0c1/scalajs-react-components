package chandu0101.scalajs.react.components

import japgolly.scalajs.react._

import scala.scalajs.js


/**
 * Created by chandrasekharkode .
 */
object ReactCloneWithProps {

  def mapToJS(props: Map[String, js.Any]): js.Object = {
    val obj = js.Dynamic.literal()
    props.foreach { case (key, value) =>
      obj.updateDynamic(key)(value)
    }
    obj
  }

  def apply(child: ReactNode, newProps: Map[String, js.Any]) = {
    val f = React.asInstanceOf[js.Dynamic].createFactory(React.addons.cloneWithProps)
    f(child, mapToJS(newProps)).asInstanceOf[ReactComponentU_]
  }
}

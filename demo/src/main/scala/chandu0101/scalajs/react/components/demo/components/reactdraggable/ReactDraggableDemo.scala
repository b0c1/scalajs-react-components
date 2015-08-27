package chandu0101.scalajs.react.components
package demo.components.reactdraggable

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.draggables.ReactDraggable
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._



/**
 * Created by chandrasekharkode .
 */
object ReactDraggableDemo {

  val code =
    """
      |
    """.stripMargin
  val component = ReactComponentB[Unit]("ReactDraggableDemo")
    .render(P => {
     <.div(^.cls := "react-draggable-demo")(
       <.h2(^.cls := "mui-font-style-headline")("Demo"),
        CodeExample(code)(
          ReactDraggable(zIndex = 100)(
          <.div(^.cls := "box")(" I can drag any where")
          )
        )
      )
    }).buildU

  def apply() = component()

}

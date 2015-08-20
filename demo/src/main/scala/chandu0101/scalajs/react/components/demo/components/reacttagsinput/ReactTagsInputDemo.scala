package chandu0101.scalajs.react.components
package demo.components.reacttagsinput

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.textfields.ReactTagsInput
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js.{Array => JArray}


object ReactTagsInputDemo {

  val code =
    """
      | ReactTagsInput(ref = "uncontrolledtags")
      | ReactTagsInput(value = S.tags,onChange = B.onChange _)
      |
    """.stripMargin


  case class State(tags: JArray[String] = JArray("scala","scalajs"))

  case class Backend(t: BackendScope[Unit, State]) {

    def onChange(tags: JArray[String], tag: String): Callback = {
      println(s" Final Tags : $tags , Added/Removed Tag : $tag")
      t.modState(_.copy(tags = tags))
    }

    def render(S: State) = {
      <.div(
        CodeExample(code, "Demo")(
          <.div(
            <.h4("Uncontrolled : "),
            ReactTagsInput(ref = "uncontrolledtags")
          ),
          <.div(
            <.h4("Controlled : "),
            ReactTagsInput(value = S.tags, onChange = onChange _)
          )
        )
      )
    }
  }


  val component = ReactComponentB[Unit]("ReactTagsInputDemo")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.state))
    .buildU

  def apply() = component()

}

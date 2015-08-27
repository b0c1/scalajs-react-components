package chandu0101.scalajs.react.components
package demo.components.reactselect

import chandu0101.scalajs.react.components.demo.components.CodeExample
import chandu0101.scalajs.react.components.optionselectors.{ReactSelect, SelectOption}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{Array => JArray}


object ReactSelectDemo {

  val code =
    """
      |  case class SampleOption(value : String,label : String) extends SelectOption {
      |    override def toJson: js.Dynamic = json(value = value,label = label)
      |  }
      |
      |  val options = JArray(
      |   SampleOption("value1","label1"),
      |   SampleOption("value2","label2"),
      |   SampleOption("value3","label3"),
      |   SampleOption("value4","label4"),
      |   SampleOption("value5","label5")
      |  )
      |
      |ReactSelect(options = options,
      |            value = S.value,
      |            onChange = B.onChange _)
      |
      |//multi
      |ReactSelect(options = options,
      |            value = S.value,
      |            multi = true,
      |            onChange = B.onMultiChange _)
      |
    """.stripMargin


  case class State(value : String = "",multiValue : String = "")

  case class Backend(t: BackendScope[Unit, State]) {
    val onChange: StringCb =
      value => t.modState(_.copy(value = value))

    val onMultiChange: StringCb =
      value => t.modState(_.copy(multiValue = value))

    def render(S: State) = {
      <.div(
        CodeExample(code, "Demo")(
          <.div(
            <.h3("Single Select"),
            ReactSelect(options = options,
              value = S.value,
              onChange = onChange)
          ),
          <.div(
            <.h3("Multi Select"),
            ReactSelect(options = options,
              value = S.multiValue,
              multi = true,
              onChange = onMultiChange)
          )
        )
      )
    }
  }

  val component = ReactComponentB[Unit]("ReactSelectDemo")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.state))
    .buildU

  case class SampleOption(value : String,label : String) extends SelectOption {
    override def toJson: js.Dynamic = json(value = value,label = label)
  }
  object SampleOption {
    def fromJson(obj : js.Dynamic) = SampleOption(value = obj.value.toString,label = obj.label.toString)
  }

  lazy val options = JArray(
   SampleOption("value1","label1"),
   SampleOption("value2","label2"),
   SampleOption("value3","label3"),
   SampleOption("value4","label4"),
   SampleOption("value5","label5")
  )

  def apply() = component()

}

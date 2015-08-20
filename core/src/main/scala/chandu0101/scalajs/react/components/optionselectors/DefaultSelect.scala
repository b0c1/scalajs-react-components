package chandu0101.scalajs.react.components
package optionselectors


import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js


object DefaultSelect {

  case class Backend(t: BackendScope[Props, Unit]) {
    val onChange: REventICb =
      e => t.props.onChange(e.target.value)

    def render(P: Props) = {
      <.div(
        <.label(<.strong(P.label)),
        <.select(
          ^.paddingLeft := "5px",
          ^.id := "reactselect",
          ^.value := P.value,
          ^.onChange ==> onChange)(
          P.options.map(item => <.option(item))
        )
      )
    }
  }

  val component = ReactComponentB[Props]("DefaultSelect")
    .stateless
    .backend(Backend)
    .render($ => $.backend.render($.props))
    .build

  case class Props(label: String, options: List[String], value: String, onChange: StringCb)

  def apply(ref: U[String] = "", key: js.Any = {}, label: String, options: List[String], value: String, onChange: StringCb) = component.set(key, ref)(Props(label, options, value, onChange))
}

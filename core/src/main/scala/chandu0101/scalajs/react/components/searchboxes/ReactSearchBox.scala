package chandu0101.scalajs.react.components
package searchboxes

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js
import scalacss.Defaults._
import scalacss.ScalaCssReact._

object ReactSearchBox {

  class Style extends StyleSheet.Inline {

    import dsl._

    val searchBox = style(marginBottom(10 px))

    val input = style(border.none,
      fontSize(13 px),
      fontWeight._300,
      padding(3 px),
      width(100.%%),
      backgroundColor.transparent,
      borderBottom :=! "1px solid #B2ADAD",
      &.focus(outline.none,
        borderBottom :=! "1.5px solid #03a9f4"
      )
    )
  }


  case class Backend(t: BackendScope[Props, Unit]) {
    def onTextChange(e: ReactEventI): Callback =
      e.preventDefaultCB >> t.props.onTextChange(e.target.value)

    def render(P: Props) = {
      <.div(P.style.searchBox)(
        <.input(P.style.input, ^.placeholder := "Search ..", ^.onKeyUp ==> onTextChange)
      )
    }
  }


  object DefaultStyle extends Style

  val component = ReactComponentB[Props]("ReactSearchBox")
    .stateless
    .backend(Backend)
    .render($ => $.backend.render($.props))
    .build

  case class Props(
    onTextChange: StringCb,
    style:        Style
  )

  def apply(
    onTextChange: StringCb,
    style:        Style     = DefaultStyle,
    ref:          U[String] = "",
    key:          js.Any    = {}) =

    component.set(key, ref)(Props(onTextChange, style))
}
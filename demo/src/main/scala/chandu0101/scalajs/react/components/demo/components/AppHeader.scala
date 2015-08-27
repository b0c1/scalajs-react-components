package chandu0101.scalajs.react.components
package demo.components

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react._

/**
 * Created by chandrasekharkode .
 */
object AppHeader {

  object Style {

    val headerStyle: Seq[TagMod] = Seq(
      ^.background := "#F2706D",
      ^.fontSize := "1.5em",
      ^.padding := "0", //todo: elc: these were ints
      ^.margin := "0",
      ^.position := "fixed",
      ^.width := "100%",
      ^.zIndex := "5"
    )

    val menuNav = Seq(
      MsFlexAlign := "center" ,
      WebkitAlignItems := "center" ,
      WebkitBoxAlign := "center" ,
      ^.alignItems := "center" ,
      ^.display := "-ms-flexbox" ,
      ^.display := "-webkit-box" ,
      ^.display := "-webkit-flex" ,
      ^.display := "flex" ,
      ^.height := "64px" ,
      ^.lineHeight := "64px" ,
      ^.margin := "0 3rem"
    )

    val logo = Seq(
      ^.color := "rgb(244, 233, 233)",
      ^.textDecoration := "none",
      ^.width := "150px"
    )

    val menuItem = Seq(
      ^.padding := "20px",
      ^.color := "rgb(244, 233, 233)",
      ^.textDecoration := "none")

    val menuItemHover = Seq(^.background := "#f1453e")

  }

  case class State(menuHover: String = "")

  case class Backend(t: BackendScope[Unit, State]) {

    def onMouseEnterCb(menu: String) = t.modState(_.copy(menuHover = menu))

    val onMouseLeaveCb =
      t.modState(_.copy(menuHover = ""))

    def render(S: State) = {
      val docs   = "Docs"
      val github = "Github"

      <.header(Style.headerStyle)(
        <.nav(Style.menuNav)(
          <.a(Style.logo, ^.href := "#")("S J R C"),
          <.div(^.marginLeft := "auto")(
            <.a(
              ^.target :="_blank",
              (S.menuHover == github) ?= Style.menuItemHover,
              Style.menuItem,
              ^.href := "https://github.com/chandu0101/scalajs-react-components",
              onMouseEnter --> onMouseEnterCb(github),
              onMouseLeave --> onMouseLeaveCb)(github)
          )
        ))
    }
  }


  val component = ReactComponentB[Unit]("AppHeader")
    .initialState(State())
    .backend(Backend)
    .render($ => $.backend.render($.state))
    .buildU

  def apply() = component()

}

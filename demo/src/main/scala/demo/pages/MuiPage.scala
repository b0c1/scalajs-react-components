package demo
package pages

import chandu0101.scalajs.react.components.WithAsyncScript
import chandu0101.scalajs.react.components.materialui.ThemeInstaller
import demo.components.LeftNavPage
import demo.routes.{LeftRoute, MuiRouteModule}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl

object MuiPage {
  case class Backend($: BackendScope[Props, _]) {
    def render(P: Props) = {
      WithAsyncScript("assets/material_ui-bundle.js")(
        LeftNavPage(MuiRouteModule.menu, P.selectedPage, P.ctrl)
      )
    }
  }

  val component = ReactComponentB[Props]("MuiPage")
    .renderBackend[Backend]
    .configureSpec(ThemeInstaller.installMuiContext())
    .build

  case class Props(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute])

  def apply(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute]) = component(Props(selectedPage, ctrl))

}

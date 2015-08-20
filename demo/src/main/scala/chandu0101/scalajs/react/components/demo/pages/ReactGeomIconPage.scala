package chandu0101.scalajs.react.components
package demo.pages

import chandu0101.scalajs.react.components.demo.components.LeftNavPage
import chandu0101.scalajs.react.components.demo.routes.{ReactGeomIcontRouteModule, LeftRoute, ReactTagsInputRouteModule}
import chandu0101.scalajs.react.components.mixins.AsyncLoad
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.{BackendScope, ReactComponentB}


object ReactGeomIconPage {

  case class Backend(t: BackendScope[Props, Unit]) extends AsyncLoad {
    override val jsResources: Vector[String] = Vector("assets/reactgeomiconspage-bundle.js")

    def render(P: Props) = {
      LeftNavPage(ReactGeomIcontRouteModule.menu, P.selectedPage, P.ctrl)
    }
  }

  val component = ReactComponentB[Props]("ReactGeomIconPage")
    .stateless
    .backend(Backend)
    .render($ ⇒ $.backend.render($.props))
    .configure(AsyncLoad.mixin)
    .build

  case class Props(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute])

  def apply(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute]) = component(Props(selectedPage, ctrl))

}

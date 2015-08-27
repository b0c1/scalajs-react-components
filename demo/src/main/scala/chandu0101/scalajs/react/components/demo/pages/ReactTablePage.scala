package chandu0101.scalajs.react.components
package demo.pages

import chandu0101.scalajs.react.components.demo.components.LeftNavPage
import chandu0101.scalajs.react.components.demo.routes.{LeftRoute, ReactTableRouteModule}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl

/**
 * Created by chandrasekharkode .
 */
object ReactTablePage {

  val component = ReactComponentB[Props]("ReactTablePage")
    .render_P(P => LeftNavPage(ReactTableRouteModule.menu, P.selectedPage, P.ctrl))
    .build

  case class Props(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute])

  def apply(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute]) = component(Props(selectedPage, ctrl))

}
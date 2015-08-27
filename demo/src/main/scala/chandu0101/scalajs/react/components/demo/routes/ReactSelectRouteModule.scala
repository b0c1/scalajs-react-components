package chandu0101.scalajs.react.components
package demo.routes

import chandu0101.scalajs.react.components.demo.components.reactselect.{ReactSelectDemo, ReactSelectInfo}
import chandu0101.scalajs.react.components.demo.components.reacttagsinput.{ReactTagsInputDemo, ReactTagsInputInfo}
import chandu0101.scalajs.react.components.demo.pages.{ReactSelectPage, ReactTagsInputPage}
import japgolly.scalajs.react.extra.router.RouterConfigDsl

object ReactSelectRouteModule {

  case object Info extends LeftRoute("Info", "info", () => ReactSelectInfo())

  case object Demo extends LeftRoute("Demo", "demo", () => ReactSelectDemo())

  val menu : List[LeftRoute] = List(Info,Demo)

  val routes = RouterConfigDsl[LeftRoute].buildRule { dsl =>
    import dsl._
    menu.map(i =>
      staticRoute(i.route, i) ~> renderR(r => ReactSelectPage(i, r))
    ).reduce(_ | _)

  }
}

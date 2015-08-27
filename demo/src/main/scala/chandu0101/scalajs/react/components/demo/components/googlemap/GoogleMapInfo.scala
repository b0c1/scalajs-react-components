package chandu0101.scalajs.react.components
package demo.components.googlemap

import chandu0101.scalajs.react.components.demo.components.InfoTemplate
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._


/**
 * Created by chandrasekharkode .
 */
object GoogleMapInfo {

  val component = ReactComponentB[Unit]("googleMapInfo")
    .render(P => {
     InfoTemplate(componentFilePath = "maps/GoogleMap.scala")(
      <.h3("Google Map :"),
       <.p("Map component based on " ,<.a(^.href := "https://developers.google.com/maps/documentation/javascript/") ("google map javascript api"))
     )

  }).buildU

  def apply() = component()

}

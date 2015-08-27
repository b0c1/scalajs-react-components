package chandu0101.scalajs.react.components
package demo.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js
import scalacss.Defaults._

/**
 * Created by chandrasekharkode .
 */
object InfoTemplate {

   object Style extends StyleSheet.Inline {
       import dsl._
       val content = style(textAlign.center,
         fontSize(30.px),
         paddingTop(40.px))
     }

  val component = ReactComponentB[Props]("InfoTemplate")
    .renderPC(($, P, C) => {
      <.div(^.cls := "info-template")(
        <.div(^.cls := "component-info")(C),
        P.scalacss ?= <.div(
         <.h4("Style :"),
         <.a(^.href := "#scalacss","scalacss")
        ) ,
        P.browsersTested.nonEmpty ?= <.div(^.marginTop := "10px")(
           <.h4("Tested Browsers List :"),
           <.ul(^.marginLeft := "50px")(P.browsersTested.map(s => <.li(s)))
         ),
        <.div(^.marginTop := "10px")(
           ComponentCredits(filePath = s"core/src/main/scala/chandu0101/scalajs/react/components/${P.componentFilePath}")
         )
       )
    }).build


  case class Props(browsersTested : List[String] ,componentFilePath : String,scalacss : Boolean)

  def apply(componentFilePath : String,scalacss : Boolean = false, browsersTested : List[String] = List() , ref: U[String] = "", key: js.Any = {})(children : ReactNode*) = component.set(key, ref)(Props(browsersTested,componentFilePath,scalacss),children)

}

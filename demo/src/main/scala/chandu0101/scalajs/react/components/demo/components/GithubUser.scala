package chandu0101.scalajs.react.components
package demo.components

import chandu0101.scalajs.react.components.models.Github
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js


/**
 * Created by chandrasekharkode .
 */
object GithubUser {

  object Styles {
    val userGroup = Seq(^.display := "inline-block" , ^.textAlign := "center" , ^.textDecoration := "none" , ^.color := "black")

    val userIcon = Seq(^.margin := "10px" , ^.display := "block" , ^.width := "100px" , ^.height := "100px" , ^.borderRadius := "50%")

    val userName = Seq(^.fontSize := "18px" , ^.fontWeight := 500)
  }

  val component = ReactComponentB[Props]("GithubUser")
    .render_P(P => {
     <.a( Styles.userGroup , ^.href := P.user.html_url)(
        <.img(Styles.userIcon , ^.src := P.user.avatar_url),
        <.span(Styles.userName)(P.user.login)
      )
    })
    .build

  case class Props(user : Github)

  def apply(user : Github,ref: U[String] = "", key: js.Any = {}) = component.set(key, ref)(Props(user))
}

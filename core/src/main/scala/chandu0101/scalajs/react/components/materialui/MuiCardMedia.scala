
package chandu0101.scalajs.react.components.materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`
  
case class MuiCardMedia(
	key:                   js.UndefOr[String]          = js.undefined,
	ref:                   js.UndefOr[String]          = js.undefined,
	/*  Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
	actAsExpander:         js.UndefOr[Boolean]         = js.undefined,
	/*  Whether this card component is expandable. Can be set on any child of the Card component.*/
	expandable:            js.UndefOr[Boolean]         = js.undefined,
	/*  Whether this card component include a button to expand the card. CardTitle, CardHeader and CardActions implement showExpandableButton. Any child component of Card can implements showExpandableButton or forwards the property to a child component supporting it.*/
	showExpandableButton:  js.UndefOr[Boolean]         = js.undefined,
	/*  Override the inline-styles of the card's root element.*/
	style:                 js.UndefOr[CssProperties]   = js.undefined,
	overlay:               js.UndefOr[ReactNode]       = js.undefined,
	overlayContainerStyle: js.UndefOr[CssProperties]   = js.undefined,
	overlayContentStyle:   js.UndefOr[CssProperties]   = js.undefined,
	mediaStyle:            js.UndefOr[CssProperties]   = js.undefined,
	overlayStyle:          js.UndefOr[CssProperties]   = js.undefined)
{

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiCardMedia](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.CardMedia)
    f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

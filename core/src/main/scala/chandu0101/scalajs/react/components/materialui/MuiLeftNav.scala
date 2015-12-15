
package chandu0101.scalajs.react.components.materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`
  
case class MuiLeftNav(
	key:                        js.UndefOr[String]                                   = js.undefined,
	ref:                        js.UndefOr[MuiLeftNavM => Unit]                      = js.undefined,
	/* default: false: Indicates whether swiping sideways when the nav is closed should open the nav.*/
	disableSwipeToOpen:         js.UndefOr[Boolean]                                  = js.undefined,
	/* default: true: Indicates that the left nav should be docked. In this state, the overlay won't show and clicking on a menu item will not close the left nav.*/
	docked:                     js.UndefOr[Boolean]                                  = js.undefined,
	/*  A react component that will be displayed above all the menu items. Usually, this is used for a logo or a profile image.*/
	header:                     js.UndefOr[ReactElement]                             = js.undefined,
	/*  Class name for the menuItem.*/
	menuItemClassName:          js.UndefOr[String]                                   = js.undefined,
	/*  Class name for the link menuItem.*/
	menuItemClassNameLink:      js.UndefOr[String]                                   = js.undefined,
	/*  Class name for the subheader menuItem.*/
	menuItemClassNameSubheader: js.UndefOr[String]                                   = js.undefined,
	/*  JSON data representing all menu items to render.*/
	menuItems:                  js.UndefOr[js.Array[MuiMenuItemJson]]                = js.undefined,
	/* default: null: Indicates that the left nav should be opened, closed or uncontrolled. Providing a boolean will turn the left nav into a controlled component.*/
	open:                       js.UndefOr[Boolean]                                  = js.undefined,
	/* default: false: Positions the LeftNav to open from the right side.*/
	openRight:                  js.UndefOr[Boolean]                                  = js.undefined,
	/*  Indicates the particular item in the menuItems array that is currently selected.*/
	selectedIndex:              js.UndefOr[Int]                                      = js.undefined,
	/*  Override the inline-styles of LeftNav's root element.*/
	style:                      js.UndefOr[CssProperties]                            = js.undefined,
	/* function(event, selectedIndex, menuItem): Fired when a menu item is clicked that is not the one currently selected. Note that this requires the injectTapEventPlugin component. See the "Get Started" section for more detail.*/
	onChange:                   js.UndefOr[(ReactEventH, Int, js.Any) => Callback]   = js.undefined,
	/* function(): Fired when the component is opened. Using this method is deprecated, use the open property and handle onChangeRequest to control the left nav.*/
	@deprecated
	onNavOpen:                  js.UndefOr[Callback]                                 = js.undefined,
	/* function(): Fired when the component is closed. Using this method is deprecated, use the open property and handle onChangeRequest to control the left nav.*/
	@deprecated
	onNavClose:                 js.UndefOr[Callback]                                 = js.undefined,
	/* function(open, reason): Callback function that is fired when the open state of the left nav is requested to be changed. The provided open argument determines whether the left nav is requested to be opened or closed. Also, the reason argument states why the left nav got closed or opend. It can be either 'clickaway' for menuItem and overlay clicks, 'escape' for pressing the escape key and 'swipe' for swiping. For opening the reason is always 'swipe'.*/
	onChangeRequest:            js.UndefOr[(Boolean, String) => Callback]            = js.undefined,
	className:                  js.UndefOr[String]                                   = js.undefined)
{

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiLeftNav](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.LeftNav)
    f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}


@js.native
class MuiLeftNavM extends js.Object{
	/* LeftNav.open(): Opens the component. Using this method is deprecated, use the open property and handle onChangeRequest to control the left nav.*/
	@deprecated
	def open(): Unit = js.native

	/* LeftNav.close(): Closes the component, hiding it from view. Using this method is deprecated, use the open property and handle onChangeRequest to control the left nav.*/
	@deprecated
	def close(): Unit = js.native

	/* LeftNav.toggle(): Toggles between the open and closed states. Using this method is deprecated, use the open property and handle onChangeRequest to control the left nav.*/
	@deprecated
	def toggle(): Unit = js.native
}

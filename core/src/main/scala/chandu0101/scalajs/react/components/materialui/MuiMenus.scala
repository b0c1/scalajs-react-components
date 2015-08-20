package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.{Array => JArray}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
 className: React.PropTypes.string,
    docked: React.PropTypes.bool,
    header: React.PropTypes.element,
    menuItems: React.PropTypes.JArray[MuiMenuItem].isRequired,
    onChange: React.PropTypes.(ReactEvent,Int,js.Object) => Callback,
    onNavOpen: React.PropTypes.Callback,
    onNavClose: React.PropTypes.Callback,
    openRight: React.PropTypes.bool,
    selectedIndex: React.PropTypes.number

 */
object MuiLeftNav {

  def apply(
    menuItems:     JArray[MuiMenuItem],
    style:         U[js.Any]                                   = uNone,
    onChange:      U[(ReactEvent, Int, js.Object) => Callback] = uNone,
    ref:           U[String]                                   = uNone,
    onNavClose:    U[Callback]                                 = uNone,
    onNavOpen:     U[Callback]                                 = uNone,
    key:           U[String]                                   = uNone,
    className:     U[String]                                   = uNone,
    docked:        U[Boolean]                                  = uNone,
    header:        U[ReactElement]                             = uNone,
    selectedIndex: U[Int]                                      = uNone,
    openRight:     U[Boolean]                                  = uNone) = {

    val p = new TypedJsProps
    p.setV("menuItems")(menuItems.map(_.toJson))
    style        .foreach(p.setV("style"))
    onChange     .foreach(p.setF3C("onChange"))
    ref          .foreach(p.setV("ref"))
    onNavClose   .foreach(p.setC("onNavClose"))
    onNavOpen    .foreach(p.setC("onNavOpen"))
    key          .foreach(p.setV("key"))
    className    .foreach(p.setV("className"))
    docked       .foreach(p.setV("docked"))
    header       .foreach(p.setV("header"))
    selectedIndex.foreach(p.setV("selectedIndex"))
    openRight    .foreach(p.setV("openRight"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.LeftNav)
    f(p).asInstanceOf[ReactComponentU_]
  }

}

trait MuiLeftNavM extends js.Object {

  def close(): Unit = js.native

  def toggle(): Unit = js.native
}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  autoWidth: React.PropTypes.bool,
    onItemTap: React.PropTypes.(ReactEvent,Int,js.Object) => Callback,
    onToggle: React.PropTypes.(ReactEvent,Int,Boolean) => Callback,
    menuItems: React.PropTypes.JArray[MuiMenuItem].isRequired,
    selectedIndex: React.PropTypes.number,
    hideable: React.PropTypes.bool,
    visible: React.PropTypes.bool,
    zDepth: React.PropTypes.number,
    menuItemStyle: React.PropTypes.js.Any,
    menuItemStyleSubheader: React.PropTypes.js.Any,
    menuItemStyleLink: React.PropTypes.js.Any,
    menuItemClassName: React.PropTypes.string,
    menuItemClassNameSubheader: React.PropTypes.string,
    menuItemClassNameLink: React.PropTypes.string,

 */
object MuiMenu {

  def apply(
    onToggle:                   U[(ReactEvent, Int, Boolean) => Callback]   = uNone,
    menuItems:                  JArray[MuiMenuItem],
    visible:                    U[Boolean]                                  = uNone,
    style:                      U[js.Any]                                   = uNone,
    ref:                        U[String]                                   = uNone,
    onItemTap:                  U[(ReactEvent, Int, js.Object) => Callback] = uNone,
    menuItemStyleLink:          U[js.Any]                                   = uNone,
    zDepth:                     U[Int]                                      = uNone,
    menuItemStyle:              U[js.Any]                                   = uNone,
    key:                        U[String]                                   = uNone,
    autoWidth:                  U[Boolean]                                  = uNone,
    menuItemClassNameSubheader: U[String]                                   = uNone,
    menuItemStyleSubheader:     U[js.Any]                                   = uNone,
    hideable:                   U[Boolean]                                  = uNone,
    menuItemClassNameLink:      U[String]                                   = uNone,
    menuItemClassName:          U[String]                                   = uNone,
    selectedIndex:              U[Int]                                      = uNone) = {

    val p = new TypedJsProps
    onToggle                  .foreach(p.setF3C("onToggle"))
    p                         .setV("menuItems")(menuItems.map(_.toJson))
    visible                   .foreach(p.setV("visible"))
    style                     .foreach(p.setV("style"))
    ref                       .foreach(p.setV("ref"))
    onItemTap                 .foreach(p.setF3C("onItemTap"))
    menuItemStyleLink         .foreach(p.setV("menuItemStyleLink"))
    zDepth                    .foreach(p.setV("zDepth"))
    menuItemStyle             .foreach(p.setV("menuItemStyle"))
    key                       .foreach(p.setV("key"))
    autoWidth                 .foreach(p.setV("autoWidth"))
    menuItemClassNameSubheader.foreach(p.setV("menuItemClassNameSubheader"))
    menuItemStyleSubheader    .foreach(p.setV("menuItemStyleSubheader"))
    hideable                  .foreach(p.setV("hideable"))
    menuItemClassNameLink     .foreach(p.setV("menuItemClassNameLink"))
    menuItemClassName         .foreach(p.setV("menuItemClassName"))
    selectedIndex             .foreach(p.setV("selectedIndex"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Menu)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


case class MuiMenuItem(
  payload:        U[String]          = uNone,
  text:           U[String]          = uNone,
  id:             U[String]          = uNone,
  number:         U[String]          = uNone,
  data:           U[String]          = uNone,
  iconClassName:  U[String]          = uNone,
  toggle:         U[Boolean]         = uNone,
  disabled:       U[Boolean]         = uNone,
  defaultToggled: U[Boolean]         = uNone,
  route:          U[String]          = uNone,
  `type`:         U[MuiMenuItemType] = uNone,
  className:      U[String]          = uNone,
  selected:       U[Boolean]         = uNone,
  style :         U[js.Any]          = uNone) {
  
  def toJson: js.Any = {
    val p = new TypedJsProps
    defaultToggled.foreach(p.setV("defaultToggled"))
    text          .foreach(p.setV("text"))
    number        .foreach(p.setV("number"))
    data          .foreach(p.setV("data"))
    iconClassName .foreach(p.setV("iconClassName"))
    `type`        .foreach(p.setV("type"))
    route         .foreach(p.setV("route"))
    disabled      .foreach(p.setV("disabled"))
    payload       .foreach(p.setV("payload"))
    toggle        .foreach(p.setV("toggle"))
    id            .foreach(p.setV("id"))
    className     .foreach(p.setV("className"))
    selected      .foreach(p.setV("selected"))
    style         .foreach(p.setV("style"))
    p
  }
}

object MuiMenuItem {
  def fromJson(obj: js.Dynamic) =
    MuiMenuItem(
      defaultToggled = if (js.isUndefined(obj.defaultToggled)) uNone else obj.defaultToggled.asInstanceOf[Boolean],
      text = if (js.isUndefined(obj.text)) uNone else obj.text.asInstanceOf[String],
      data = if (js.isUndefined(obj.data)) uNone else obj.text.asInstanceOf[String],
      number = if (js.isUndefined(obj.number)) uNone else obj.number.asInstanceOf[String],
      iconClassName = if (js.isUndefined(obj.iconClassName)) uNone else obj.iconClassName.asInstanceOf[String],
      route = if (js.isUndefined(obj.route)) uNone else obj.route.asInstanceOf[String],
      disabled = if (js.isUndefined(obj.disabled)) uNone else obj.disabled.asInstanceOf[Boolean],
      payload = if (js.isUndefined(obj.payload)) uNone else obj.payload.asInstanceOf[String],
      toggle = if (js.isUndefined(obj.toggle)) uNone else obj.toggle.asInstanceOf[Boolean],
      id = if (js.isUndefined(obj.id)) uNone else obj.id.asInstanceOf[String],
      className = if (js.isUndefined(obj.className)) uNone else obj.className.asInstanceOf[String],
      style = if (js.isUndefined(obj.style)) uNone else obj.style.asInstanceOf[js.Any],
      selected = if (js.isUndefined(obj.selected)) uNone else obj.selected.asInstanceOf[Boolean]
    )
}

class MuiMenuItemType private(val value: String) extends ComponentEnum

object MuiMenuItemType {

  val SUBHEADER = new MuiMenuItemType("SUBHEADER")
  val LINK = new MuiMenuItemType("LINK")
  val NESTED = new MuiMenuItemType("NESTED")

  def newType(name: String) = new MuiMenuItemType(name)


}
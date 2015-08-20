package chandu0101.scalajs.react.components
package materialui


import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.{Array => JArray}

/**
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  className: React.PropTypes.string,
    autoWidth: React.PropTypes.bool,
    onChange: React.PropTypes.(ReactEvent,Int,Item) => Callback,
    menuItems: React.PropTypes.JArray[Item].isRequired,
    menuItemStyle: React.PropTypes.js.Any,
    selectedIndex: React.PropTypes.number

  */

object MuiDropdownMenu {
  def apply(
    menuItems:     JArray[Item],
    style:         U[js.Any]                                = uNone,
    onChange:      U[(ReactEvent, Int, Item) => Callback] = uNone,
    ref:           U[String]                                = uNone,
    menuItemStyle: U[js.Any]                                = uNone,
    key:           U[String]                                = uNone,
    autoWidth:     U[Boolean]                               = uNone,
    className:     U[String]                                = uNone,
    selectedIndex: U[Int]                                   = uNone) = {

    val p = new TypedJsProps
    p.setV("menuItems")(menuItems.map(_.toJson))
    style        .foreach(p.setV("style"))
    onChange     .map(wrap).foreach(p.setF3C("onChange"))
    ref          .foreach(p.setV("ref"))
    menuItemStyle.foreach(p.setV("menuItemStyle"))
    key          .foreach(p.setV("key"))
    autoWidth    .foreach(p.setV("autoWidth"))
    className    .foreach(p.setV("className"))
    selectedIndex.foreach(p.setV("selectedIndex"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.DropDownMenu)
    f(p).asInstanceOf[ReactComponentU_]
  }

  def wrap(f: (ReactEvent, Int, Item) => Callback): (ReactEvent, Int, js.Dynamic) => Callback = {
    (e, idx, obj) => f(e, idx, Item.fromJson(obj))
  }

  case class Item(payload: String, text: String) {
    def toJson: js.Any = {
      val p = new TypedJsProps
      p.setV("text")(text)
      p.setV("payload")(payload)
      p
    }
  }

  object Item {
    def fromJson(obj: js.Dynamic) = Item(text = obj.text.toString, payload = obj.payload.toString)
  }

}

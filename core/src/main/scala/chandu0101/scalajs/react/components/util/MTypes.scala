package chandu0101.scalajs.react.components
package util

import chandu0101.scalajs.react.components.models.{RElementPosition, RPoint}
import japgolly.scalajs.react._
import org.scalajs.dom.Event

import scala.scalajs.js.Date

/**
 * Created by chandrasekharkode .
 */
trait MTypes {

  type REventIBooleanCb = (ReactEventI, Boolean) => Callback

  type REventICb = ReactEventI => Callback

  type REventIIntCb = (ReactEventI, Int) => Callback

  type DateCb = Date => Callback

  type StringCb = String => Callback

  type DateCbString = Date => CallbackTo[String]

  type StringIntCb = (String, Int) => Callback

  type StringStringIntCbAny = (String, String, Int) => CallbackTo[Any]

  type REventIDateCb = (ReactEventI, Date) => Callback

  type REventHCb = ReactEventH => Callback

  type EventCb = Event => Callback

  type EventRElementPositionCbAny = (Event, RElementPosition) => CallbackTo[Any]

  type REventIDoubleCb = (ReactEventI, Double) => Callback

  type REventIStringCb = (ReactEventI, String) => Callback

  type REventIStringCbAny = (ReactEventI, String) => CallbackTo[Any]

  type REventIIntStringCb = (ReactEventI, Int, String) => Callback

  type OnDropdownTap = (ReactEventI, String, String) => Callback

  type REventIIntBooleanCb = (ReactEventI, Int, Boolean) => Callback

  type CssClassType = Map[String, Boolean]

  type MapCb = (Map[String, Any]) => Callback

  type MapMapCb = (Map[String, Any], Map[String, Any]) => Callback

  type MapCbString = (Map[String, Any]) => CallbackTo[String]

  type StringRPointCbAny = (String, RPoint) => CallbackTo[Any]

}

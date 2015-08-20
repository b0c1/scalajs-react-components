package chandu0101.scalajs.react.components
package textfields

import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.{Array => JArray}

/**
 * key: PropTypes.string,
ref: PropTypes.String,
value: React.PropTypes.JArray[String],
valueLink: React.PropTypes.object,
defaultValue: React.PropTypes.JArray[String],
placeholder: React.PropTypes.string,
classNamespace: React.PropTypes.string,
addKeys: React.PropTypes.JArray[Int],
removeKeys: React.PropTypes.JArray[Int],
addOnBlur: React.PropTypes.bool,
onChange: React.PropTypes.(JArray[String],String) => Callback,
onChangeInput: React.PropTypes.String => Callback,
onBlur: React.PropTypes.Callback,
onKeyDown: React.PropTypes.ReactEventI => Callback,
onKeyUp: React.PropTypes.ReactEventI => Callback,
onTagAdd: React.PropTypes.String => Callback,
onTagRemove: React.PropTypes.String => Callback,
transform: React.PropTypes.String => Callback,
validate: React.PropTypes.String => Boolean,
validateAsync: React.PropTypes.func

 */

object ReactTagsInput {
  def apply(
    onBlur:         U[Callback]                             = uNone,
    onKeyDown:      U[ReactEventI => Callback]              = uNone,
    onTagRemove:    U[String => Callback]                   = uNone,
    onChange:       U[(JArray[String], String) => Callback] = uNone,
    removeKeys:     U[JArray[Int]]                          = uNone,
    validate:       U[String => Boolean]                    = uNone,
    classNamespace: U[String]                               = uNone,
    ref:            U[String]                               = uNone,
    addOnBlur:      U[Boolean]                              = uNone,
    placeholder:    U[String]                               = uNone,
    valueLink:      U[js.Object]                            = uNone,
    onKeyUp:        U[ReactEventI => Callback]              = uNone,
    key:            U[String]                               = uNone,
    addKeys:        U[JArray[Int]]                          = uNone,
    onTagAdd:       U[String => Callback]                   = uNone,
    validateAsync:  U[js.Function]                          = uNone,
    onChangeInput:  U[String => Callback]                   = uNone,
    defaultValue:   U[JArray[String]]                       = uNone,
    transform:      U[String => Callback]                   = uNone,
    value:          U[JArray[String]]                       = uNone) = {

    val p = new TypedJsProps
    onBlur        .foreach(p.setC("onBlur"))
    onKeyDown     .foreach(p.setF1C("onKeyDown"))
    onTagRemove   .foreach(p.setF1C("onTagRemove"))
    onChange      .foreach(p.setF2C("onChange"))
    removeKeys    .foreach(p.setV("removeKeys"))
    validate      .foreach(p.setV("validate"))
    classNamespace.foreach(p.setV("classNamespace"))
    ref           .foreach(p.setV("ref"))
    addOnBlur     .foreach(p.setV("addOnBlur"))
    placeholder   .foreach(p.setV("placeholder"))
    valueLink     .foreach(p.setV("valueLink"))
    onKeyUp       .foreach(p.setF1C("onKeyUp"))
    key           .foreach(p.setV("key"))
    addKeys       .foreach(p.setV("addKeys"))
    onTagAdd      .foreach(p.setF1C("onTagAdd"))
    validateAsync .foreach(p.setV("validateAsync"))
    onChangeInput .foreach(p.setF1C("onChangeInput"))
    defaultValue  .foreach(p.setV("defaultValue"))
    transform     .foreach(p.setF1C("transform"))
    value         .foreach(p.setV("value"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.ReactTagsInput)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


trait ReactTagsInputM extends js.Object {

  def focus(): Unit = js.native

  def clear(): Unit = js.native

  def getTags(): JArray[String] = js.native

  def addTag(tag: String): Unit = js.native

  def removeTag(tag: String): Unit = js.native

}

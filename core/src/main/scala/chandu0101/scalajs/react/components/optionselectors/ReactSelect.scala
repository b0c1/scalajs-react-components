package chandu0101.scalajs.react.components
package optionselectors

import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.{Array => JArray}


/**
 * key: PropTypes.string,
ref: PropTypes.String,
allowCreate: React.PropTypes.bool,
		asyncOptions: React.PropTypes.func,
		autoload: React.PropTypes.bool,
		className: React.PropTypes.string,
		clearable: React.PropTypes.bool,
		clearAllText: React.PropTypes.string,
		clearValueText: React.PropTypes.string,
		delimiter: React.PropTypes.string,
		disabled: React.PropTypes.bool,
		filterOption: React.PropTypes.(SelectOption,String) => Boolean,
		filterOptions: React.PropTypes.(JArray[SelectOption],String) => JArray[String],
		ignoreCase: React.PropTypes.bool,
		inputProps: React.PropTypes.object,
		matchPos: React.PropTypes.string,
		matchProp: React.PropTypes.string,
		multi: React.PropTypes.bool,
		name: React.PropTypes.string,
		noResultsText: React.PropTypes.string,
		onBlur: React.PropTypes.ReactEvent => Callback,
		onChange: React.PropTypes.String => Callback,
		onFocus: React.PropTypes.ReactEvent => Callback,
		onOptionLabelClick: React.PropTypes.(String,ReactEvent) => Callback,
		optionRenderer: React.PropTypes.SelectOption => ReactElement,
		options: React.PropTypes.JArray[SelectOption],
		placeholder: React.PropTypes.string,
		searchable: React.PropTypes.bool,
		searchPromptText: React.PropTypes.string,
		value: React.PropTypes.string,
		valueRenderer: React.PropTypes.SelectOption => ReactElement

 */


object ReactSelect {
  type FilterF = (JArray[js.Object], String) => JArray[String]

  def apply[T <: SelectOption](
    inputProps:         U[js.Object]                        = uNone,
    onBlur:             U[ReactEvent => Callback]           = uNone,
    name:               U[String]                           = uNone,
    clearable:          U[Boolean]                          = uNone,
    clearAllText:       U[String]                           = uNone,
    filterOptions:      U[FilterF]                          = uNone,
    asyncOptions:       U[js.Function]                      = uNone,
    onChange:           U[String => Callback]               = uNone,
    valueRenderer:      U[js.Object => ReactElement]        = uNone,
    clearValueText:     U[String]                           = uNone,
    matchPos:           U[String]                           = uNone,
    matchProp:          U[String]                           = uNone,
    ref:                U[String]                           = uNone,
    allowCreate:        U[Boolean]                          = uNone,
    placeholder:        U[String]                           = uNone,
    filterOption:       U[(js.Object, String) => Boolean]   = uNone,
    key:                U[String]                           = uNone,
    searchable:         U[Boolean]                          = uNone,
    noResultsText:      U[String]                           = uNone,
    options:            U[JArray[T]]                        = uNone,
    onOptionLabelClick: U[(String, ReactEvent) => Callback] = uNone,
    optionRenderer:     U[js.Object => ReactElement]        = uNone,
    className:          U[String]                           = uNone,
    onFocus:            U[ReactEvent => Callback]           = uNone,
    ignoreCase:         U[Boolean]                          = uNone,
    disabled:           U[Boolean]                          = uNone,
    autoload:           U[Boolean]                          = uNone,
    value:              U[String]                           = uNone,
    multi:              U[Boolean]                          = uNone,
    searchPromptText:   U[String]                           = uNone,
    delimiter:          U[String]                           = uNone) = {

    val p = new TypedJsProps
    inputProps        .foreach(p.setV("inputProps"))
    onBlur            .foreach(p.setF1C("onBlur"))
    name              .foreach(p.setV("name"))
    clearable         .foreach(p.setV("clearable"))
    clearAllText      .foreach(p.setV("clearAllText"))
    filterOptions     .foreach(p.setV("filterOptions"))
    asyncOptions      .foreach(p.setV("asyncOptions"))
    onChange          .foreach(p.setF1C("onChange"))
    valueRenderer     .foreach(p.setV("valueRenderer"))
    clearValueText    .foreach(p.setV("clearValueText"))
    matchPos          .foreach(p.setV("matchPos"))
    matchProp         .foreach(p.setV("matchProp"))
    ref               .foreach(p.setV("ref"))
    allowCreate       .foreach(p.setV("allowCreate"))
    placeholder       .foreach(p.setV("placeholder"))
    filterOption      .foreach(p.setV("filterOption"))
    key               .foreach(p.setV("key"))
    searchable        .foreach(p.setV("searchable"))
    noResultsText     .foreach(p.setV("noResultsText"))
    options           .foreach(v => p.setV("options")(v.map(_.toJson)))
    onOptionLabelClick.foreach(p.setF2C("onOptionLabelClick"))
    optionRenderer    .foreach(p.setV("optionRenderer"))
    className         .foreach(p.setV("className"))
    onFocus           .foreach(p.setF1C("onFocus"))
    ignoreCase        .foreach(p.setV("ignoreCase"))
    disabled          .foreach(p.setV("disabled"))
    autoload          .foreach(p.setV("autoload"))
    value             .foreach(p.setV("value"))
    multi             .foreach(p.setV("multi"))
    searchPromptText  .foreach(p.setV("searchPromptText"))
    delimiter         .foreach(p.setV("delimiter"))

    val f = React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.ReactSelect)
    f(p).asInstanceOf[ReactComponentU_]
  }

}


trait SelectOption {
  def toJson:js.Dynamic
}
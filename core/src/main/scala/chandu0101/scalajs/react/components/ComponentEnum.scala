package chandu0101.scalajs.react.components

import scala.scalajs.js

trait ComponentEnum {
  def value: String
}

object ComponentEnum{
  implicit def toJsAny[T <: ComponentEnum](t: T): js.Any = t.value
}

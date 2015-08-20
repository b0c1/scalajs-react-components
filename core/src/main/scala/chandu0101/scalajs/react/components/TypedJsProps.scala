package chandu0101.scalajs.react.components

import japgolly.scalajs.react.CallbackTo

import scala.scalajs.js

class TypedJsProps {
  val p = js.Dynamic.literal()

  @inline def setV[T](s: String)(t: T)(implicit ev: T => js.Any): Unit =
    p.updateDynamic(s)(ev(t))

  @inline def setC[R](s: String)(f: CallbackTo[R]): Unit =
    p.updateDynamic(s)(f.toJsFunction)

  @inline def setF1C[T1, R](s: String)(f: T1 => CallbackTo[R]): Unit =
    p.updateDynamic(s)((t1: T1) => f(t1).runNow())

  @inline def setF2C[T1, T2, R](s: String)(f: (T1, T2) => CallbackTo[R]): Unit =
    p.updateDynamic(s)((t1: T1, t2: T2) => f(t1, t2).runNow())

  @inline def setF3C[T1, T2, T3, R](s: String)(f: (T1, T2, T3) => CallbackTo[R]): Unit =
    p.updateDynamic(s)((t1: T1, t2: T2, t3: T3) => f(t1, t2, t3).runNow())
}

object TypedJsProps {
  implicit def TypedJsPropsToJsAny(t: TypedJsProps): js.Any = t.p
}

object Main {
  def flatten(list: List[_]): List[Any] =list match {
  case Nil => Nil
  case (x: List[_])::xs => flatten(x) ++ flatten(xs)
  case x::xs => x::flatten(xs)
}

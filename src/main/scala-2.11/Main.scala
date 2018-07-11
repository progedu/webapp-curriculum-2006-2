object Main {
  def flatten(list: List[_]): List[Any] = list match {
    case Nil => Nil
    case (x: List[_]) :: tail => flatten(x) ::: flatten(tail)
    case x :: tail => x :: flatten(tail)
  }
}

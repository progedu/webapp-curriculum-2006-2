object Main {
  def flatten(list: List[_]): List[Any] = list match {
    case Nil => Nil
    case head :: tl => (head match {
      case x :: y => x :: flatten(y)
      case _ => List(head)
    }) ::: flatten(tl)
  }
}

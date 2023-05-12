object Main {
  def flatten(list: List[_]): List[Any] = list match {
    case (h: List[_]) :: t => flatten(h) ++ flatten(t)
    case h :: t => h :: flatten(t)
    case Nil => Nil
  }
}

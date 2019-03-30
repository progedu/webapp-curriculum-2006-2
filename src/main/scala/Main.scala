object Main {
  def flatten(list: List[_]): List[Any] =
    list.foldLeft(Nil: List[Any])((x, y) => y match {
      case l: List[_] => x ++ flatten(l)
      case _ => y :: x
    })
}

object Main {
  def flatten(list: List[_]): List[Any] = {
    list.foldLeft(Nil: List[Any]){(x, y) => y match {
      case a: List[_] => x ++ flatten(a)
      case _ => (y :: x).reverse
    }}
  }
}

object Main {
  def flatten(list: List[_]): List[Any] = {
    list
      .foldLeft(Nil: List[Any])({ (a, b) =>
        b match {
          case list_element: List[_] => a ++ flatten(list_element)
          case e                     => a ++ List(e)
        }
      })
  }
}

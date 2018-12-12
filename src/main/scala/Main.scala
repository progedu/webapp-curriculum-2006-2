object Main {
  def flatten(list: List[_]): List[Any] = 
    list.isEmpty match {    
      case true => Nil
      case false =>
        list.head match {
          case a:List[_] => flatten(a) ++ flatten(list.tail)
          case _ => list.head :: flatten(list.tail)
        }
    }    
}

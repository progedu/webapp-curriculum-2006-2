object Main {
  def flatten(list: List[_]): List[Any] = 
    list.isEmpty match {    
      case true => Nil
      case false =>
        list.head match {
          case a:List[_] => printList(a) ++ printList(list.tail)
          case _ => list.head :: printList(list.tail)
        }
    }    
}

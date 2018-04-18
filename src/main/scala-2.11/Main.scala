object Main {
  def flatten(list: List[_]): List[Any] = list match {
    case Nil => Nil
    case (hl: List[_])::(tl: List[_]) => flatten(hl):::flatten(tl)
    case h::(tl: List[_]) => h::flatten(tl)
    case (hl: List[_])::t => flatten(hl)::t
    case _ => Nil
  }
}

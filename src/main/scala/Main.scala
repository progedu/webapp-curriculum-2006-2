import scala.annotation.tailrec

object Main {
  def flatten(list: List[_]): List[Any] = {
    @tailrec
    def loop(list: List[_], stack: List[List[_]], acc: List[Any]): List[Any] = list match {
      case x::xs => x match {
        case v: List[_] => loop(v, xs :: stack, acc)
        case _ => loop(xs, stack, x::acc)
      }
      case Nil => stack match {
        case x::xs => loop(x, xs, acc)
        case Nil => acc
      }
    }
    loop(list, Nil, Nil).reverse
  }
}

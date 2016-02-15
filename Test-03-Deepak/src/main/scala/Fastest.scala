import scala.concurrent.{Promise, Future}
import scala.concurrent.ExecutionContext.Implicits.global

// Created by knoldus on 15/2/16.*/

class Fastest {

  def first(list:List[Future[Int]]): Future[Int] = {
    //require(list!=List())
    //val finalList: List[Future[Int]] = callSquare(list)
    val promise = Promise[Int]
    list.foreach(_.onComplete { case v => promise.complete(v)})

     promise.future
  }















}





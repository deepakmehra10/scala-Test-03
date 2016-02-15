import org.scalatest.FunSuite
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Await}
import  scala.concurrent.duration._
/**
  * Created by knoldus on 15/2/16.
  */
class FastestTest extends FunSuite{

val obj=new Fastest

  test("testing for list")
  {
    val f1=Future{Thread.sleep(1000);1}
    val f2=Future{Thread.sleep(2000);2}
   // val res=obj.first(List(Future(1),Future(2),Future(3),Future(4),Future(5)))
    val r =obj.first(List(f1,f2))
    val resFinal=Await.result(r,10.seconds)
    assert(1===resFinal)

  }

 /* test("test for empty list") {
    val res=obj.first(List())
val resFinal=Await.result(res,10 seconds)
  }
*/
}

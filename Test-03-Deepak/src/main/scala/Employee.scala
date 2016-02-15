/**
  * Created by knoldus on 15/2/16.
  */
case class Employee(id:Int,name:String,salary:Int)

object Test
{

 implicit val obj=new Ordering[Employee]
  {

   def compare(n:Employee,n1:Employee)= implicitly[Ordering[String]].compare(n.name,n1.name)
 }

 def sortedNames(list: List[Employee])= list.sorted.map(_.name)

}
























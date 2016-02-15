import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/2/16.
  */
class EmployeeTest extends FunSuite{

  test("testing for values")
  {
    val result=Test.sortedNames(List(new Employee(1,"geetika",5000), new Employee(2,"anubhav",6000)))
  assert(result===List("anubhav","geetika"))
  }

  test("testing for more values")
  {
    val result=Test.sortedNames(List(new Employee(1,"geetika",5000), new Employee(2,"anubhav",6000),new Employee(3,"sangeeta",8000),new Employee(4,"deepak",6000),new Employee(5,"kanika",7500)))
    assert(result===List("anubhav","deepak","geetika","kanika","sangeeta"))
  }

}


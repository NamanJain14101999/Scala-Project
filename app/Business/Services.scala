package Business
import Models.Employee
import Services._

class Services(val name: String) extends Department(name) {
  def addEmployees() = {

    val employees: Seq[Employee] = Seq(new Employee("ankit", 22),new Employee("ghanshyam", 30),new Employee("mukesh", 42),new Employee("bhanu", 22))
  //    val emp1 = new Employee("jeet", 54)
  //    val emp2 = new Employee("sandeep", 50)
  //    val emp3 = new Employee("vijaya", 46)
  //    val emp4 = new Employee("sunil", 43)
  //    val emp5 = new Employee("rakesh", 46)

    //val emp18 =
    //  val emp19 =
    //  val emp20 =
    //  val emp21 =

  //    this.addEmployee(emp1)
  //    this.addEmployee(emp2)
  //    this.addEmployee(emp3)
  //    this.addEmployee(emp4)
  //    this.addEmployee(emp5)
  this.addEmployee(employees)
}
}

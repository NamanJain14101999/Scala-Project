package Business
import Models.Employee
import Services._

class EngineeringDepartment(val name: String) extends Department(name) {
  def addEmployees() = {

    val employees: Seq[Employee] = Seq(new Employee("gnanaraj", 34),new Employee("dipankar", 22),new Employee("rohan", 23),new Employee("ashish", 30),new Employee("mumad", 29),new Employee("nitesh", 26))
    //    val emp1 = new Employee("jeet", 54)
    //    val emp2 = new Employee("sandeep", 50)
    //    val emp3 = new Employee("vijaya", 46)
    //    val emp4 = new Employee("sunil", 43)
    //    val emp5 = new Employee("rakesh", 46)
//    val emp1 =
//    val emp2 =
//    val emp3 =
//    val emp4 =
//    val emp5 =
//    val emp6 =
//    val emp7 = new Employee("naman", 23)
    //
    //    this.addEmployee(emp1)
    //    this.addEmployee(emp2)
    //    this.addEmployee(emp3)
    //    this.addEmployee(emp4)
    //    this.addEmployee(emp5)
    this.addEmployee(employees)
  }
}

package Business
import Models.Employee
import Services._

class EngineeringDepartment(val name: String) extends Department(name) {
  def addEmployees() = {

    val employees: Seq[Employee] = Seq(new Employee("gnanaraj", 34),new Employee("dipankar", 22),new Employee("rohan", 23),new Employee("ashish", 30),new Employee("mumad", 29),new Employee("nitesh", 26))
    this.addEmployee(employees)
  }
}

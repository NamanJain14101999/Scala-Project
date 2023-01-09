package Business
import Models.Employee
import Services._

class Services(val name: String) extends Department(name) {
  def addEmployees() = {

    val employees: Seq[Employee] = Seq(new Employee("ankit", 22),new Employee("ghanshyam", 30),new Employee("mukesh", 42),new Employee("bhanu", 22))
  this.addEmployee(employees)
}
}

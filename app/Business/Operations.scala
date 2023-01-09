package Business
import Models.Employee
import Services._

class Operations(val name: String) extends Department(name) {
  def addEmployees() = {

    val employees: Seq[Employee] = Seq(new Employee("tapish", 35),new Employee("ayush", 34),new Employee("surrendra", 45),new Employee("ashi", 25),new Employee("vikash", 29)  )
  this.addEmployee(employees)
}
}

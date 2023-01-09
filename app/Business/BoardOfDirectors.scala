package Business
import Models.Employee
import Services._
class BoardOfDirectors(val name: String) extends Department(name) {
  def addEmployees()={

    val employees:Seq[Employee] = Seq(new Employee("Jeet",54),new Employee("Sandeep", 50),new Employee("vijaya", 46),new Employee("sunil", 43),new Employee("rakesh", 46))
    this.addEmployee(employees)
  }
}

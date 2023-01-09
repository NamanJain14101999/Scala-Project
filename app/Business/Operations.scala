package Business
import Models.Employee
import Services._

class Operations(val name: String) extends Department(name) {
  var allEmp:Seq[Employee]= null

  def addEmployees() = {

//    val employees: Seq[Employee] = Seq(new Employee("tapish", 35),new Employee("ayush", 34),new Employee("surrendra", 45),new Employee("ashi", 25),new Employee("vikash", 29)  )
    allEmp = Seq(new Employee("tapish", 35),new Employee("ayush", 34),new Employee("surrendra", 45),new Employee("ashi", 25),new Employee("vikash", 29)  )
  this.addEmployee(allEmp)
}

  def getRecommendatedEmpoyees(): List[Employee] = {
    val emp = this.allEmp.filter(employee => employee.age > 40)
    emp.toList
  }
}

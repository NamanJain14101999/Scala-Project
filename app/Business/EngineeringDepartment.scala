package Business
import Models.Employee
import Services._

class EngineeringDepartment(val name: String) extends Department(name) {
  var allEmp:Seq[Employee]= null
  def addEmployees() = {

//    val employees: Seq[Employee] = Seq(new Employee("gnanaraj", 34),new Employee("dipankar", 22),new Employee("rohan", 23),new Employee("ashish", 30),new Employee("mumad", 29),new Employee("nitesh", 26))
    this.allEmp= Seq(new Employee("gnanaraj", 44),new Employee("dipankar", 22),new Employee("rohan", 23),new Employee("ashish", 30),new Employee("mumad", 29),new Employee("nitesh", 26))
    this.addEmployee(allEmp)
  }
  def getRecommendatedEmpoyees():List[Employee]={
    val emp =  this.allEmp.filter(employee=>employee.age>40)
    emp.toList
  }
}

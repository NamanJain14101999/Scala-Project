package Business
import Models.Employee
import Services._

class Operations(val name: String) extends Department(name) {
  def addEmployees() = {

    val employees: Seq[Employee] = Seq(new Employee("tapish", 35),new Employee("ayush", 34),new Employee("surrendra", 45),new Employee("ashi", 25),new Employee("vikash", 29)  )
  //    val emp1 = new Employee("jeet", 54)
  //    val emp2 = new Employee("sandeep", 50)
  //    val emp3 = new Employee("vijaya", 46)
  //    val emp4 = new Employee("sunil", 43)
  //    val emp5 = new Employee("rakesh", 46)
//  val emp13 =
//
//    val emp13 = new Employee("tapish", 35)
//    val emp14 =
//    val emp15 =
//    val emp16 =
//    val emp17 =
//    val emp14 = new Employee("ayush", 34)
//    val emp15 = new Employee("surrendra", 45)
//    val emp16 = new Employee("ashi", 25)
//    val emp17 = new Employee("vikash", 29)
//    val str13 = o.addEmployee(emp13)
//    val str14 = o.addEmployee(emp14)
//    val str15 = o.addEmployee(emp15)
//    val str16 = o.addEmployee(emp16)
//    val str17 = o.addEmployee(emp17)
  //
  //    this.addEmployee(emp1)
  //    this.addEmployee(emp2)
  //    this.addEmployee(emp3)
  //    this.addEmployee(emp4)
  //    this.addEmployee(emp5)
  this.addEmployee(employees)
}
}

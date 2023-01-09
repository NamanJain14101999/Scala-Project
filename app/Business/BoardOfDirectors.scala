package Business
import Models.Employee
import Services._
class BoardOfDirectors(val name: String) extends Department(name) {
  def addEmployees()={

    val employees:Seq[Employee] = Seq(new Employee("Jeet",54),new Employee("Sandeep", 50),new Employee("vijaya", 46),new Employee("sunil", 43),new Employee("rakesh", 46))
//    val emp1 = new Employee("jeet", 54)
//    val emp2 = new Employee("sandeep", 50)
//    val emp3 = new Employee("vijaya", 46)
//    val emp4 = new Employee("sunil", 43)
//    val emp5 = new Employee("rakesh", 46)
////          val empSeq = empSet.toSeq
    ////          empSet.map(ele=>employeeList+=ele)
    ////          empSeq.foreach(item=>employeeList.addOne(item))
    ////          for(item <- 0 to empSet.length)
    ////            {
    ////              println(item)
    ////              employeeList +=empSet(item)
    ////            }
//    this.addEmployee(emp1)
//    this.addEmployee(emp2)
//    this.addEmployee(emp3)
//    this.addEmployee(emp4)
//    this.addEmployee(emp5)
    this.addEmployee(employees)
  }
}

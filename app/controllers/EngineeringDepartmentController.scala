package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import Business._
import play.api.libs.json._
import Models._


class EngineeringDepartmentController@Inject()(val controllerComponents: ControllerComponents) extends BaseController  {
  implicit val employeeJson = Json.format[Employee]
  val emp1 = new Employee("gnanaraj", 34)
  val emp2 = new Employee("dipankar", 22)
  val emp3 = new Employee("rohan", 23)
  val emp4 = new Employee("ashish", 30)
  val emp5 = new Employee("mumad", 29)
  val emp6 = new Employee("nitesh", 26)
  val emp7 = new Employee("naman", 23)


  def ED(text: String) = Action {
    val ed = new EngineeringDepartment("Engineering Department")
    val str8 = ed.addEmployee(emp1)
    val str9 = ed.addEmployee(emp2)
    val str10 = ed.addEmployee(emp3)
    val str11 = ed.addEmployee(emp4)
    val str12 =ed.addEmployee(emp5)
    val str13 = ed.addEmployee(emp6)
    val str14 = ed.addEmployee(emp7)
    var result: String = null
    if (text == "totalDepartmentAge") {
      result = ed.totalDepartmentAge().toString
      Ok(result)
    }
    else if (text == "getElderEmployeeAge") {
      result = ed.getElderEmployee().toString
      Ok(result)

    }
    else if (text == "getYoungerEmployeeAge") {
      result = ed.getYoungerEmployee().toString
      Ok(result)
    }
    else if (text == "averageDepartmentAge") {
      result = ed.averageDepartmentAge().toString
      Ok(result)
    }
    else if (text == "aviableDepartmentVacancy") {
      result = ed.aviableDepartmentVacancy().toString
      Ok(result)
    } else if (text == "getTotalEmployee") {
      result = ed.getTotalEmployee().toString
      Ok(result)
    }
    else {
      NotFound("not able to found the data")
    }


  }
}

package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import Business._
import play.api.libs.json._
import Models._

class OperationsDepartmentController @Inject()(val controllerComponents: ControllerComponents) extends BaseController{
  implicit val employeeJson = Json.format[Employee]
  val emp13 = new Employee("tapish", 35)
  val emp14 = new Employee("ayush", 34)
  val emp15 = new Employee("surrendra", 45)
  val emp16 = new Employee("ashi", 25)
  val emp17 = new Employee("vikash", 29)

  def O(text: String) = Action {
    val o = new Operations("Operations")
    val str13 = o.addEmployee(emp13)
    val str14 = o.addEmployee(emp14)
    val str15 = o.addEmployee(emp15)
    val str16 = o.addEmployee(emp16)
    val str17 = o.addEmployee(emp17)
    var result: String = null
    if (text == "totalDepartmentAge") {
      result =o.totalDepartmentAge().toString
      Ok(result)
    }
    else if (text == "getElderEmployeeAge") {
      result = o.getElderEmployee().toString
      Ok(result)

    }
    else if (text == "getYoungerEmployeeAge") {
      result = o.getYoungerEmployee().toString
      Ok(result)
    }
    else if (text == "averageDepartmentAge") {
      result = o.averageDepartmentAge().toString
      Ok(result)
    }
    else if (text == "aviableDepartmentVacancy") {
      result = o.aviableDepartmentVacancy().toString
      Ok(result)
    } else if (text == "getTotalEmployee") {
      result = o.getTotalEmployee().toString
      Ok(result)
    }
    else {
      NotFound("not able to found the data")
    }


  }
}

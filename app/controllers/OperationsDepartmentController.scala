package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import Business._
import play.api.libs.json._
import Models._

class OperationsDepartmentController @Inject()(val controllerComponents: ControllerComponents) extends BaseController{
  implicit val employeeJson = Json.format[Employee]


  def O(text: String) = Action {
    val o = new Operations("Operations")
    o.addEmployees()

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

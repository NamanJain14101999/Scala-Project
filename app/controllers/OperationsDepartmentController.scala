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
    text match {
      case "totalDepartmentAge" => Ok(Json.toJson(o.totalDepartmentAge()))
      case "getElderEmployeeAge" => Ok(Json.toJson(o.getElderEmployee()))
      case "getYoungerEmployeeAge" => Ok(Json.toJson(o.getYoungerEmployee()))
      case "averageDepartmentAge" => Ok(Json.toJson(o.averageDepartmentAge()))
      case "aviableDepartmentVacancy" => Ok(Json.toJson(o.aviableDepartmentVacancy()))
      case "getTotalEmployee" => Ok(Json.toJson(o.getTotalEmployee()))
      case _ => NotFound("PATH IS NOT CORRECT")
    }


  }
}

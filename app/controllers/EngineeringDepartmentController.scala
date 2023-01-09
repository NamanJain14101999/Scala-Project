package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import Business._
import play.api.libs.json._
import Models._


class EngineeringDepartmentController@Inject()(val controllerComponents: ControllerComponents) extends BaseController  {
  implicit val employeeJson = Json.format[Employee]

  def ED(text: String) = Action {
    val ed = new EngineeringDepartment("Engineering Department")
    ed.addEmployees()
    text match {
      case "totalDepartmentAge" => Ok(Json.toJson(ed.totalDepartmentAge()))
      case "getElderEmployeeAge" => Ok(Json.toJson(ed.getElderEmployee()))
      case "getYoungerEmployeeAge" => Ok(Json.toJson(ed.getYoungerEmployee()))
      case "averageDepartmentAge" => Ok(Json.toJson(ed.averageDepartmentAge()))
      case "aviableDepartmentVacancy" => Ok(Json.toJson(ed.aviableDepartmentVacancy()))
      case "getTotalEmployee" => Ok(Json.toJson(ed.getTotalEmployee()))
      case _ => NotFound("PATH IS NOT CORRECT")
    }


  }
}

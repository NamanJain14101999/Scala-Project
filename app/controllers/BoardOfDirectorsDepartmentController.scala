package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import Business.BoardOfDirectors
import play.api.libs.json._
import Models._
import Services.Department

class BoardOfDirectorsDepartmentController@Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  implicit val employeeJson = Json.format[Employee]

  def BOD(text:String)= Action{

      val bod = new BoardOfDirectors("Board of Director")
      bod.addEmployees()
      text match {
            case "totalDepartmentAge" =>  Ok(Json.toJson(bod.totalDepartmentAge()))
            case "getElderEmployeeAge" => Ok(Json.toJson(bod.getElderEmployee()))
            case "getYoungerEmployeeAge" => Ok(Json.toJson(bod.getYoungerEmployee()))
            case "averageDepartmentAge" => Ok(Json.toJson(bod.averageDepartmentAge()))
            case "aviableDepartmentVacancy" =>  Ok(Json.toJson(bod.aviableDepartmentVacancy()))
            case "getTotalEmployee" =>         Ok(Json.toJson(bod.getTotalEmployee()))
            case _ => NotFound("PATH IS NOT CORRECT")
      }

    }
}
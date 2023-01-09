package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import Business._
import play.api.libs.json._
import Models._

class ServicesDepartmentController@Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  implicit val employeeJson = Json.format[Employee]
  def S(text: String) = Action {
    val s = new Services("Services")
    s.addEmployees()
    text match {
      case "totalDepartmentAge" => Ok(Json.toJson(s.totalDepartmentAge()))
      case "getElderEmployeeAge" => Ok(Json.toJson(s.getElderEmployee()))
      case "getYoungerEmployeeAge" => Ok(Json.toJson(s.getYoungerEmployee()))
      case "averageDepartmentAge" => Ok(Json.toJson(s.averageDepartmentAge()))
      case "aviableDepartmentVacancy" => Ok(Json.toJson(s.aviableDepartmentVacancy()))
      case "getTotalEmployee" => Ok(Json.toJson(s.getTotalEmployee()))
      case _ => NotFound("PATH IS NOT CORRECT")
    }




  }
}

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

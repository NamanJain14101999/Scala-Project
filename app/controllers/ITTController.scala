package controllers

import Business.{BoardOfDirectors, EngineeringDepartment, Operations, Services}
import Models.Employee
import play.api.libs.json.Format.GenericFormat
import play.api.libs.json.OFormat.oFormatFromReadsAndOWrites
import play.api.libs.json.{Format, JsNumber, JsObject, JsResult, JsString, JsSuccess, JsValue, Json, Writes}
import play.api.mvc.{BaseController, ControllerComponents}

import javax.inject.Inject


class ITTController@Inject()(val controllerComponents: ControllerComponents) extends BaseController  {

  def itt(text: String) = Action {
    val bod = new BoardOfDirectors("Board of Director")
    val ed = new EngineeringDepartment("Engineering Department")
    val o = new Operations("Operations")
    val s = new Services("Services")

    bod.addEmployees()
    ed.addEmployees()
    o.addEmployees()
    s.addEmployees()

    text match {
      case "averageAgeOfITT" => {
        val totalDepartmentAge = bod.totalDepartmentAge() + ed.totalDepartmentAge() + s.totalDepartmentAge() + o.totalDepartmentAge()
        val totalEmpoyee = bod.getTotalEmployee() + ed.getTotalEmployee() + s.getTotalEmployee() + o.getTotalEmployee()
        Ok(Json.toJson(totalDepartmentAge/totalEmpoyee.toDouble))
      }
      case "totalAgeOfITT" =>{
        val totalDepartmentAge = bod.totalDepartmentAge() + ed.totalDepartmentAge() + s.totalDepartmentAge() + o.totalDepartmentAge()
        Ok(Json.toJson(totalDepartmentAge))
      }
      case "recommendation" => {

        val emp:List[Employee] = ed.getRecommendatedEmpoyees()++o.getRecommendatedEmpoyees()
        Ok(emp.toString())
      }
      case _ => NotFound("PATH IS NOT CORRECT")
    }
  }

}

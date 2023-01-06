package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import Business._
import play.api.libs.json._
import Models._

class ServicesDepartmentController@Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  implicit val employeeJson = Json.format[Employee]

  val emp18 = new Employee("ankit", 22)
  val emp19 = new Employee("ghanshyam", 30)
  val emp20 = new Employee("mukesh", 42)
  val emp21 = new Employee("bhanu", 22)

  def S(text: String) = Action {
    val s = new Services("Services")
    val str18 = s.addEmployee(emp18)
    val str19 = s.addEmployee(emp19)
    val str20 = s.addEmployee(emp20)
    val str21 = s.addEmployee(emp21)
    var result: String = null
    if (text == "totalDepartmentAge") {
      result = s.totalDepartmentAge().toString
      Ok(result)
    }
    else if (text == "getElderEmployeeAge") {
      result = s.getElderEmployee().toString
      Ok(result)

    }
    else if (text == "getYoungerEmployeeAge") {
      result = s.getYoungerEmployee().toString
      Ok(result)
    }
    else if (text == "averageDepartmentAge") {
      result = s.averageDepartmentAge().toString
      Ok(result)
    }
    else if (text == "aviableDepartmentVacancy") {
      result = s.aviableDepartmentVacancy().toString
      Ok(result)
    } else if (text == "getTotalEmployee") {
      result = s.getTotalEmployee().toString
      Ok(result)
    }
    else {
      NotFound("not able to found the data")
    }




  }
}

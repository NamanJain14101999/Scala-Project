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

  val emp1 = new Employee("gnanaraj", 34)
  val emp2 = new Employee("dipankar", 22)
  val emp3 = new Employee("rohan", 23)
  val emp4 = new Employee("ashish", 30)
  val emp5 = new Employee("mumad", 29)
  val emp6 = new Employee("nitesh", 26)
  val emp7 = new Employee("naman", 23)


  val emp13 = new Employee("tapish", 35)
  val emp14 = new Employee("ayush", 34)
  val emp15 = new Employee("surrendra", 45)
  val emp16 = new Employee("ashi", 25)
  val emp17 = new Employee("vikash", 29)

  val emp18 = new Employee("ankit", 22)
  val emp19 = new Employee("ghanshyam", 30)
  val emp20 = new Employee("mukesh", 42)
  val emp21 = new Employee("bhanu", 22)

  def BOD(text:String)= Action{
    val bod = new BoardOfDirectors("Board of Director")
    bod.addEmployees()
    var result: String = null
    if(text=="totalDepartmentAge")
      {
        result = bod.totalDepartmentAge().toString
        Ok(result)
      }
    else if(text=="getElderEmployeeAge")
      {
        result = bod.getElderEmployee().toString
        Ok(result)

      }
    else if(text=="getYoungerEmployeeAge")
      {
        result = bod.getYoungerEmployee().toString
        Ok(result)
      }
    else if (text == "averageDepartmentAge")
    {
      result = bod.averageDepartmentAge().toString
      Ok(result)
    }
    else if (text == "aviableDepartmentVacancy")
    {
      result = bod.aviableDepartmentVacancy().toString
      Ok(result)
    }
    else if (text == "getTotalEmployee")
    {
      result = bod.getTotalEmployee().toString
      Ok(result)
    }
    else{
      NotFound("PATH IS NOT CORRECT")
    }


  }
}
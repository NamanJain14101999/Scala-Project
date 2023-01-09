package Business

//import Business.DepartmentStatus.DepartmentStatus
import Models._
import Constants.DepartmentStatus.DepartmentStatus
abstract class AbstarctDepartments {
  val departmentName :String = null
     def getElderEmployee(): Employee
     def getYoungerEmployee(): Employee
     def totalDepartmentAge(): Int
     def averageDepartmentAge(): Double
     def aviableDepartmentVacancy(): Int
     def addEmployee(emp: Seq[Employee]): DepartmentStatus
     def getTotalEmployee(): Int

}

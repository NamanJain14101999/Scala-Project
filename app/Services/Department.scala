package Services

import Business.AbstarctDepartments
import Constants.DepartmentStatus
import Constants.DepartmentStatus.DepartmentStatus
import Models.Employee
import scala.annotation.tailrec
import scala.collection.immutable.Vector
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

case class Department(Name:String) extends AbstarctDepartments {

  override val departmentName: String = Name
  val employeeList:ListBuffer[Employee] = ListBuffer[Employee]()

  override def getElderEmployee(): Employee = this.employeeList.maxBy(emp=>emp.age)

  override def getYoungerEmployee(): Employee  = this.employeeList.minBy(emp=>emp.age)

  override def totalDepartmentAge(): Int = {
    def totalAge(employe:ListBuffer[Employee]):Int= {
    @tailrec
    def sum(ageSum: Int, employees: ListBuffer[Employee]): Int =
      if (employees.isEmpty) ageSum
      else sum(ageSum + employees.head.age, employees.tail)

    sum(1,employe)
    }
    totalAge(employeeList)
  }

  override def averageDepartmentAge(): Double = totalDepartmentAge() / getTotalEmployee().toDouble

  override def aviableDepartmentVacancy(): Int = 6 - getTotalEmployee()

  override def addEmployee(emp: Employee): DepartmentStatus = {
    employeeList.length match {
      case 5 => DepartmentStatus.FAIL
      case _ => {
        if(emp.age<21)
          DepartmentStatus.AGE
        else
          {
            employeeList+=emp
            DepartmentStatus.SUCCESS

          }
      }
    }
//    if (employeeList.length > 5) {
//      return DepartmentStatus.FAIL
//    } else {
//      if (emp.age > 21) {
//        employeeList += emp
//        return DepartmentStatus.SUCCESS
//      } else {
//        return DepartmentStatus.AGE
//      }
//    }
  }

  override def getTotalEmployee(): Int = employeeList.length
}


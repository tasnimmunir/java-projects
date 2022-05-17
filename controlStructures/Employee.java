// Employee.java
// Employee class.

public class Employee {
   private String name;
   private int idNumber;
   private String department;
   private String position;
   private double salary;

   // constructor 1
   public Employee(String name, int idNumber, String department,String position,double salary) {
      this.name = name;
      this.idNumber = idNumber;
      this.department = department;
      this.position = position;
      if (salary >= 0 && salary <= 90000)   { // determine whether salary is between 0 - 90,000 inclusive
         this.salary = salary;
      } else {
         this.salary = 0.0;
      }
   }
   // constructor 2
   public Employee(String name, int idNumber) {
      this.name = name;
      this.idNumber = idNumber;
      this.department = "";
      this.position = "";
      this.salary = 0.0;
   }
   // constructor 3
   public Employee() {
      name = "";
      department = "";
      position = "";
      idNumber = 0;
      salary = 0;
   }



   // set Employee's name
   public void setName(String name) {
      this.name = name;
   }
   // get Employee's name
   public String getName(){
      return name;
   }

   // set employee idnumber
   public void setIdNumber(int idNumber) {
      this.idNumber = idNumber;
   }
   // get employee idnumber
   public int getIdNumber() {return idNumber;}


   //set employee department
   public void setDepartment(String department) {
      this.department = department;
   }
   // get employee department
   public String getDepartment() { return department; }


   //set employee position
   public void setPosition(String Position) {
      this.position = position;
   }
   // get employee position
   public String getPosition() { return position; }



   // set Employee's annual salary
   public void setsalary(double salary) {
      if (salary >= 0 && salary <= 90000) {// determine whether salary is positive
         this.salary = salary;
      } else {
         this.salary = 0.0;
      }
   }

   // get Employee's annual salary
   public double getsalary() {return salary; }
} // end class Employee



package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
   private String employeeId;
   private String name;
   private String department;
   private double payRate;
   private double hoursWorked;
   private double startTime;

   public Employee(String employeeId, String name, String department, double payRate, double hoursWorked){
       this.employeeId = employeeId;
       this.name = name;
       this.department = department;
       this.payRate = payRate;
       this.hoursWorked = hoursWorked;
   }

    public Employee() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {

       return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //have to add the derived Getters and setters
    public double getRegularHours() {
       return Math.min(hoursWorked, 40);
    }
    public double getOvertimehours() {
       return Math.max(0, hoursWorked - 40);
    }
    public double getTotalPay() {
       return getRegularHours() * payRate + getOvertimehours() * payRate * 1.5;
    }
    
    public void punchIn(double time) {
        double startTime = time;
        System.out.println(name + " punched in at " + time);
    }

    //overloader using the current time
    public void punchIn() {
       LocalDateTime now = LocalDateTime.now();
       double currentTime = now.getHour() + now.getMinute() / 60.0;
       this.startTime = currentTime;
        System.out.println(name + "Punched in at" + currentTime + " (current time)" );
    }
    
    public void punchOut(double time) {
        if (time > startTime) {
            double worked = time - startTime;
            hoursWorked += worked;
            System.out.println(name + "punched out at " + time + " (worked " + worked + " hours)");
        } else{
                System.out.println("Invalid punch-out time.");
            }
            }

    //overloader using current time
  public void punchOut() {
       LocalDateTime now = LocalDateTime.now();
       double currentTime = now.getHour() + now.getMinute() / 60.0;
       if (currentTime > startTime) {
           double worked = currentTime - startTime;
           hoursWorked += worked;
           System.out.println(" Punched out at " + currentTime + " (worked " + worked + "hours) ");
       } else {
           System.out.println("Invalid punch-out time");
       }

  }
}

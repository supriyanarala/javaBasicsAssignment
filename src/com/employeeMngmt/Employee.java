package com.employeeMngmt;

public class Employee implements Comparable{
    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;

    public float getEmpSalary() {
        return empSalary;
    }

    private float empSalary;

    public int getEmpId() {
        return empId;
    }

    public Employee() {
    }

    public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
       this.empId = empId;
       this.empName = empName;
       this.empEmail = empEmail;
       this.empGender = empGender;
       this.empSalary = empSalary;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Email: " + empEmail);
        System.out.println("Employee Gender: " + empGender);
        System.out.println("Employee Salary: " + empSalary);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

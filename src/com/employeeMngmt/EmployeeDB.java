package com.employeeMngmt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {

    ArrayList<Employee> emp = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        System.out.println("employe data added"+e.getEmpId());
       return emp.add(e);
       // return emp.add(new Employee(1, "Sup", "sup@gmail.com", 'F', 20000));
    }

    public boolean deleteEmployee(int empId) {

        Iterator<Employee> iterator = emp.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
//              emp.remove(employee);
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (int i = 0; i < emp.size(); i++) {
            Employee employee = emp.get(i);
            if(employee.getEmpId() == empId){
                return "Payslip: "+empId+" Emp Salary"+employee.getEmpSalary();
            }
        }
        return "Employee not found.";
    }




    public Employee[] listAll() {
        return emp.toArray(new Employee[0]);
    }
}
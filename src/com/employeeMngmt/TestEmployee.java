package com.employeeMngmt;


import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {
    public static void main(String[] args) {

        System.out.println("ArrayList:");
        EmployeeDB employeeDB1 = new EmployeeDB();
        Employee emp1 = new Employee(1, "Sup", "sup@gmail.com", 'F', 5000);
        Employee emp2 = new Employee(2, "Ria", "ria@gmail.com", 'F', 6000);
//        employeeDB1.addEmployee(emp1);
//        employeeDB1.addEmployee(emp2);
//       String res =  employeeDB1.showPaySlip(2);
//        System.out.println("Showing payslip "+res);
//        Employee[] employees = employeeDB1.listAll();
//        for (Employee employee : employees) {
//            employee.getEmployeeDetails();
//        }

        // Test functionality using TreeSet
        System.out.println("\n TreeSet:");
        Set<Employee> empData = new TreeSet<Employee>();
        empData.add(emp1);
        empData.add(emp2);

        Iterator iterator = empData.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // TreeSet implementation would require implementing Comparable interface in Employee class
        // However, TreeSet would sort based on EmpId automatically

        // Test other functionalities like deleteEmployee, showPaySlip here
    }
}



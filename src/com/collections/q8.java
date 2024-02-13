package com.collections;

//Write a program that will have a Vector which is capable of storing emp objects.
// Use an Iterator and enumeration to list all the elements of the Vector. //List, Vector

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class q8 {
    public static void main(String[] args) {
        Vector<Employee> v = new Vector<Employee>();
        Employee emp1 = new Employee(1,"sup","abc st",4000.00);
        v.add(emp1);
        v.add(new Employee(2,"pup","def st",4000.00));
        listEmployees(v);
    }

    private static void listEmployees(Vector<Employee> v) {
        Iterator<Employee> iterator = v.iterator();
        System.out.println("Using Iterator");
        while(iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println(emp.toString());
            System.out.print("EmpId: " + emp.getId());
            System.out.print(" EmpName: " + emp.getName());
            System.out.print(" addr: " + emp.getAddress());
            System.out.print(" Salary: " + emp.getSal() + "\n");
        }

        Enumeration<Employee> enume = v.elements();
        System.out.println("using Enumerator");
        while(enume.hasMoreElements()){
          Employee emp2 = enume.nextElement();
          System.out.println(emp2);
          System.out.print("EmpId: " + emp2.getId());
          System.out.print(" EmpName: " + emp2.getName());
          System.out.print(" addr: " + emp2.getAddress());
          System.out.print(" Salary: " + emp2.getSal() + "\n");
        }
    }
}

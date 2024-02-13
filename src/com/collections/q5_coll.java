package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



//Create an ArrayList of Employee( id,name,address,sal) objects
// and search for particular Employee object based on id number.
public class q5_coll {
    public static List<Employee> alEmp = new ArrayList<Employee>();
    public static void main(String[] args) {
        Employee emp = new Employee();
        alEmp.add(new Employee(1,"Sup","abc st",4000.00));
        alEmp.add(new Employee(2,"pup","def st",3000.00));
        alEmp.add(new Employee(3,"lup","ghu st",2000.00));
        alEmp.add(new Employee(4,"mup","klj st",1000.00));

        searchEmp(3);
    }

    private static void searchEmp(int i) {
        Iterator iterator = alEmp.iterator();
        while(iterator.hasNext()){
            Employee emp = (Employee) iterator.next();
            if(emp.getId() == i){
                System.out.println("EmpId: "+emp.getId());
                System.out.println("EmpName: "+emp.getName());
                System.out.println("addr: "+emp.getAddress());
                System.out.println("Salary: "+emp.getSal());
            }
        }
    }
}

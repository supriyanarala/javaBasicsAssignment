package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//3.Create an ArrayList which will be able to store only Strings.
// Create a printAll method which will print all the elements using an Iterator.
//
//List iterator
//Create an ArrayList which will be able to store only numbers like int,float,double,etc,
// but not any other data type.
//
//List ArrayList
public class q3_q4_coll {
    public static void main(String[] args) {
        List<String> alString = new ArrayList<String>();
        alString.add("Supriya");
        alString.add("Prasa");
        alString.add("joshna");
        alString.add("Preethi");
        printAll(alString);

        List<Number> alNumbers = new ArrayList<>();
        alNumbers.add(1);
        alNumbers.add(4.0);
        alNumbers.add(1234.00);
        alNumbers.add(3.123);

    }

    private static void printAll(List<String> alString) {

        Iterator iterator = alString.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

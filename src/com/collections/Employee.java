package com.collections;

public class Employee {

    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    private Double sal;

    public Employee(int id, String name, String address, Double sal) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sal = sal;
    }

    public Employee() {
    }
}

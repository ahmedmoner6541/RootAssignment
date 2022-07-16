package com.company.oop;

public abstract class Employee {
    protected int id ;
    protected String name ;
    protected int age ;
    protected double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void view(){
        System.out.println("id = "+id );
        System.out.println("name = "+name );
        System.out.println("age = "+age );
        System.out.println("salary = "+ calculateSalary());
    }
    public  double calculateSalary(){
        return 0 ;
    }


}

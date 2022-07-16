package com.company.oop;

public class Developer extends Employee {
    private String framword;

    public Developer() {
    }

    public Developer(int id, String name, int age, double salary, String framword) {
        super(id, name, age, salary);
        this.framword = framword;
    }

    public String getFramword() {
        return framword;
    }

    public void setFramword(String framword) {
        this.framword = framword;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("framword = " + framword);
    }

    @Override
    public double calculateSalary() {
        return salary + (salary * .25);
    }
}

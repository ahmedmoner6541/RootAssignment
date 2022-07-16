package com.company.oop;

import com.company.oop.Employee;

public class Accountant extends Employee {

    private boolean cmaCertified ;

    public Accountant(int id, String name, int age, double salary, boolean cmaCertified) {
        super(id, name, age, salary);
        this.cmaCertified = cmaCertified;
    }

    public boolean isCmaCertified() {
        return cmaCertified;
    }

    public void setCmaCertified(boolean cmaCertified) {
        this.cmaCertified = cmaCertified;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("cmaCertified = "+ isCmaCertified());

    }
}

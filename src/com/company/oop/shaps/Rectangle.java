package com.company.oop.shaps;

public class Rectangle extends Shap {

    public Rectangle(double width, double heihgt) {
        super(width, heihgt);
    }

    @Override
    public void draw() {
        for (int i = 0; i < getHeihgt(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    @Override
    public double calculateArea() {
        return getWidth() * getHeihgt();
    }
}

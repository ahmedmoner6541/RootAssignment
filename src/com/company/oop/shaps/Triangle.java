package com.company.oop.shaps;

public class Triangle extends Shap {
    public Triangle(double width, double heihgt) {
        super(width, heihgt);
    }

    @Override
    public void draw() {
        for (int i = 0; i < getHeihgt(); i++) {
            for (int j = 0; j < getWidth()-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }

    @Override
    public double calculateArea() {
        return (getHeihgt() * getWidth()) * .5;
    }
}

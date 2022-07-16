package com.company.oop.shaps;

public abstract class Shap {
    private final double width;
    private double heihgt;

    public Shap(double width, double heihgt) {
        this.width = width;
        this.heihgt = heihgt;
    }

    public double getWidth() {
        return width;
    }

    public double getHeihgt() {
        return heihgt;
    }

    public void setHeihgt(double heihgt) {
        this.heihgt = heihgt;
    }
    public abstract void draw();
    public abstract double calculateArea();



  /*  public void draw() {
        System.out.println("invalid shape");
    }

    public double calculateArea() {
        System.out.println("invalid shape");
        return 0;
    }*/
}

package com.company.oop.assignmentOne;

public class Holiday {
    private String name;
    private int day;
    private String month;
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public boolean inSameMonth(Holiday holiday, Holiday holiday2) {
        return holiday == holiday2;
    }

    public double avgDate(Holiday[] hol) {
        int sum = 0;
        for (int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].getDay();
        }
        return sum / hol.length;
    }

}

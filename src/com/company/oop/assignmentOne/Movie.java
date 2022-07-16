package com.company.oop.assignmentOne;

import java.util.Arrays;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = "BG3";
    }
    public Movie[] getBG(Movie[] arr) {
        Movie[] newArray = new Movie[arr.length];
        int counter = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].rating.equals("BG")) {
                newArray[counter] = arr[i];
                counter++;
            }
        }
        return newArray;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("one1 ","st1","PG");
        Movie movie2 = new Movie("one2 ","st2","PG2");
        Movie movie3 = new Movie("one3 ","st3","PG3");
        Movie movie4 = new Movie("one4 ","st4","PG4");
        Movie movie5 = new Movie("one5 ","st5","PG5");

        Movie[] arr = {movie1,movie2,movie3,movie4,movie5};

        Movie[] newArr = movie1.getBG(arr);
        System.out.println(Arrays.toString(newArr));
    }
}

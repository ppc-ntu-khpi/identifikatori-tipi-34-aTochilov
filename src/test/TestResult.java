package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        short start = 14;
        short end = 30;
        System.out.println("Evil numbers between " +start+ " and " +end+ 
                " are: "+Exercise.Calculate(start, end));
    }
}
package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {



        String even = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                even += Integer.toString(i);
            }
        }
        return even;
    }
    public static String getOddNumbers(int start, int stop) {


        String odd = "";
        for (int i = start; i < stop; i++){
            if (i % 2 != 0){
                odd += Integer.toString(i);
            }
        }
        return odd;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        //Description
        //Given two integers, start, and stop, return a String concatenation of all values squared between start up to and not including stop.

        String square = "";
        int squared;
        for (int i = start; i < stop; i+=step) {
            squared = (int) Math.pow(i,2);
            square += Integer.toString(squared);
        }
        return square;
    }

    public static String getRange(int stop) {
        String actual = "";
        for (int i = 0; i < stop; i++){
            actual += i;
        }
        return actual;
    }

    public static String getRange(int start, int stop) {
        String actual = "";
        for (int i = start; i < stop; i++){
            actual += i;
        }
        return actual;
    }

    public static String getRange(int start, int stop, int step) {
        String actual = "";
        for (int i = start; i < stop; i+=step){
            actual += i;
        }
        return actual;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exp = "";
        int expt;
            for (int i = start; i < stop; i+=step){
            expt = (int) Math.pow(i,exponent);
            exp += Integer.toString(expt);
        }
            return exp;
    }
}

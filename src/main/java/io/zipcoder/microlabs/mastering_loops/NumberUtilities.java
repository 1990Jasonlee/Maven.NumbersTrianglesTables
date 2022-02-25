package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        // : Given
        //int start = 5;
        // int stop = 20;
        // : When
        //String outcome = NumberUtilities.getEvenNumbers(min, max);
// : Then
//System.out.println(outcome);

        String even = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                even += Integer.toString(i);
            }
        }
        return even;
    }
    public static String getOddNumbers(int start, int stop) {
    // : Given
    //int start = 5;
    //int stop = 20;
    // : When
    //String outcome = NumberUtilities.getOddNumbers(min, max);

// : Then
//System.out.println(outcome);
        String odd = "";
        for (int i = start; i < stop; i++){
            if (i % 2 != 0){
                odd += Integer.toString(i);
            }
        }
        return odd;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    // : Given
    //int start = 5;
    //int stop = 20;
    // : When
    //String outcome = NumberUtilities.getOddNumbers(min, max);
// : Then
//System.out.println(outcome);
    public static String getRange(int start) {
        return null;
    }

    // : Given
    //int start = 5;
    //int stop = 20;
    //int step = 5;
    // : When
    //String outcome = NumberUtilities.getRange(min, max, step);
// : Then
//System.out.println(outcome);

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
    // : Given
    //int start = 5;
    //int stop = 20;
    //int step = 5;
    // int exponent = 2;
    // : When
    //String outcome = NumberUtilities.getOddNumbers(min, max);
// : Then
//System.out.println(outcome);

}

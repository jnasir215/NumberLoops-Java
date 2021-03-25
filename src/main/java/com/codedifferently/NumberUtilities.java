package com.codedifferently;

public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for(int i = start; i < stop; i++) {
            if(i % 2 == 0) {
                continue;
            } sb.append(i);
        }
        return sb.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for(int i = start; i < stop; i++) {
            if(i % 2 != 0) {
                continue;
            } sb.append(i);
        }
        return sb.toString();
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();

        for(int i = start; i < stop; i += step) {
            sb.append(i*i);
        }
        return sb.toString();
    }

    public static String getRange(int stop) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < stop; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for(int i = start; i < stop; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();

        for(int i = start; i < stop; i += step) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();

        for(int i = start; i < stop; i += step) {
            sb.append((int)Math.pow(i,exponent));
        }
        return sb.toString();
    }
}

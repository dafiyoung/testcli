package com.company;

/**
 * Created by patrick on 3/19/17.
 */
public class TestVariableParams {
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v > largest) {
                largest = v;
            }
        }

        return largest;
    }


    public static void main(String[] args) {
        double m = max(1, 2, 3, 4, 5, 6);
        System.out.println(m);
    }
}
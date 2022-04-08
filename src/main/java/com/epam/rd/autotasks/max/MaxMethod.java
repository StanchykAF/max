package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        if (values == null) {
            throw new UnsupportedOperationException();
        }
        int maxValue = values[0];
        for (int elem : values) {
            if (maxValue < elem) {
                maxValue = elem;
            }
        }
        return maxValue;
    }
}

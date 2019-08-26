package com.epam.java_basic.array_processor;

import java.util.Arrays;

/**
 *  Useful methods for array processing
 */
public class ArrayProcessor {

    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        int maxNegativePosition = getMaxNegativePosition(input);
        int minPositivePosition = getMinPositivePosition(input);
        if (maxNegativePosition != -1 && minPositivePosition != -1) {
            result[maxNegativePosition] = input[minPositivePosition];
            result[minPositivePosition] = input[maxNegativePosition];
        }
        return result;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) sum += input[i];
        }
        return sum;
    }

    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                result[i] = 0;
            } else {
                result[i] = input[i];
            }
        }
        return result;
    }

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > 0 && input[i + 1] < 0) {
                result[i] = input[i] * 3;
            } else {
                result[i] = input[i];
            }
        }
        return result;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        return calculateAverage(input) - min(input);
    }

    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        int[] result = new int[0];
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j] && i % 2 != 0 && !contains(result, input[i])) {
                    result = add(result, input[i]);
                }
            }
        }
        return result;
    }

    private boolean contains(int[] set, int element) {
        for (int i : set) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    private int[] add(int[] original, int element) {
        int[] result = Arrays.copyOfRange(original, 0, original.length + 1);
        result[result.length - 1] = element;
        return result;
    }

    private int min(int[] input) {
        int min = input[0];
        for (int i : input) {
            if (i < min) min = i;
        }
        return min;
    }

    private float calculateAverage(int[] input) {
        float sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum / input.length;
    }

    private int getMaxNegativePosition(int[] input) {
        int maxNegativePosition = -1;
        int maxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0 && input[i] > maxNegative) {
                maxNegative = input[i];
                maxNegativePosition = i;
            }
        }
        return maxNegativePosition;
    }

    private int getMinPositivePosition(int[] input) {
        int minPositivePosition = -1;
        int minPositive = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0 && input[i] < minPositive) {
                minPositive = input[i];
                minPositivePosition = i;
            }
        }
        return minPositivePosition;
    }

}

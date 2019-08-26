package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Hidden tests, should be used by Autocode
 */
@RunWith(JUnit4.class)
public class ArrayProcessorTestSuit {

    public ArrayProcessorTestSuit() {}

    @Test
    public void testSwapMaxNegativeAndMinPositiveElements() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int[] expectedResult = new int[] {-4, 4, 8, 0, -5, -1, 8, 5, 2, 7, 5, 5, 6, 0, 7, 1, -7, -6, -2, 9};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.swapMaxNegativeAndMinPositiveElements(input);
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testSwapMaxNegativeAndMinPositiveElementsShouldCreateNewArray() {
        int[] input = new int[] {0};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.swapMaxNegativeAndMinPositiveElements(input);
        assertNotSame(result, input);
    }

    @Test
    public void testCountSumOfElementsOnEvenPositions() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int result = arrayProcessor.countSumOfElementsOnEvenPositions(input);
        assertEquals(18, result);
    }

    @Test
    public void testReplaceEachNegativeElementsWithZero() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int[] expectedResult = new int[] {0, 4, 8, 0, 0, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, 0, 0, 0, 0, 9};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.replaceEachNegativeElementsWithZero(input);
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testReplaceEachNegativeElementsWithZeroShouldCreateNewArray() {
        int[] input = new int[] {0};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.replaceEachNegativeElementsWithZero(input);
        assertNotSame(result, input);
    }

    @Test
    public void testMultiplyByThreeEachPositiveElementStandingBeforeNegative() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int[] expectedResult = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 21, -1, -7, -6, -2, 9};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.multiplyByThreeEachPositiveElementStandingBeforeNegative(input);
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testMultiplyByThreeEachPositiveElementStandingBeforeNegativeShouldCreateNewArray() {
        int[] input = new int[] {0};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.multiplyByThreeEachPositiveElementStandingBeforeNegative(input);
        assertNotSame(result, input);
    }

    @Test
    public void testCalculateDifferenceBetweenAverageAndMinElement() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        float result = arrayProcessor.calculateDifferenceBetweenAverageAndMinElement(input);
        assertEquals(9.1, result, 0.01);
    }

    @Test
    public void testFindSameElementsStandingOnOddPositions() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int[] expectedResult = new int[] {0, 5, 7};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.findSameElementsStandingOnOddPositions(input);
        assertThat(result, is(expectedResult));
    }
}

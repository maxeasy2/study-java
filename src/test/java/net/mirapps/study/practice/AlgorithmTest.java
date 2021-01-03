package net.mirapps.study.practice;

import net.mirapps.study.algorithm.Utils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    private int[] answerSortArray;
    private int jinsuTestNumVaue;


    @BeforeEach
    void setupEach() {
        answerSortArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        jinsuTestNumVaue = 189;
    }

    @Test
    void binarySeach() {
        int[] param = {1,2,3,4,5,6,7,8,9};
        int number = 8;
        int assertVal = Arrays.binarySearch(param, number);
        int result = Algorithm.binarySeach(param, number);

        assertEquals(assertVal, result);
    }

    @Test
    void insertionSort() {
        int[] result = Utils.executeSort(new Algorithm.InsertionSort());
        assertArrayEquals(answerSortArray, result);
    }

    @Test
    void quickSort() {
        int[] result = Utils.executeSort(new Algorithm.QuickSort());
        assertArrayEquals(answerSortArray, result);
    }

    @Test
    void mergeSort() {
        int[] result = Utils.executeSort(new Algorithm.MergeSort());
        assertArrayEquals(answerSortArray, result);
    }

    @Test
    void jinsuTest () {
        assertEquals(Integer.toBinaryString(jinsuTestNumVaue), Algorithm.Math.convertJinsu(jinsuTestNumVaue, 2));
        assertEquals(Integer.toOctalString(jinsuTestNumVaue), Algorithm.Math.convertJinsu(jinsuTestNumVaue, 8));
        assertEquals(Integer.toHexString(jinsuTestNumVaue), Algorithm.Math.convertJinsu(jinsuTestNumVaue, 16));
    }

    @Test
    void decimalTest () {
        assertEquals(Integer.parseInt(Integer.toBinaryString(jinsuTestNumVaue), 2), Algorithm.Math.convertDecimal(Integer.toBinaryString(jinsuTestNumVaue), 2));
        assertEquals(Integer.parseInt(Integer.toOctalString(jinsuTestNumVaue), 8), Algorithm.Math.convertDecimal(Integer.toOctalString(jinsuTestNumVaue), 8));
        assertEquals(Integer.parseInt(Integer.toHexString(jinsuTestNumVaue), 16), Algorithm.Math.convertDecimal(Integer.toHexString(jinsuTestNumVaue), 16));
    }

    @Test
    void isPrimeNumberTest(){
        assertTrue(Algorithm.Math.isPrimeNumber(3));
        assertTrue(Algorithm.Math.isPrimeNumber(5));
        assertTrue(Algorithm.Math.isPrimeNumber(7));
        assertTrue(Algorithm.Math.isPrimeNumber(11));
    }

    @Test
    void getPrimeNumberList() {
        List<Integer> answerList = Arrays.asList(new Integer[]{2, 3, 5, 7, 11, 13, 17, 19, 23});
        assertEquals(Algorithm.Math.getPrimeNumberList(25), answerList);
    }

    @Test
    void fibonacciTest() {
        assertEquals(55, Algorithm.Math.fibonacci(10));
    }

    @Test
    void factorial(){
        assertEquals(3628800, Algorithm.Math.factorial(10));
    }
}
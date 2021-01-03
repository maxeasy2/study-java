package net.mirapps.study.algorithm;

import java.util.Arrays;

public class Utils {
    public static final int[] unSortArray = {9,2,3,8,1,7,5,4,6};

    public static void swap(int[] array, int val1, int val2) {
        int temp = array[val1];
        array[val1] = array[val2];
        array[val2] = temp;
    }

    public static int[] executeSort(SortTemplate sortTemplate) {
        int[] copyArray = Arrays.copyOf(unSortArray, unSortArray.length);
        sortTemplate.sort(copyArray);
        System.out.println(sortTemplate.getClass().getSimpleName()+" : "+Arrays.toString(copyArray));
        return copyArray;
    }
}

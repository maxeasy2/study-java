package net.mirapps.study.practice;

import net.mirapps.study.algorithm.SortTemplate;
import net.mirapps.study.algorithm.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithm {

    public static int binarySeach(int[] array, int num) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (low <= high) {
            mid = (low + high) / 2 ;

            if (array[mid] == num) {
                System.out.println("num : " + num);
                break;
            } else if (array[mid] < num) {
                low = mid + 1;
            } else if (array[mid] > num) {
                high = mid - 1;
            }
        }
        return mid;
    }

    static class InsertionSort implements SortTemplate {
        @Override
        public int[] sort(int[] array) {
            for (int i=0; i<array.length - 1; i++){
                int j = i;
                while (j >= 0 && array[j] > array[j+1]) {
                    Utils.swap(array, j, j+1);
                    j--;
                }
            }
            return array;
        }
    }

    static class QuickSort implements SortTemplate{
        @Override
        public int[] sort(int[] array) {
            return quickSort(array, 0, array.length - 1);
        }

        public int[] quickSort(int[] array, int start, int end){
            int i = start + 1;
            int j = end;
            int pivot = start;

            while (i <= j) {
                while (i <= end && array[i] <= array[pivot]) {
                    i++;
                }
                while (j > start && array[j] >= array[pivot]) {
                    j--;
                }

                if (i > j) {
                    Utils.swap(array, j, pivot);
                } else {
                    Utils.swap(array, i, j);
                }
                quickSort(array, start, j-1);
                quickSort(array, j+1, end);
            }
            return array;
        }
    }

    static class MergeSort implements SortTemplate {

        private int[] sorted;

        @Override
        public int[] sort(int[] array) {
            sorted = new int[array.length];
            return mergeSort(array, 0, array.length -1);
        }

        public int[] merge(int[] array, int start, int mid, int end) {
            int i = start;
            int j = mid + 1;
            int k = start;

            while (i <= mid && j <= end) {
                if (array[i] < array[j]) {
                    sorted[k] = array[i];
                    i++;
                } else {
                    sorted[k] = array[j];
                    j++;
                }
                k++;
            }

            if (i > mid) {
                for (int t = j; t <= end; t++){
                    sorted[k] = array[t];
                    k++;
                }
            } else {
                for (int t = i; t <= mid; t++){
                    sorted[k] = array[t];
                    k++;
                }
            }

            for (int t = start; t <= end; t++) {
                array[t] = sorted[t];
            }
            return array;
        }

        public int[] mergeSort(int[] array, int start, int end) {
            int[] result = null;
            if (start < end) {
                int mid = (start + end) / 2;
                mergeSort(array, start, mid);
                mergeSort(array, mid+1, end);
                result = merge(array, start, mid, end);
            }
            return result;
        }
    }

    static class Math {
        // 10진수를 다른진수로 변환
        public static String convertJinsu(int num, int jinsu) {
            List<String> jinsuList = new ArrayList<>();
            while (num != 0){
                int remainder = num % jinsu;
                if (jinsu == 16 && remainder >= 10 && remainder <= 15) {
                    char val = (char) (remainder + 55);
                    jinsuList.add(String.valueOf(val).toLowerCase());
                } else {
                    jinsuList.add(String.valueOf(remainder));
                }
                num /= jinsu;
            }
            Collections.reverse(jinsuList);
            return String.join("", jinsuList);
        }

        public static int convertDecimal(String num, int jinsu) {
            char[] numberList = num.toCharArray();
            int result = 0;
            int n = numberList.length - 1;
            for (int i=0; i<=n; i++) {
                if (jinsu == 16 && numberList[i] >= 65 && numberList[i] <= 75) {
                    result += java.lang.Math.pow(jinsu, (n-i)) * (numberList[i] - 55);
                } else {
                    result += java.lang.Math.pow(jinsu, (n-i)) * Character.getNumericValue(numberList[i]);
                }
            }
            return result;
        }

        public static boolean isPrimeNumber(int num) {
            if (num <= 1) return false;

            for (int i=2; i< java.lang.Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        public static List<Integer> getPrimeNumberList(int num) {
            boolean[] check = new boolean[num+1];
            List<Integer> primeNumberList = new ArrayList<>();
            for (int i=2; i<=num; i++) {
                if(check[i]) continue;
                for (int j=i+i; j<=num; j+=i) {
                    check[j] = true;
                }
            }

            for (int i=0; i<=num; i++){
                if (!check[i] && i > 1) {
                    primeNumberList.add(i);
                }
            }
            return primeNumberList;
        }

        static long[] fibo;
        public static long fibonacci(int num) {
            fibo = new long[num+1];
            return processFibonacci(num);
        }

        private static long processFibonacci(int num){
            if (num <= 1) {
                return num;
            }

            if (fibo[num] != 0) {
                return fibo[num];
            }

            fibo[num] = processFibonacci(num-1) + processFibonacci(num-2);
            return fibo[num];
        }

        public static long factorial(int num){
            long result = 1;
            for (int i=1; i<=num; i++) {
               result *=i;
            }
            return result;
        }
    }
}

package net.mirapps.study.algorithm.sort;

public class Quick {

    int number = 10;
    static int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

    public static void quickSort(int[] array, int start, int end){
        int i = start+1;
        int j = end;
        int key = start;


        while (i <= j) {
            while (i <= end && array[i] <= array[key]) {
                i++;
            }

            while (array[j] >= array[key] && j > start) {
                j--;
            }

            if (i > j) {
                swap(array, j, key);
            } else {
                swap(array, i, j);
            }
            quickSort(array, start, j - 1);
            quickSort(array, j + 1, end);
        }
    }

    public static void swap(int[] array, int value1, int value2){
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
    }

    public static void main(String[] args) {
        quickSort(data, 0, data.length-1);

        for (int value : data) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}

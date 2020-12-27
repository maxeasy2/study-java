package net.mirapps.study.algorithm.sort;

public class Insertion {

    public static void sort(){
        int[] array = {9,2,3,8,1,7,5,4,6};
        for (int i= 0; i<array.length-1; i++) {
            int j = i;
            while (j >= 0 && array[j] > array[j+1]) {
                swap(array, j, j+1);
                j--;
            }
        }
        for (int i= 0; i<array.length-1; i++){
            System.out.print(array[i] +" ");
        }

    }

    public static void swap(int[] array, int value1, int value2){
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
    }

    public static void main(String[] args) {
        sort();
    }

}

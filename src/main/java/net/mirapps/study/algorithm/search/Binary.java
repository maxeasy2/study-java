package net.mirapps.study.algorithm.search;

public class Binary {
    public static int search(){
        int[] values = {0,1,2,3,4,5,6,7,8,9};
        int num = 8;

        int low = 0;
        int mid = 0;
        int high = values.length-1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (values[mid] == num){
                System.out.println("answer : "+mid);
                break;
            } else if (values[mid] < num) {
                low = mid +1;
            } else if (values[mid] > num) {
                high = mid -1;
            }

        }
        return mid;
    }

    public static void main(String[] args) {
        search();
    }
}

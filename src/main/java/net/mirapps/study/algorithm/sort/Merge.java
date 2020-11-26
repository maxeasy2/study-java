package net.mirapps.study.algorithm.sort;

public class Merge {

    static int[] sorted;

    public static void mergeSort(int [] array, int start, int end) {

        if (start < end) {
            int middle = (start + end)/2;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }
    }

    public static void merge(int [] array, int start, int middle, int end) {
        int i = start; // 첫 번째 집합의 탐색 시작 점  
        int j = middle + 1; // 두 번째 집합의 탐색 시작 점
        int k = start; // 정렬한 결과를 담을 배열의 index 

        // 작은 순서대로 배열에 삽입
        while (i <= middle && j <= end){
            // 첫 번째 배열의 요소가 두 번째 배열의 요소 값 보다 작다면
            if (array[i] <= array[j]) {
                sorted[k] = array[i];
                i++;
            } else {
                sorted[k] = array[j];
                j++;
            }
            k++;
        }
        // 남은 데이터 삽입(i 나 j의 모든 요소가 배열에 들어간 경우 나머지의 요소도 배열에 넣어줘야 함)
        // i 값이 모두 배열에 들어간 경우
        if (i > middle) {
            for (int t = j; t <= end; t++) {
                sorted[k] = array[t];
                k++;
            }
        } else { // j 값이 모두 배열에 들어간 경우 
            for (int t = i; t <= middle; t++) {
                sorted[k] = array[t];
                k++;
            }
        }
        // 정렬된 배열을 삽입
        for (int t = start; t <= end; t++) {
            array[t] = sorted[t];
        }
    }

    public static void main(String[] args) {
        int[] array = {9,2,3,8,1,7,5,4,6};
        sorted = new int[array.length];
        mergeSort(array, 0, sorted.length-1);

        for (int n : sorted) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}

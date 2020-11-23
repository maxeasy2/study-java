package net.mirapps.study.algorithm.sort;

public class Selection extends Template {

    public void process(int[] array) {

        System.out.println("array start!");
        printIntArray(array);

        for (int i=0; i < array.length-1; i++) {
            int minIdx = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j] < array[minIdx]){
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
        System.out.println("selection sort");
        printIntArray(array);
    }
}

package net.mirapps.study.algorithm.sort;

public abstract class Template {
    public abstract void process(int[] array);

    public void printIntArray(int[] array){
        for (int value : array) {
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}

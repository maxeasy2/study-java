package net.mirapps.study.algorithm.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortTest {

    private Selection selection = new Selection();
    private Bubble bubble = new Bubble();

    private static int[] array;

    @BeforeEach
    void setUp(){
        array = new int[]{3, 8, 9, 2, 7, 10, 5, 4, 1, 6};
    }

    @Test
    void selectionTest() {
        selection.process(array);
    }

    @Test
    void bubbleTest() {
        bubble.process(array);
    }

}
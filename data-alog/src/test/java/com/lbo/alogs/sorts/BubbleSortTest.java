package com.lbo.alogs.sorts;

import org.junit.Test;

/**
 * @author liubo
 * @date 2020/11/22
 */
public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        printArray(array);

        BubbleSort.bubbleSort(array);
        printArray(array);

    }

    private void printArray(int[] array) {
        System.out.printf("the array is : [");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" " + array[i]);
        }
        System.out.println(" ]\n");
    }
}

package com.lbo.alogs.sorts;

import org.junit.Test;

/**
 * @author liubo
 * @date 2020/11/22
 */
public class InsertionSortTest {

    @Test
    public void selectMinumSort() {

        int[] array = {20, 35, -15, 7, 55, 1, -22, 0, 99};
        printArray(array);
        InsertionSort.sort(array);
        printArray(array);

    }

    @Test
    public void selectMinumSort2() {

        int[] array = {20, 35, -15, 7, 55, 1, -22, 0, 99};
        printArray(array);
        InsertionSort.sort(array);
        printArray(array);

    }

    @Test
    public void test1() {

        int[] array = {20, 35, -15, 7, 55, 1, -22};
        printArray(array);
        InsertionSort.sort(array);
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

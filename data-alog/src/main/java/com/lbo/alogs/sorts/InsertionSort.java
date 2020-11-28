package com.lbo.alogs.sorts;

/**
 * @author liubo
 * @date 2020/11/22
 */
public class InsertionSort {

    public static void sort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int unsortItem = array[firstUnsortedIndex];
            int i = firstUnsortedIndex;
            for (; i > 0 && array[i - 1] > unsortItem; i--) {
                array[i] = array[i - 1];
            }
            if (i != firstUnsortedIndex) {
                array[i] = unsortItem;
            }
        }
    }


}

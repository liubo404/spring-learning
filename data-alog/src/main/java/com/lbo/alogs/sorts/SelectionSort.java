package com.lbo.alogs.sorts;

/**
 * @author liubo
 * @date 2020/11/22
 */
public class SelectionSort {

    public static void selectMinumSort(int[] array) {
        for (int lastUnsortedIndex = 0; lastUnsortedIndex < array.length - 1; lastUnsortedIndex++) {
            int minium = lastUnsortedIndex;
            for (int i = array.length - 1; i > lastUnsortedIndex; i--) {
                if (array[i] < array[minium]) {
                    minium = i;
                }
            }
            swap(array, lastUnsortedIndex, minium);
        }
    }

    public static void selectMinumSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //find the minium index from i to the end.
            int minium = selectMin(array, i);

            if (i != minium) {
                swap(array, i, minium);
            }
        }
    }

    private static int selectMin(int[] array, int index) {
        for (int j = index + 1; j < array.length; j++) {
            if (array[index] > array[j]) {
                index = j;
            }
        }
        return index;
    }


    public static void selectLargestSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }

    }


    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

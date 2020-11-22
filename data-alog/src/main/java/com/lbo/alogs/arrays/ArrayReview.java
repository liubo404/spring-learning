package com.lbo.alogs.arrays;

/**
 * data Structures and Algorithms  Deep Dive Using Java
 *
 * @author liubo
 * @date 2020/11/21
 */
public class ArrayReview {

    public static void main(String[] args) {
        int[] intArray = new int[3];

        intArray[0] = 11;
        intArray[1] = 77;
        intArray[2] = 33;


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}

package com.lbo.alogs;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author liubo
 * @date 2020/11/20
 */
public class ReverseWordTest {

    @Test
    public void test0() {
        String old = "Today is a good day";
        String result = "day good a is Today";

        String reversed = ReverseWord.reverseWord(old);
        assertEquals(result, reversed);
    }


    @Test
    public void test1() {
        String old = "Today is  a good day ";
        String result = " day good a is Today";

        String reversed = ReverseWord.reverseWord(old);
        assertEquals(result, reversed);
    }

    @Test
    public void test2() {

        String old = "Today is a good day . what?";
        String result = ". day good a is Today";

        String reversed = ReverseWord.reverseWord(old);
        assertNotEquals(result, reversed);
    }
}

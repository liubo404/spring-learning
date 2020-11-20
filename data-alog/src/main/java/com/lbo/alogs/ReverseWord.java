package com.lbo.alogs;

import java.util.Stack;

/**
 * @author liubo
 * @date 2020/11/20
 */
public class ReverseWord {

    public static String reverseWord(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<String> wordStack = new Stack<>();

        boolean hasNextWord = false;
        for (char a : arr) {
            if ((a >= 'a' && a <= 'z')
                    || (a >= 'A' && a <= 'Z')) {
                sb.append(a);
                hasNextWord = true;
            } else {
                String word = sb.toString();
                wordStack.push(word);
                wordStack.push(String.valueOf(a));
                sb = new StringBuilder();
                hasNextWord = false;
            }
        }
        if (hasNextWord) {
            wordStack.push(sb.toString());
        }
        StringBuilder rb = new StringBuilder();
        while (!wordStack.isEmpty()) {
            rb.append(wordStack.pop());
        }
        return rb.toString();
    }
}

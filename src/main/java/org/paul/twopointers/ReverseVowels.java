package org.paul.twopointers;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels {

    //定义元音字符集合
    private static final HashSet<Character> chars = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s){
        if (s == null){
            return null;
        }
        int i = 0;
        int j = s.length() - 1;
        //结果字符串
        char[] result = new char[s.length()];
        while (i <= j){
            //双指针
            char le = s.charAt(i);
            char ri = s.charAt(j);
            if (!chars.contains(le)){
                //左指针不包含右移
                result[i++] = le;
            }else if (!chars.contains(ri)){
                //右指针不包含左移
                //双指针同时判断
                result[j--] = ri;
            }else {
                //左右符合，交换位置
                result[i++] = ri;
                result[j--] = le;
            }
        }
        return new String(result);
    }
}

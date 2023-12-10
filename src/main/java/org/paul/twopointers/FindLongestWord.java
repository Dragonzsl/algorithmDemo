package org.paul.twopointers;

import java.util.Arrays;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) {
        //"ale","apple","monkey","plea"
        List<String> dictionary = Arrays.asList("ale","apple","monkey","plea");
        System.out.println(findLongestWord("abpcplea", dictionary));
    }

    public static String findLongestWord(String s, List<String> dictionary) {

        String res = "";
        for (String str : dictionary) {
            int i = 0;
            int j = 0;
            while (i < str.length() && j < s.length()){
                //判断当前字典中的字符串是否是 s 的子串
                //2个指针 i，j 分别指向 str 和 s 的初始位置，如果字符相同同时右移，如果不相同 i 不动 j 右移
                if (str.charAt(i) == s.charAt(j)){
                    ++i;
                }
                ++j;
            }
            //如果 i 移到 str 末尾说明 str 是 s 的子串
            if (i == str.length()){
                //如果当前字符串长度大于之前字符串长度或者长度相等但序小
                if (str.length() > res.length() || (str.length() == res.length() && str.compareTo(res)<0)){
                    res = str;
                }
            }
        }

        return res;
    }
}

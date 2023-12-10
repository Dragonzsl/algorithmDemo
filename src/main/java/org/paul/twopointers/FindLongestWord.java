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
                if (str.charAt(i) == s.charAt(j)){
                    i++;
                }
                j++;
            }
            if (i == str.length() - 1){
                if (str.length() > res.length() || (str.length() == res.length() && str.compareTo(res)<0)){
                    res = str;
                }
            }
        }

        return res;
    }
}

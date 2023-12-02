package org.paul.twopointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abcdccba"));
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                //如果不相等，尝试删除一个字符，左边或者右边
                //然后判断中间是否是回文，左指针左边和右指针右边的字符之前已经判断
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}

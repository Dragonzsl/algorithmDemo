package org.paul.twopointers;

public class JudgeSquareSum {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2));
    }
    public static boolean judgeSquareSum(int c) {
        //非负整数
        if (c < 0){
            return false;
        }
        //左指针
        long i = 0;
        //右指针，目标开平方
        long j = (long) Math.sqrt(c);
        while (i <= j){
            long powSum = i * i + j * j;
            if (powSum == c){
                return true;
            }else if (powSum > c){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}

package org.paul.twopointers;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(numbers, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] numbers, int target){
        //数组不为空
        if (numbers == null){
            return null;
        }
        //左指针
        int i = 0;
        //右指针，数组长度-1
        int j = numbers.length - 1;
        while (i < j){
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                //如果相等返回坐标
                return new int[]{i+1,j+1};
            }else if (sum < target){
                //如果和<目标，左指针增加
                i++;
            }else {
                //右指针增加
                j--;
            }
        }
        return null;
    }
}

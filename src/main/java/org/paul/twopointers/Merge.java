package org.paul.twopointers;

public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,0,0,0};
        int[] nums2 = {2,4,6};
        merge(nums1,3,nums2,3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    /**
     *     ⇣
     * 1 3 5 0 0 0
     * 2 4 6
     *     ⇡
     *  ↓
     *     ⇣
     * 1 3 5 0 0 6
     * 2 4 6
     *   ⇡
     *  ↓
     *   ⇣
     * 1 3 5 0 5 6
     * 2 4 6
     *   ⇡
     *  ↓
     *   ⇣
     * 1 3 5 4 5 6
     * 2 4 6
     * ⇡
     *  ↓
     * ⇣
     * 1 3 3 4 5 6
     * 2 4 6
     * ⇡
     *  ↓
     * ⇣
     * 1 2 3 4 5 6
     * 2 4 6
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int res = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                //如果nums1为空，直接取nums2
                nums1[res--] = nums2[p2--];
            } else if (p2 == -1) {
                //如果nums2为空，直接取nums1
                nums1[res--] = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                //如果nums1最大值比nums2最大值 大，将nums1最大值覆盖到数组res位置，并且指针左移
                nums1[res--] = nums1[p1--];
            } else {
                //反之，将nums2最大值覆盖到数组res位置，并且指针左移
                nums1[res--] = nums2[p2--];
            }
        }
    }
}

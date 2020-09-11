package test.huawei;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double res = solution(nums1, nums2);
        System.out.println(res);
    }

    private static double solution(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] nums = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i];
                i++;
            } else {
                nums[k++] = nums2[j];
                j++;
            }
        }

        while (j < nums2.length) {
            nums[k] = nums2[j++];
            k++;
        }
        while (i < nums1.length) {
            nums[k] = nums1[i++];
            k++;
        }
        int len = nums.length;
        return len % 2 == 0 ? (double) (nums[len / 2 - 1] + nums[len / 2]) / 2 : nums[len / 2];
    }
}

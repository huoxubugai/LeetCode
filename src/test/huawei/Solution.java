package test.huawei;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
        array = new int[]{1,-2,3,10,-4,7,2,-5};
        int result = Solution.solution(array);
        System.out.println(result);
    }

    private static int solution(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}

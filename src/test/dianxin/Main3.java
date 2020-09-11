package test.dianxin;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] nums=line.split(",");
        int res=solution(nums);
        System.out.println(res);
    }

    private static int solution(String[] nums) {
        if(nums.length==0){
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = Integer.valueOf(nums[0]);
        if(nums.length==1){
            return dp[0];
        }
        dp[1] = Math.max(dp[0], Integer.valueOf(nums[1]));
        for(int i=2;i<nums.length;i++){
            int cur = Integer.valueOf(nums[i]);
            dp[i] = Math.max(cur + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length-1];
    }
}

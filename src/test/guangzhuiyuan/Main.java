package test.guangzhuiyuan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;


//给定n个空心圆柱（内半径r，厚度s，高度h），将
// 他们搭起来最大能达到多高。如果 rj+sj>=ri+si 并且 ri+si >= rj 才能将 木头i 放到 木头j 上面。
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = scanner.nextInt(); //r  半径
            arr[i][1] = scanner.nextInt(); //s 厚度
            arr[i][2] = scanner.nextInt(); // h 高度
        }
        int res = maxHigh(arr);
        System.out.println(res);
    }

    private static int maxHigh(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]+o1[1]-o2[0]-o2[1];
            }
        });
        int[] dp = new int[arr.length];
        dp[0] = arr[0][2];
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i][0]<=(arr[j][0]+arr[j][1])){
                    dp[i] = Math.max(dp[i], dp[j] + arr[i][2]);
                }
            }
        }
        return dp[dp.length-1];
    }

}

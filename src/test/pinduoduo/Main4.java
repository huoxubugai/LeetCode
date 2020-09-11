package test.pinduoduo;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] d = new int[n][6];
        for(int i=0;i<n;i++){
            for (int j=0;j<6;j++){
                d[i][j] = scanner.nextInt();
            }
        }
        int[][] result = Main4.solution(d);
    }

    private static int[][] solution(int[][] d) {

        return new int[0][];
    }
}

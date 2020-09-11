package test.pinduoduo.pinduoduo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int size = scanner.nextInt();
        int[][] input = new int[count][3];
//        double[] coe=new double[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                input[i][j] = scanner.nextInt();
            }
            if (input[i][0] >= 0 && input[i][1] <= 0) {
                input[i][0] = 0;
                input[i][1] = 0;
                input[i][2] = 0;
                continue;
            }
            if(input[i][0] <= 0 && input[i][1] >= 0){
                input[i][2] = Integer.MAX_VALUE;
                continue;
            }
            if (input[i][0] == 0) {
                input[i][2] = Integer.MAX_VALUE;
            } else {
                input[i][2] = input[i][1] * 10000 / input[i][0];
            }
        }
        int maxPro = Main3.solution(input, size);
        System.out.println(maxPro);
    }

    private static int solution(int[][] input, int size) {
        int res = 0;
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o2[2] == o1[2]) {
                    return (o2[0] - o1[0]);
                }
                return (o2[2] - o1[2]);
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (size >= input[i][0]) {
                res += input[i][1];
                size -= input[i][0];
            }
        }
        return res;
    }
}

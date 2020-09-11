package test.pinduoduo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();
        int[][] lunch = new int[N][2];
        int[][] dinner = new int[M][2];
        for(int i=0;i<N;i++){
            for(int j=0;j<2;j++){
                lunch[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<2;j++){
                dinner[i][j] = scanner.nextInt();
            }
        }
        int cal = Main3.solution(lunch, dinner,T);
        System.out.println(cal);
    }

    private static int solution(int[][] lunch, int[][] dinner,int t) {
        int min = Integer.MAX_VALUE;
        sort(lunch, dinner);
        if(t<=0){
            return 0;
        }else if(dinner[0][1]+lunch[0][1]<t){
            return -1;
        }
        else if(dinner[0][1]>=t||lunch[0][1]>=t){
            int min1=Integer.MAX_VALUE;
            for(int i=0;i<dinner.length;i++){
                if(dinner[i][1]>=t){
                    min1 = Math.min(min1, dinner[i][0]);
                }else{
                    break;
                }
            }
            int min2=Integer.MAX_VALUE;
            for(int i=0;i<lunch.length;i++){
                if(lunch[i][1]>=t){
                    min2 = Math.min(min2, lunch[i][0]);
                }else{
                    break;
                }
            }
            return Math.min(min1,min2);
        }else{
            int min3 = Integer.MAX_VALUE;
            for(int i=0;i< lunch.length;i++){
                for(int j=0;j<dinner.length;j++){
                    if(lunch[i][1]+dinner[j][1]>=t){
                        min3 = Math.min(min3, lunch[i][0] + dinner[j][0]);
                    }else{
                        break;
                    }
                }
            }
            return min3;
        }
    }

    private static void sort(int[][] lunch, int[][] dinner) {
        Arrays.sort(lunch, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o2[0] - o1[0];
                }
                return o2[1] - o1[1];
            }
        });
        Arrays.sort(dinner, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o2[0] - o1[0];
                }
                return o2[1] - o1[1];
            }
        });
    }
//    private static int solution(int[][] lunch, int[][] dinner,int t) {
//        int min = Integer.MAX_VALUE;
//        if(t<=0){
//            return 0;
//        }
//        for(int i=0;i<lunch.length;i++){
//            if(lunch[i][1]>=t){
//                min = Math.min(min, lunch[i][0]);
//                continue;
//            }
//            t -= lunch[i][1];
//            for(int j=0;j<dinner.length;j++){
//            }
//        }
//        return 0;
//    }
}

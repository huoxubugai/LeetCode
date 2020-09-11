package test.baidu;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();//测试数据组数
        for(int i=0;i<T;i++){
            int n = scanner.nextInt();//奶牛数量
            int[] res=new int[n+1];//res[i]存放奶牛i满足特性的个数
            int m = scanner.nextInt();//需要满足的特性数量
            for(int j=0;j<m;j++){
                int k = scanner.nextInt();//满足某特性的区间数量
                int[][] round=new int[k][2];//所有区间
                int[][] round2=new int[k][2];//所有区间
                if(j==0){
                    for(int p=0;p<k;p++){
                        for(int q=0;q<2;q++){
                            round[p][q] = scanner.nextInt();
                        }
                    }
                    continue;
                }else{
                    for(int p=0;p<k;p++){
                        for(int q=0;q<2;q++){
                            round2[p][q] = scanner.nextInt();
                        }
                    }
                }
                int[][] tempRound=Main2.merge(round, round2);
                if(j==m-1){
                    List<Integer> list=Main2.countRound(round,m);
                    System.out.println(list.size());
                    for(int num:list){
                        System.out.print(num);
                        System.out.print(" ");
                    }
                }
//                Main2.solution(round,res);
            }
//            List<Integer> list=Main2.countRes(res,m);

        }
    }

    private static List<Integer> countRound(int[][] round, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<round.length;i++){
            for(int j=round[i][0];j<=round[i][1];j++){
                list.add(j);
            }
        }
        return list;
    }

    private static int[][] merge(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            // Let's check if A[i] intersects B[j].
            // lo - the startpoint of the intersection
            // hi - the endpoint of the intersection
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi)
                ans.add(new int[]{lo, hi});

            // Remove the interval with the smallest endpoint
            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }

    private static List<Integer> countRes(int[] res,int m) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<res.length;i++){
            if(res[i]>=m){
                list.add(i);
            }
        }
        return list;
    }

    private static void solution(int[][] round, int[] res) {
        for(int i=0;i<round.length;i++){
            for(int j=round[i][0];j<=round[i][1];j++){
                res[j]++;
            }
        }
    }
}

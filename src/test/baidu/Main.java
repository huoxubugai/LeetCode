package test.baidu;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
                for(int p=0;p<k;p++){
                    for(int q=0;q<2;q++){
                        round[p][q] = scanner.nextInt();
                    }
                }
                Main.solution(round,res);
            }
            List<Integer> list=Main.countRes(res,m);
            System.out.println(list.size());
            for(int num:list){
                System.out.print(num);
                System.out.print(" ");
            }
        }
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

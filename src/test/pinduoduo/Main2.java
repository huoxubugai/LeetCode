package test.pinduoduo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int[] D = new int[n];
        for(int i=0;i<n;i++){
            D[i] = scanner.nextInt();
        }
        String result = Main2.solution(D,k);
        System.out.println(result);
    }

    private static String solution(int[] d,int k) {
        if(k==0){
            return "0 "+d.length;
        }
        int distance=k,times=0;
        for(int i=0;i<d.length;i++){
            if(d[i]==distance){
                if(i!=d.length-1){
                    return "paradox";
                }else{
                    return "0 " + times;
                }
            }else if(d[i]>distance){
                distance = d[i] - distance;
                times++;
            }else{
                distance -= d[i];
            }
        }
        return distance + " " + times;
    }
}

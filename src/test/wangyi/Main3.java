package test.wangyi;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int res = solution(s);
        System.out.println(res);
    }

    private static int solution(String s) {
        int []a = new int [s.length()+1];
        int []b = new int [s.length()+1];
        int []c = new int [s.length()+1];
        int []x = new int [s.length()+1];
        int []y = new int [s.length()+1];
        int []z = new int [s.length()+1];
        a[0] = 0;
        b[0] = 0;
        c[0] = 0;
        x[0] = 0;
        y[0] = 0;
        z[0] = 0;
        for(int index = 1; index<=s.length();index++){
            a[index] = a[index-1];
            b[index] = b[index-1];
            c[index] = c[index-1];
            x[index] = x[index-1];
            y[index] = y[index-1];
            z[index] = z[index-1];
            switch(s.charAt(index-1)){
                case'a':a[index] += 1;break;
                case'b':b[index] += 1;break;
                case'c':c[index] += 1;break;
                case'x':x[index] += 1;break;
                case'y':y[index] += 1;break;
                case'z':z[index] += 1;break;
                default:break;
            }
        }
        int index1 = s.length();
        int index2 = 0;
        for(int index = s.length();index > 0; index--){
            index1 = index;
            index2 = 0;
            while(index1 <= s.length()){
                int a12 = a[index1]-a[index2];
                int b12 = b[index1]-b[index2];
                int c12 = c[index1]-c[index2];
                int x12 = x[index1]-x[index2];
                int y12 = y[index1]-y[index2];
                int z12 = z[index1]-z[index2];
                if(a12%2 == 0 && b12 % 2 == 0 && c12 % 2 == 0 && z12 % 2 == 0
                        && x12 % 2 == 0 && y12 % 2 ==0){
                    return index1-index2;
                }
                index1++;
                index2++;
            }
        }
        return 0;
    }

}

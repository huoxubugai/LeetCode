package test.dianxin;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = nthUglyNumber(n);
        System.out.println(res);
    }
    public  static int nthUglyNumber(int n) {
        int[] uglyNum=new int[n];
        uglyNum[0]=1;
        int idx2=0,idx3=0,idx5=0;
        for(int i=1;i<n;++i){//注意math.min只能比较两个数，这里要用两个min方法
            uglyNum[i]=Math.min(Math.min(uglyNum[idx2]*2,uglyNum[idx3]*3),uglyNum[idx5]*5);
            if(uglyNum[i]==uglyNum[idx2]*2)
                ++idx2;
            if(uglyNum[i]==uglyNum[idx3]*3) //不能用if else，因为当为6这种特殊数字（2*3,3*2）时
                ++idx3;                 // 两个索引值都要加1
            if(uglyNum[i]==uglyNum[idx5]*5)
                ++idx5;
        }
        return uglyNum[n-1];
    }
    public static boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 2 == 0) {
            n >>= 1;
        }
        return n == 1;
    }
}

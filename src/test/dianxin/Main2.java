//package test.dianxin;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main2 {
//    public static void main(String[] args) {
//
//        List<Integer> res = solution();
//        for(int num:res){
////            System.out.printf("%2d",num/);
//            printRes(num);
//            System.out.printf("\n");
//        }
//
//    }
//
//    private static void printRes(int n) {
//        int a=n/1000;
//        n%=1000;
//        int b=n/100;
//        n%=100;
//        int c=n/10;
//        n%=10;
//        int d=n;
//        System.out.printf("%2d%2d%2d%2d",a,b,c,d);
//    }
//
//    private static  List<Integer> solution(){
//        List<Integer> res = new ArrayList<>();
//        int n=1000;
//        while(n++<7888){
//            int dis=change(n);
//            if(dis>=1000){
//                if(n+dis==8888){
//                    res.add(n);
//                }
//            }
//        }
//        return res;
//    }
//
//    private static int change(int n){
//        int a=n/1000;
//        n%=1000;
//        int b=n/100;
//        n%=100;
//        int c=n/10;
//        n%=10;
//        int d=n;
//        return b*1000+c*100+d*10+a;
//    }
//}
package test.dianxin;

class Main2{

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        for(; a <= 8; a++) {
            solution(a,b,c,d);
            System.out.println();
        }
    }

    private static void solution(int a,int b,int c,int d) {
        b = 8 - a;
        c = 8 - b;
        d = 8 - c;
        System.out.printf("%d%2d%2d%2d",a,b,c,d);
    }


}
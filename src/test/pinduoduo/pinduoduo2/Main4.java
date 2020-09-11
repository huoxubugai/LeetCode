import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=n/2;
        int[][] nums = new int[n][n];
        if(n%2==1){
            for(int i=m+1;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i+j==n-1){
                        nums[i][j]=0;
                    }
                    else if(i+j<n-1){
                        nums[i][j]=4;
                    }
                    else if(i+j>n-1){
                        nums[i][j]=5;
                    }else if (i == j){
                        nums[i][j]=0;
                    }  else if(i<j){
                        nums[i][j]=2;
                    }
                    else{
                        nums[i][j]=3;
                    }
                }
            }
            for(int i=m+1;i<n;i++){
                for(int j=m+1;j<n;j++){
                    if(i==j){
                        nums[i][j]=0;
                    }
                    else if(i>j){
                        nums[i][j]=6;
                    }
                    else{
                        nums[i][j]=7;
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=m+1;j<n;j++){
                    if(i+j==n-1){
                        nums[i][j]=0;
                    }
                    else if(i+j<n-1){
                        nums[i][j]=1;
                    }
                    else{
                        nums[i][j]=8;
                    }
                }
            }

        }else{
            for(int i=0;i<m;i++) {
                for (int j = m; j < n; j++) {
                    if (i + j == n - 1) {
                        nums[i][j] = 0;
                    } else if (i + j < n - 1) {
                        nums[i][j] = 1;
                    } else if (i + j > n - 1) {
                        nums[i][j] = 8;
                    }
                }
            }
            for(int i=m;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i+j==n-1){
                        nums[i][j]=0;
                    }
                    else if(i+j<n-1){
                        nums[i][j]=4;
                    }
                    else{
                        nums[i][j]=5;
                    }
                }
            }
        }
        //for(int i=0;i<n;i++){
        // }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j != n-1){
                    System.out.print(nums[i][j]+" ");
                }
                else{
                    System.out.print(nums[i][j]);
                }
            }
            System.out.println();
        }
    }
}



package sort;

public class Insert {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 4, 2, 5, 3};
        insertSorted(arr);
        for(int num:arr){
            System.out.printf("%2d",num);
        }
        System.out.println("\n");
    }

    private static void insertSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            int j=i;
            while(j>0&&arr[j-1]>cur){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j ] = cur;
        }
    }
}

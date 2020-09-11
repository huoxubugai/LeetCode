package sort;

public class Quick {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2,4, 1,5,3};
        quickSorted(arr,0,arr.length-1);
        for(int num:arr){
            System.out.printf("%2d",num);
        }
        System.out.println("\n");
    }
    private static void quickSorted(int[] arr,int left,int right){
         if(left<right){
             int pivot = partition(arr, left, right);
             quickSorted(arr,left,pivot-1);
             quickSorted(arr,pivot+1,right);
         }
    }

    private static int partition(int[] arr, int left, int right) {
        //4  2  1  5  3
        int pivot = arr[right];
        int i=left-1;
        for(int j=left;j<=right-1;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j); //arr[i]是大于pivot的，将它右移
            }
        }
        swap(arr, i+1,right);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

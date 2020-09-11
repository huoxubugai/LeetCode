package sort;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2,4, 5, 3, 1};
        bubbleSorted(arr);
        for(int num:arr){
            System.out.printf("%2d",num);
        }
        System.out.print("\n");
    }

    private static void bubbleSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}

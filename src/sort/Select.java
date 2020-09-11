package sort;

public class Select {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 1, 4, 3, 2};
        selectSorted(arr);
        for (int num : arr) {
            System.out.printf("%2d", num);
        }
        System.out.println("\n");
    }

    private static void selectSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
}

import java.util.Arrays;

public class SortHalfArray {
    public static void sortFirstHalf(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        Arrays.sort(arr, 0, mid);
        System.out.println("Array after sorting the first half: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 1, 9, 5, 6, 8};
        sortFirstHalf(arr);
    }
}
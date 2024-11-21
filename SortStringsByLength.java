import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
    public static void sortByLength(String[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println("Array sorted by string length: ");
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "grape", "orange"};
        sortByLength(arr);
    }
}
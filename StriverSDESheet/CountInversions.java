package StriverSDESheet;

import java.util.Arrays;

public class CountInversions {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = new int[]{-10, -5, 6, 11, 15, 17};
        mergeSort(arr);
        System.out.println(count);
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] right = mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
        return sort(left, right);
    }

    private static int[] sort(int[] left, int[] right) {
        int i = 0, j = 0, k;
        //Count Inversions
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) i++;
            else {
                count = count + (left.length - i);
                j++;
            }
        }
        i = 0;
        j = 0;
        k = 0;
        // Merge the sorted
        int[] ans = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}

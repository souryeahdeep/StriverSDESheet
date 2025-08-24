package StriverSDESheet;

import java.util.Arrays;
// https://leetcode.com/problems/next-permutation/description/

public class NextPermutation {

    public static void main(String[] args) {
        NextPermutation ob = new NextPermutation();
        int[] arr = new int[]{1,2,3,5,6,4};
        ob.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void nextPermutation(int[] arr) {
        int pivot = -1;
        // TRAVERSE FROM RIGHT SIDE
        // GET THE FIRST DECREASING ELEMENT 
        for (int idx = arr.length - 2; idx >= 0; idx--) {
            if (arr[idx] < arr[idx + 1]) {
                pivot = idx;
                break;
            }
        }
        // IF NO DECREASING ELEMENT, REVERSE THE ARRAY AND REURN
        if (pivot == -1) {
            reverseArr(arr, pivot + 1, arr.length - 1);
            return;
        }
        //AGAIN TRAVERSE FROM RIGHT, AND FIND THE LARGEST ELEMENT
        for (int idx = arr.length - 1; idx >= 0; idx--) {
            if (arr[idx] > arr[pivot]) {
                swap(arr, idx, pivot);
                break;
            }
        }
        // REVERSE THE ARRAY FROM IND PIVOT + 1 TO N-1
        reverseArr(arr, pivot + 1, arr.length - 1);

    }

    private void swap(int[] arr, int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }

    private void reverseArr(int[] arr, int i, int j) {
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}

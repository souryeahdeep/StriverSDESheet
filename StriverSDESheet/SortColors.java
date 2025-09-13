package StriverSDESheet;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        SortColors ob = new SortColors();
        ob.sortColors(new int[]{2, 0, 2, 1, 1, 0});

    }

    void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 1) {
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int n, int m) {
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }
}

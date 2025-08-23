package StriverSDESheet;

import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        //setZeros(arr);//S.C -> O(n) T.C -> n^2 
        setZerosBest(arr);//S.C -> O(1) T.C -> n^2
    }

    private static void setZeros(int[][] arr) {
        int[] col = new int[arr.length];//n
        int[] row = new int[arr[0].length];//n
        Arrays.fill(col, -1);//n
        Arrays.fill(row, -1);//n
        int c0 = -1;
        //n^2
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    row[j] = 0;
                    col[i] = 0;
                }
            }
        }
        //n^2
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (row[j] == 0 || col[i] == 0) {
                    arr[i][j] = 0;
                }
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));
    }

    private static void setZerosBest(int[][] arr) {
        int c0 = -1;
        //n^2
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (i == 0) {
                        c0 = 0;
                    } else {
                        arr[0][j] = 0;
                    }
                }
            }
        }
        //n^2
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[0][j] == 0 || arr[i][0] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        //n
        if (c0 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[0][i] = 0;
            }
        }
        //n
        if (arr[0][0] == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}

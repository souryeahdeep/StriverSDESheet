package StriverSDESheet;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit ob = new MaxProfit();
        System.out.println(ob.maxProfit(new int[]{7, 6, 4, 3, 1}));;
    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = i + 1;
        while (j <= prices.length - 1) {
            if (prices[i] > prices[j]) {
                i = j++;
            } else {
                max = Math.max(max, prices[j] - prices[i]);
                j++;
            }
        }
        return max < 0 ? 0 : max;
    }
}

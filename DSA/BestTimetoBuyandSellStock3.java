
import java.util.Arrays;

public class BestTimetoBuyandSellStock3 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0 || n == 1) {
            return 0;
        }
        int[] leftDp = new int[n];
        int[] rightDp = new int[n];

        Arrays.fill(leftDp, 0);
        Arrays.fill(rightDp, 0);
        int minTillNow = prices[0];
        for (int i = 1; i < n; i++) {
            minTillNow = Integer.min(minTillNow, prices[i]);
            leftDp[i] = Integer.max(leftDp[i - 1], prices[i] - minTillNow);
        }

        int maxTillNow = prices[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            maxTillNow = Integer.max(maxTillNow, prices[j]);
            rightDp[j] = Integer.max(rightDp[j + 1], maxTillNow - prices[j]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Integer.max(ans, leftDp[i] + rightDp[i]);
        }

        return ans;
    }
}

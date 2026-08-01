class Solution {

    public long findKthSmallest(int[] coins, int k) {

        long low = 1;
        long high = (long) Arrays.stream(coins).min().getAsInt() * k;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (count(mid, coins) >= k)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    private long count(long x, int[] coins) {

        int n = coins.length;
        long ans = 0;

        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            boolean overflow = false;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    lcm = lcm(lcm, coins[i]);

                    if (lcm > x) {
                        overflow = true;
                        break;
                    }
                }
            }

            if (overflow)
                continue;

            long cnt = x / lcm;

            if (Integer.bitCount(mask) % 2 == 1)
                ans += cnt;
            else
                ans -= cnt;
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
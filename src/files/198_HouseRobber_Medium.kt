class Solution198 {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]

        val dp = IntArray(nums.size)

        // Base cases.
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])

        // ex nums = [3, 1, 2, 4]

        // index   0   1   2   3
        //        [ ] [ ] [ ] [ ]

        for (i in 2..nums.lastIndex) {
            val cur = nums[i]
            dp[i] = maxOf(dp[i-1], dp[i-2] + cur)
        }
        // dp = [3, 3, 5, 7]
        return dp.last()
    }
}

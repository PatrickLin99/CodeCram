package files
/**
 * 題目：取出最大連續數總和
 * 利用 Kadane's Algorithm
 * 介紹 https://www.youtube.com/watch?v=86CQq3pKSUw&t=16s
 * 1. 每一個數相加得到當前最大值 maxCurrent
 * 2. 若 maxCurrent 比 maxGlobal 大，則取代 maxGlobal，最後就可得到最大連續數總和
*/


fun maxSubArray(nums: IntArray): Int {
    var maxGlobal = nums[0]
    var maxCurrent = nums[0]

    for (i in 1 until nums.size) {
        maxCurrent = maxOf(nums[i], maxCurrent + nums[i])
        maxGlobal = maxOf(maxCurrent, maxGlobal)
    }

    return maxGlobal
}
/** 如果兩個數字加起來等於 target ，就返回它們的 index
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1] **/

/** 暴力解是使用兩個迴圈，時間複雜度 O(n^2) 、空間複雜度 O(1)
    下面解法使用 Map 沿途建立索引，時間複雜度 O(n) 、空間複雜度 O(n) **/

fun twoSum(nums: IntArray, target: Int): IntArray {

    val map = mutableMapOf<Int, Int>()

    for (i in 0 until nums.size) {

        val diff = target - nums[i]
        if (map.containsKey(diff)) {
            return intArrayOf(i, map[diff]!!)
        } else {
            map[nums[i]] = i
        }

    }
    return intArrayOf()
}

package files

fun missingNumber(nums: IntArray): Int {
    return (nums.size * (nums.size + 1)) / 2 - nums.sum()
}

// 暴力解
fun missingNumber1(nums: IntArray): Int {
    val length: Int = nums.size
    nums.sort()

    for (i in nums.indices){
        if (nums[i] != i) {
            return i
        }
    }

    return length
}
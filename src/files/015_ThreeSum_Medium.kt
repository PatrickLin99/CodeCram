
/**
    從 nums 中找到三個總合為 0 的數字，並返回三個數字的值。

    Input  [-1,0,1,2,-1,-4]
    Output [[-1,-1,2],[-1,0,1]]
**/


/**
     Note: 
     先鎖定一個數字 `X` ，接著就只要找總和為 `-X` 的兩個數字即可。
 **/

// https://raw.githubusercontent.com/PatrickLin99/CodeCram/master/src/files/attachment/015_ThreeSum.jpg

fun threeSum(nums: IntArray): List<List<Int>> {

    nums.sort()
    val result = HashSet<List<Int>>()

    for (i in 0 until nums.size) {
        val target = -nums[i]
        var start = i + 1
        var end = nums.size -1

        while (start < end) {
            when {
                nums[start] + nums[end] == target -> {
                    result.add(listOf(nums[i], nums[start], nums[end]))
                    start ++
                    end --
                }
                nums[start] + nums[end] < target -> {
                    start ++
                }
                else -> {
                    end --
                }
            }
        }
    }

    return result.toList()
}

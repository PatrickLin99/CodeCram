package files

/**
 * 給定一個整數數組 nums，如果任何值在數組中至少出現兩次，則返回 true
 * ，如果每個元素都是不同的，則返回 false 。
 */

/**
 * 解法 1.
 * 使用 when 確認這個 List size > 0
 * 用第一個數字去和後面的數字做比對，
 * 若是配對到一樣的，馬上返回 true
 * 若沒有配對要一樣的，刪除現行 List 裡的第一個數字，
 * 重新回到迴圈再從第一個數字再跑
 */

fun containsDuplicate(nums: IntArray): Boolean {
    val ls = nums.toMutableList()
    val status = false
    while (ls.size > 1) {
        for (i in 1..ls.lastIndex) {
            if (ls[0] == ls[i]) {
                return true
            }
        }
        ls.removeAt(0)
    }
    return status
}

/**
 * 解法 2.
 * 使用 kotlin 函數 distinct，
 * distinct 可以刪除字串中重複的 value，
 * 在和原本的 List 比對他的 size 是否減少並回傳。
 */

fun containsDuplicateA(nums: IntArray): Boolean {
    return nums.size > nums.distinct().size
}

/**
 * 解法 3.
 * 因為 set 不會有重複的 element，如果重複時 add 會返回 false
 * 可以用 mutableSetOf<Int>().add(Int) 來判斷是不是有重複過
 */
 
fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (i in 0 until nums.size) {
        if (!set.add(nums[i])) {
            return true
        }
    }
    return false
}

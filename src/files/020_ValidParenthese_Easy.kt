package files

import java.util.*

/**
 * 要求字串裡面閉合的括號'(', ')', '[', ']', '{', '}' 需成雙出現且對具對稱性質
 * Ex: s = "()[]{}" 回傳 true
 * Ex: s = "([{}])" 回傳 true
 * Ex: s = "(]" 回傳 false
 *
 */

/**
 * 利用 stack 先進後出的性質且跟既有括號 table 比對
 * 接著如果比對下一個符合就 pop 掉，不符合就留在 stack 裡面
 * 故 stack 如果不為空代表裡面還有 括號元素 回傳 false
 * 反之 stack 裡面無任何元素代表依序皆被 pop 掉 所以回傳 true
 */

fun isValid(s: String): Boolean {
    val table = mapOf(
        ']' to '[',
        '}' to '{',
        ')' to '('
    )
    val stackChar = Stack<Char>()
    s.forEach {

        stackChar.push(it)

        if (table.containsKey(it)) {

            if (stackChar.size < 2) return false
            if (stackChar[stackChar.size - 2] != table[it] )

            stackChar.pop()
            stackChar.pop()

        }
    }
    return stackChar.isEmpty()

}
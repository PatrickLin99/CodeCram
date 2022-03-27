/**
 * linked lists
 * Linked list(連結串列)是一種常見的資料結構，其使用node(節點)來記錄、表示、儲存資料(data)，
 * 並利用每個node中的pointer指向下一個node，藉此將多個node串連起來，形成Linked list，
 * 並以NULL來代表Linked list的終點。
 * http://alrightchiu.github.io/SecondRound/linked-list-introjian-jie.html
 */

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
       return when {
            list1 == null -> list2
            list2 == null -> list1
            list1.`val`< list2.`val` -> {
                list1.next = mergeTwoLists(list1.next, list2)
                list1
            }
            else -> {
                list2.next = mergeTwoLists(list1, list2.next)
                list2
            }
        }
    }
}

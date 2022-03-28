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
  
    // 範例：1->2->3->null 也就是下面的樣子
    //
    //    ListNode(1).apply {
    //        next = ListNode(2).apply {
    //            next = ListNode(3).apply {
    //                next = null
    //            }
    //        }
    //    }
    // 
    // 但我們要把它倒過來變 3->2->1->null 也就是下面的樣子
    //
    //    ListNode(3).apply {
    //        next = ListNode(2).apply {
    //            next = ListNode(1).apply {
    //                next = null
    //            }
    //        }
    //    }
    // 
  
    // head = 1->2->3->null
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        // 第一次 prev = null
        // 第二次 prev = 1->null
        // 第三次 prev = 2->1->null
        // 第四次 prev = 3->2->1->null

        var current = head
        // 第一次 current = 1
        // 第二次 current = 2
        // 第三次 current = 3
        // 第四次 current = null

        while(current != null) {
            prev = ListNode(current.`val`).apply { next = prev }
            // 第一次 reversed = 1->null
            // 第二次 reversed = 2->1->null
            // 第三次 reversed = 3->2->1->null

            current = current.next
            // 第一次 prev = 2
            // 第二次 prev = 3
            // 第三次 prev = null
        }

        return prev
    }
}

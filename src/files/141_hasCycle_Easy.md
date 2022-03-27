## Has Cycle
要判斷 linked list 裡面有沒有 cycle


如果某個 node 的 `next` 指向先前已經出現過的 node，就代表有 cycle

## 解法
因為主要是判斷 `有沒有重複出現` ，可以使用 `set()`


Set 裡面不會有重複的 element，可以用 `add()` 判斷是否已經有重複


`add()` 成功會返回 `true` ，如果 set 裡面已經有一樣的 element ，會返回 `false` 

```
fun hasCycle(head: ListNode?): Boolean {
    val map = mutableSetOf<ListNode>()
    var currentNode = head

    while (currentNode != null) {
        if (!map.add(currentNode)) {
            return true
        }
        currentNode = currentNode.next
    }
    return false   
}
```
時間複雜度 O(n)，空間複雜度 O(n)




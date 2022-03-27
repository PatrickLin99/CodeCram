## Maximum Depth of Binary Tree
得到 Binary Tree 的深度

![image](https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg)

## 思路
要知道 tree 的深度，需要去遍歷 tree 的所有節點，如果是要遍歷 Binary Tree 的話，可以思考如何使用遞迴


#### 先從第一層看起

首先會給定一個 root，要先判斷當前 root 是不是 null

* is null -> return `0`
* not null -> return `1 (自己的深度) + 左 or 右的最大深度` 

#### 如何得知左邊和右邊的最大深度？

讓 `maxDepth(root.left)` 和 `maxDepth(root.right)` 比大小

遞迴就形成了～

## 解法

```
fun maxDepth(root: TreeNode?): Int {
    if (root == null) {
        return 0
    } else {
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1)
    }
}
```

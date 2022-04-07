// 面積 = 最小高度 * 寬度

// 第一次 Index: start = 0 end = 8，高度： start = 1 end = 7，所以最小高度是 1 寬度是8， 面積是 8
// 第二次 Index: start = 1 end = 8，高度： start = 8 end = 7，所以最小高度是 7 寬度是7， 面積是 49
// 第三次 Index: start = 1 end = 7，高度： start = 8 end = 3，所以最小高度是 3 寬度是6， 面積是 18
// 第四次 Index: start = 1 end = 6，高度： start = 8 end = 8，所以最小高度是 8 寬度是5， 面積是 40
// 第五次 Index: start = 1 end = 5，高度： start = 8 end = 4，所以最小高度是 4 寬度是4， 面積是 16
// 第六次 Index: start = 1 end = 4，高度： start = 8 end = 5，所以最小高度是 5 寬度是3， 面積是 15
// 第七次 Index: start = 1 end = 3，高度： start = 8 end = 2，所以最小高度是 2 寬度是2， 面積是 4
// 第八次 Index: start = 1 end = 2，高度： start = 8 end = 6，所以最小高度是 6 寬度是1， 面積是 6
// 第九次 Index: start = 1 end = 1  -> ＳＴＯＰ

    fun maxArea(height: IntArray): Int {
         if (height.isEmpty()) return 0

        var maxArea = 0
        var startIndex = 0
        var endIndex = height.size - 1

        while (startIndex <= endIndex) {
            val area = (endIndex - startIndex) * Math.min(height[startIndex],height[endIndex])
            maxArea = Math.max(maxArea, area)

            if (height[startIndex] < height[endIndex]) startIndex++ else endIndex--
        }

        return maxArea
    }

```
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    var output = [];
    var s = new Set(nums2);
    var m = new Set(nums1);
    m.forEach(x => (s.has(x)) ? output.push(x) : null); 
    return output;
};
```
定义两个变量：s 和 m，将两个数组分别加入Set里，这样可以得到所有独一的值
对比两组set的值，将公共的值加入output这个数组里，返回最后答案
```
var intersect = function(nums1, nums2) {
    let map1 = {};
    let arr =[];
    for(let i = 0; i < nums1.length; i++){
        map1[nums1[i]] ? map1[nums1[i]]++ : map1[nums1[i]] = 1
    }
    for(let i = 0; i < nums2.length; i++){
        if(map1[nums2[i]] > 0){
            arr.push(nums2[i]);
            map1[nums2[i]]--
        }
    }

    return arr;
};
```
    public int[] intersection(int[] nums1, int[] nums2) {
        //Create two sets: set and intersect
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        //add all elements from nums1 to set
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        //if set contains same elements as array nums2, add them to another set named [intersect] 
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])) intersect.add(nums2[i]);
        }
        
        //Create a new array named result
        int[] result = new int[intersect.size()];
        int i = 0;
        //assign values to new array
        for(Integer num : intersect){
            result[i++] = num;
        }
        
        return result;
    }


    //Hint: method 1: two hashset
    //      method 2 : two pointers
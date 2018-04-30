    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      //create and assign two arrays' length to two variables: n1 and n2
       int n1 = nums1.length, n2 = nums2.length;
      //create a new array and its length is n1 + n2
       int[] nums = new int[n1 + n2];
       //add array nums1 's elements to new array'
       for(int i = 0; i < n1; i++){
           nums[i] = nums1[i];
       }
       //add array nums2 's elements to new array
       for(int i = 0; i < n2; i++){
           nums[n1] = nums2[i];
           n1++;
       }
       //sort the new array
       Arrays.sort(nums);
       //declare a new variable 
       double median;
       //check the new array's length : odd or even
       if(nums.length % 2 == 0){
          //even
           median = (nums[nums.length/2 - 1] + nums[nums.length/2])/2.0;
       }else{
          //odd
           median = (double) nums[nums.length/2];
       }
        return median;
    }

 	public int[] intersect(int[] nums1, int[] nums2) {
        //create an arraylist
        List<Integer> list = new ArrayList<>();
        //sort both two arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //add the element to list if both arrays have same element
        for(int i = 0, j = 0; i < nums1.length && j < nums2.length;){
            if(nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        //create an new array namded result
        int[] result = new int[list.size()];
        //assign value to the new array
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }

    //Hint: arraylist + two pointer
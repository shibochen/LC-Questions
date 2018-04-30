 public int romanToInt(String s) {
    int nums[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        switch (s.charAt(i)){
            case 'M':
                nums[i]=1000;
                break;
            case 'D':
                nums[i]=500;
                break;
            case 'C':
                nums[i]=100;
                break;
            case 'L':
                nums[i]=50;
                break;
            case 'X' :
                nums[i]=10;
                break;
            case 'V':
                nums[i]=5;
                break;
            case 'I':
                nums[i]=1;
                break;
        }
    }
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1])
            sum-=nums[i];
        else
            sum+=nums[i];
    }
    return sum+nums[nums.length-1];
}



 public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>()
    {{
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L', 50);
         put('C', 100);
         put('D', 500);
         put('M', 1000);
    }};
    
    int result = 0;
    
    if(s.length() == 0) return 0;

    if(s.indexOf("IV")!=-1) result -= 2;
    if(s.indexOf("IX")!=-1) result -= 2;
    if(s.indexOf("XL")!=-1) result -= 20;
    if(s.indexOf("XC")!=-1) result -= 20;
    if(s.indexOf("CD")!=-1) result -= 200;
    if(s.indexOf("CM")!=-1) result -= 200;

    char arr[] = s.toCharArray();

    for(int i=0; i<s.length(); i++){
        result += map.get(arr[i]);
    }

   return result;
 
    }
class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
    if(x + y < z) return false;

    if( x == z || y == z || x + y == z ) return true;

    return z%GCD(x, y) == 0;
}

  public int GCD(int a, int b){
      return b == 0 ? a : GCD(b, a % b);
  }
}

/*
题意：给你2个坛子，容量分别为 x 和 y， 要求我们通过
用两个坛子往里面倒水，或者倒出去水，使得这个
容器的水刚好是z 升

The basic idea is to use the property of Bézout's identity and check if z is a multiple of GCD(x, y)
*/

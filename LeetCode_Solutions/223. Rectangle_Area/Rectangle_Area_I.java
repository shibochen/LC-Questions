class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (H - F) * (G - E);
        if (E >= C || F >= D || B >= H || A >= G) return area;
        return area - (Math.min(G, C) - Math.max(A,E)) * (Math.min(D, H) - Math.max(B, F));
    }
}

/*
思路：假如两个长方形不重合就直接算（line 3）， 如果重合减去重合地方就可以（line 5）
*/

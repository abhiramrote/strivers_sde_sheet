class Solution {
    int median(int A[][], int R, int C) {
        // code here      
        int low=1;
        int high=Integer.MAX_VALUE;
        int n=R;
        int m=C;
        while (low <= high) {
      int mid = (low + high) >> 1;
      int cnt = 0;
      for (int i = 0; i < n; i++) {
        cnt += countSmallerThanMid(A[i], mid, C);
      }
      if (cnt <= (n * m) / 2)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return low;
  }
    public static int countSmallerThanMid(int[] A, int mid, int n) {
    int l = 0, h = n - 1;
    while (l <= h) {
      int md = (l + h) >> 1;
      if (A[md] <= mid) {
        l = md + 1;
      } else {
        h = md - 1;
      }
    }
    return l;
  }
}

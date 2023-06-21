class Solution {
    public void rotate(int[][] a) {
        
        int r=a.length;
        int c=a[0].length;
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
               int t=0;
               t=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=t;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int t=0;
                t=a[i][j];
                a[i][j]=a[i][r-1-j];
                a[i][r-1-j]=t;
            }
        }
    }
}

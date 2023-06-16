class Solution {
    public void setZeroes(int[][] matrix) {
    
      int rows=matrix.length;
      int cols=matrix[0].length;
      Set<Integer>rset=new HashSet<>();
      Set<Integer>cset=new HashSet<>();
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              if(matrix[i][j]==0){
                  rset.add(i);
                  cset.add(j);
              }
        }
      }
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                if(rset.contains(i)|| cset.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

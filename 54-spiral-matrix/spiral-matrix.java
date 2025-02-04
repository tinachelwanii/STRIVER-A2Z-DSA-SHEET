class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

    int startrow=0, startcol=0;
    int endrow=matrix.length-1 ,  endcol=matrix[0].length-1;

    while(startrow<=endrow && startcol<=endcol){
        for(int j=startcol;j<=endcol;j++){
            result.add(matrix[startrow][j]);
        }
        for(int i=startrow+1;i<=endrow;i++){
            result.add(matrix[i][endcol]);
        }
        if (startrow != endrow) { 
        for(int j=endcol-1;j>=startcol;j--){
            result.add(matrix[endrow][j]);
        }
        }
        if(startcol != endcol){
        for(int i=endrow-1;i>startrow;i--){
            result.add(matrix[i][startcol]);
            }
        }
         startcol++;
         startrow++;
         endcol--;
         endrow--;
    }
    return result;
    }
}
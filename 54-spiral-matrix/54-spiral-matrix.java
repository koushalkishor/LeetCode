class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll=new ArrayList<>();
        int i;
        int k=0;
        int l=0;
        int row=matrix.length;
        int col=matrix[0].length;
        while(k<row && l<col){
            for(i=l;i<col;i++){
                ll.add(matrix[k][i]);
            }
            k++;
            for(i=k;i<row;i++){
                ll.add(matrix[i][col-1]);
            }
            col--;
            if(k<row){
                for(i=col-1;i>=l;i--){
                    ll.add(matrix[row-1][i]);
                }
                row--;
            }
            if(l<col){
                for(i=row-1;i>=k;i--){
                    ll.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ll;
    }
}
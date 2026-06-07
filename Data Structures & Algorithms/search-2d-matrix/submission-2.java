class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=-1;
        int rowLength = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            int n = matrix[i][0];
            int m = matrix[i][matrix[0].length-1];
            if(target>=n && target<=m){
                row=i; 
                break;
            }
            else continue;
        }
        if(row==-1) return false;
        int arr[] = matrix[row];
        Arrays.stream(arr).forEach(n->System.out.print(" "+n));
        int m = binarySearch(0,rowLength-1, arr, target);
        return m!=-1;
    }
    public int binarySearch(int l, int r, int num[], int target){
        while(l<=r){
            int m = (l+r)/2;
            if(target == num[m]) return m;
            else if(target < num[m]){
                return binarySearch(l,m-1, num, target);
            }
            else{
                return binarySearch(m+1,r, num, target);
            }
        }
        return -1;
    }
}

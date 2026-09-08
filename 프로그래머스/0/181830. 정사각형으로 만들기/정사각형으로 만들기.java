class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        
        if(row == column) return arr;
        
        int max = Math.max(row, column);
        int[][] answer = new int[max][max];
        
        for(int i=0; i<row; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, column);
        }
        return answer;
    }
}
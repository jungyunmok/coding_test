import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        int row = arr.length;
        int column = arr[0].length;
        int max = Math.max(row, column);
        if(row != column) {
            answer = new int[max][max];
            for(int i=0; i<row; i++) {
                answer[i] = Arrays.copyOf(arr[i], max);
            }
        } else {
            return arr;
        }
        return answer;
    }
}
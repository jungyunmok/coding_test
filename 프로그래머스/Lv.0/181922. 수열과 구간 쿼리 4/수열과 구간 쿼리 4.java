class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int[] query : queries) {
            for(int i=query[0]; i<=query[1]; i++) {
                if(i%query[2] == 0) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}
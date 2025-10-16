class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        int mod = 1234567;
        
        for(int i=0; i<n; i++) {
            int b = (a + answer) % mod;
            answer = a;
            a = b;
        }
        return answer;
    }
}
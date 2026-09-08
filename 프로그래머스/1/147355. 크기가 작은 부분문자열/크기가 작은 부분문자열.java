class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        Long standard = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-pLength; i++) {
            Long num = Long.parseLong(t.substring(i, i+pLength));
            if(num <= standard) answer++;
        }
        return answer;
    }
}
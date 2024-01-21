class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String str : order) {
            if(str.equals("anything") || str.contains("americano")) {
                answer += 4500;
            } else if(str.contains("cafelatte")) {
                answer += 5000;
            }
        }
        return answer;
    }
}
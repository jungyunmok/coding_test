class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length) {
            int sum1 = 0;
            int sum2 = 0;
            for(int num : arr1) {
                sum1 += num;
            }
            for(int num : arr2) {
                sum2 += num;
            }
            answer = sum1 == sum2 ? 0 : (
            sum1 > sum2 ? 1 : -1);
        } else {
            answer = arr1.length > arr2.length ? 1 : -1;            
        }
        return answer;
    }
}
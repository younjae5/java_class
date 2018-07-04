package week.first;

//자연수 N이 주어졌을 때, 1부터 N까지 정수형 배열 answer에 담아 리턴하는 프로그램을 작성하시오.

public class Number6 {
    class Solution {
        public int[] solution(int n) {
            int[] answer = {};
            answer = new int[n];
            for(int i = 0; i < n; i++){
                int value = i + 1;
                answer[i] = value;
            }
            return answer;
        }
    }

}

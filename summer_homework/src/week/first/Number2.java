package week.first;

//2의 b승을 계산해 이 값을 a와 곱하는 리턴하는 프로그램을 구현하시오.

public class Number2 {
    class Solution {
        public double solution(int a, int b) {
            double answer = 1;
            for(int i = 0; i < b; i++){
                answer *= 2;
            }
            answer *= a;
            return answer;
        }
    }

}

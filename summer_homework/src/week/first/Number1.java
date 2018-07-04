package week.first;

//함수의 인자값으로 양의 정수 n이 주어진다. 이때, n의 자리수중 가장 큰 수를 리턴하는 함수를 구현하시오.

public class Number1 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int max = 0;
            while(n != 0){
                max = n % 10;
                n /= 10;
                if(max > answer){
                    answer = max;
                }
            }
            return answer;
        }
    }
}

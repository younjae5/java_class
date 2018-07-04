package week.first;

//함수의 인자로 양의 정수 n, m, k가 주어진다. 이때, n 이상, m 이하의 정수들중 k의 배수가 몇개있는지 구하시오.

public class Number9 {
    class Solution {
        public int solution(int n, int m, int k) {
            int answer = 0;
            for(int i = n; i <= m; i++){
                if(i % k == 0){
                    answer += 1;
                }
            }
            return answer;
        }
    }
}

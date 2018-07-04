package week.first;
/*10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다.
 *함수의 인자로 양의 정수 n이 주어졌을때, 
 *n 미만의 자연수에서 3과 5의 배수의 합을 구하시오.
 */

public class Number7 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i = 1; i < n; i++){
                if(i % 3 == 0 || i % 5 == 0){
                    answer += i;
                }
            }
            return answer;
        }
    }

}

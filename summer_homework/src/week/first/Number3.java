package week.first;

/*  함수의 인자 값으로 2차원 정수형 배열 arr이 주어진다. 이때, arr[i] 배열의 모든 요소의 합을 구하고, 
 *  이를 정수형 배열 answer의 i번째 자리에 담아 리턴하는 함수를 구현하시오*/

public class Number3 {

    class Solution {
        public int[] solution(int[][] param0) {
            int[] answer = {};
            int len = param0.length;
            answer = new int[len];
            for(int i = 0; i < len; i++){
                int sum = 0;
                for(int j = 0; j < param0[i].length; j++){
                    sum += param0[i][j];
                }
                answer[i] = sum;
                
            }
            return answer;
        }
    }
}

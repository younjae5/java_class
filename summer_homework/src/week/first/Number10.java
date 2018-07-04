package week.first;

/*함수의 인자값으로 0~9까지의 숫자가 들어있는 정수형 배열 arr이 주어진다. 
 * 이때, 배열내의 가장 많이 존재하는 수를 찾아 리턴하는 함수를 구현하시오.*/
public class Number10 {
    class Solution {
        public int solution(int[] arr) {
            int answer = 0;
            int[] sample = {0,0,0,0,0,0,0,0,0,0};
            
            int len = arr.length;
            for(int i = 0; i < len; i++){
                sample[arr[i]] += 1;
            }
            int num = 0;
            int max = 0;
            for(int i = 0 ; i < 10; i++){
                num = sample[i];
                if(num > max){
                    max = num;
                    answer = i;
                    
                }
            }
            return answer;
        }
    }
}

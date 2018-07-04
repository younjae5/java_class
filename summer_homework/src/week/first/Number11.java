package week.first;

/*
 * 사각형의 가로와 세로의 길이를 담은 일차원 배열들을 담은 이차원 배열이 주어진다. 
 * 이때, 각 사각형의 넓이를 계산하여 가장 큰 사각형이 담겨있는 인덱스를 리턴하는 함수를 구현하시오.*/

public class Number11 {
    class Solution {
        public int solution(int[][] arr) {
            int answer = 0;
            int len = arr.length;
            int[] num = {};
            num = new int[len];
            for(int i = 0; i < len; i++){
                int mul = arr[i][0] * arr[i][1];
                num[i] = mul;
            }
            
            int max = 0;
            int number = 0;
            for(int i = 0; i < len; i++){
                number = num[i];
                if(number > max){
                    max = number;
                    answer = i;
                }
            }
            return answer;
        }
    }
}

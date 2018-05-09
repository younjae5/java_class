package programmers_homework;

public class Rhythm {
  class Solution {
    public String solution(int[] rhythm) {
        String answer = "";
        int asc[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int des[] = {8, 7, 6, 5, 4, 3, 2, 1};
        if(rhythm[0] == asc[0]){
            answer = "ascending";
            for(int i = 0; i < 8; i++){
                if(rhythm[i] != asc[i]){
                    answer = "mixed";
                }
            }
        }else if(rhythm[0] == des[0]){
            answer = "descending";
            for(int j = 0; j < 8; j++){
                if(rhythm[j] != des[j]){
                    answer = "mixed";
                }
            }
        }
        return answer;
    }
}
}

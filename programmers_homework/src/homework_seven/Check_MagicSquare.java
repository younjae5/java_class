package homework_seven;
import java.lang.*;
class Square {

    String sum = null;

    //--------------------------------------
    // sum에 첫째 행의 합을 문자열로 변환하여 저장하고(즉, 첫째 행의 합이 123이면
    // 수를 문자열로 변환한 “123”을 sum에 저장), 매직 스퀘어이면 true를, 아니면
    // false를 반환
    //--------------------------------------
    public boolean isMagicSquare(int[][] square) {
        boolean answer = true;
        int len = square.length;
        long row[] = new long[len];
        long col[] = new long[len];
        long dia[] = new long[2];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                row[i] += square[i][j];   //행의 합 저장
            }
        }
        for(int i=0; i<len-1; i++){
            if(row[i]!=row[i+1]){
                answer = false;         //행의 합이 다르면 false로 수정
            }
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                col[j] += square[i][j]; //열의 합 저장
            }
        }
        
        for(int i=0; i<len-1; i++){
            if(col[i]!=col[i+1]){
                answer = false;   //열의 합이 다르면 false로 수정
            }
        }
        for(int i=0; i<len; i++){
            dia[0] += square[i][i]; // 왼쪽 대각선 합 저장
        }
        for(int i=0; i<len; i++){
            dia[1] += square[i][len-1-i]; // 오른쪽 대각선 합 저장
        }
        if(dia[0]!=dia[1]){
            answer = false;      // 대각선 합이 다르면 false로 수정
        }
        
        this.sum = String.valueOf(row[0]);
        
        return answer;
    }
}

// 절대 주의!!!!! 아래 코드는 수정하지 마세요. 지워서도 안됩니다.
class Solution {
  public int solution(int ignore) {
      int answer = 0;
      return answer;
  }
}
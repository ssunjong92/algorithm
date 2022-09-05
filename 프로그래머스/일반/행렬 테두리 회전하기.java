public class Main {
	public static void main(String args[]) {
		Solution sol = new Solution();
		int[][] a = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int[] answer = sol.solution(6, 6, a);
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}

class Solution {
	int[][] arr;
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        // 행렬 담을 배열 선언
        arr = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		arr[i][j] = columns*i + j + 1;
        	}
        }
        
        // queries 길이만큼 반복
        for(int i = 0; i < queries.length; i++){
            answer[i] = turning(queries[i]);
        }
        
        return answer;
    }
    
    // 회전하는 부분
    public int turning(int[] query) {
    	int y1 = query[0]-1; 
        int x1 = query[1]-1;
        int y2 = query[2]-1;
        int x2 = query[3]-1;
        
        int tmp = arr[y1][x1]; 
        
        int min = tmp;
        // 맨 뒤에서부터(y축 한칸씩 올리기)
        for(int i = y1; i < y2; i++){ 
            arr[i][x1] = arr[i+1][x1];
            if(min > arr[i][x1]) {
            	min = arr[i][x1];
            }
        }
        // 밑에 X축 한칸씩 왼쪽으로
        for(int i = x1; i < x2; i++){ 
            arr[y2][i] = arr[y2][i+1];
            if(min > arr[y2][i]) {
            	min = arr[y2][i];
            }
        }
        // 오른쪽 y축 한칸씩 내리기
        for(int i = y2; i > y1; i--){
            arr[i][x2] = arr[i-1][x2];
            if(min > arr[i][x2]) {
            	min = arr[i][x2];
            }
        }
        // 맨 윗줄 x축 한칸씩 오른쪽으로
        for(int i = x2; i > x1; i--){
            arr[y1][i] = arr[y1][i-1];
            if(min > arr[y1][i]) {
            	min = arr[y1][i];
            }
        }
        // 값이 안들어간 부분 초기 tmp에 담은 값 넣어주기
        arr[y1][x1+1] = tmp;
        
        return min;
    }
}

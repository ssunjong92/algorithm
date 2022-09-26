import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws Exception {
		
		// BufferedReader로 입력값 읽어드리기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 읽어드린 입력값을 int형 n으로 저장
		int n = Integer.parseInt(br.readLine());
		
		// 다이아몬드를 담을 2차열 배열 선언
		String[][] diamond = new String[n][n];
		// 이쁘게 출력하기 위해 빈칸으로 초기화
		for(int i = 0; i < n; i++) {
			Arrays.fill(diamond[i], " ");
		}
		
		// 다이아몬드 찍기
		for(int i = 0; i < n; i++) {
			// i가 길이의 반보다 같거나 작을경우
			if(i <= n / 2) {
				for(int j = n/2 - i; j <= n/2 + i; j++) {
					diamond[i][j] = "#";
				}
			// i가 길이의 반보다 클경우
			} else {
				for(int j = i - n/2; j <= n - i + n/2 - 1; j++) {
					diamond[i][j] = "#";
				}
			}
		}
		
		// 출력해서 보여주기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(diamond[i][j]);
			}
			System.out.println();
		}
	}
}

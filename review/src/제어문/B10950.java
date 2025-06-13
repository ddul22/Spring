package 제어문;

import java.util.Scanner;

public class B10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 갯수 입력
		int score1;
		int score2;
		int total = 0;
		
		int cnt = sc.nextInt();
		
		// 반복문
		for(int i=0; i < cnt; i++) {
			score1 = sc.nextInt();
			score2 = sc.nextInt();
			total = score1+score2 ;
			System.out.println(total);
		}
		
		// 두수입력받고 합계 출력
		
	}	
}

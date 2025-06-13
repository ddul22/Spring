package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForArray {
public static void main(String[] args) throws FileNotFoundException {
	
	
	//파일 입력
			File file = new File("src/resources/engScore.txt");
			Scanner sc = new Scanner(file);

			int score;
			int total = 0;
			
			int cnt = sc.nextInt();
			int[] a = new int[cnt];
			
			for(int i=0; i < cnt ; i++) {
				score = sc.nextInt();
				//입력값을 배열에 저장
				a[i] = score;
				total += score;
			}
			
			// 배열 출력
			for(int i=0; i<cnt; i++) {
				System.out.println(a[i]);
			}
			//합계출력
			System.out.println(total);
}
}

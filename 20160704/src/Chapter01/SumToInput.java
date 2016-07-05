package Chapter01;

import java.util.Scanner;

//(7/5) 6. For문 과제 (n까지의 합 구하기)
public class SumToInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int result = 0;
		for (int i = 0; i <= num; i++) {
			result = result + i;
		}
		System.out.println(num + "까지의 모든 숫자의 합은 " + result + "입니다.");
	}
}
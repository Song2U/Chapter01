package Chapter01;

import java.util.*; // Scanner 클래스를 사용하기 위함

//(7/5) 4. while문 실습문제 - 소수 여부 판단
public class PrimeDetect {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		int result = 0;

		// 소수 판단
		while (divisor < num) {
			if (num % divisor == 0) { // 소수가 아니면
				isPrime = false;
				break;
			}
			divisor++;
		}
		if (isPrime == true) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}
}
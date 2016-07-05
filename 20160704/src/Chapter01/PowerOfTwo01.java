package Chapter01;

import java.util.Scanner;

//(7/5) 3. while문 실습문제 - 제곱값 구하기
public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//warning 뜨는 이유 : 키보드 자원을 해제해주지 않아서(닫히지 않고 계속 열려있음)
												 //-> 자원을 닫아주지 않으면 크거나 복잡한 프로그램에서 프로세스를 사용할 시 문제 발생 가능

		// System.out.println : 내용 출력 후 개행문자(\n) 출력해서 다음 줄로 넘어감
		System.out.print("승수 : "); // 내용 출력 후 다음 줄로 넘어가지 않음
		int power = scanner.nextInt();
		int i = 0;
		int result = 1;
		while (i < power) {
			result = result * 2; // -> result *= 2 와 같음
			i++;
		}
		System.out.println("2의 " + power + "제곱은 " + result + "입니다.");
	}
}
package Chapter01;

import java.util.Scanner;

// (7/5) 2. 입력한 숫자만큼 HelloWorld 출력 
public class NHelloWorld {

	public static void main(String[] args) {
		// String s = new String("Hello World!");
		// String s = new String("Hello World");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int i = 0;
		while (i < count) {
			System.out.println("Hello World!");
			i = i + 1;
		}
		System.out.println(count);
	}
}
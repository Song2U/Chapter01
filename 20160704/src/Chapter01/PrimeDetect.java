package Chapter01;

import java.util.*; // Scanner Ŭ������ ����ϱ� ����

//(7/5) 4. while�� �ǽ����� - �Ҽ� ���� �Ǵ�
public class PrimeDetect {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		int result = 0;

		// �Ҽ� �Ǵ�
		while (divisor < num) {
			if (num % divisor == 0) { // �Ҽ��� �ƴϸ�
				isPrime = false;
				break;
			}
			divisor++;
		}
		if (isPrime == true) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
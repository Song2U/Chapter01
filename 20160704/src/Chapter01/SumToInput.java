package Chapter01;

import java.util.Scanner;

//(7/5) 6. For�� ���� (n������ �� ���ϱ�)
public class SumToInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int result = 0;
		for (int i = 0; i <= num; i++) {
			result = result + i;
		}
		System.out.println(num + "������ ��� ������ ���� " + result + "�Դϴ�.");
	}
}
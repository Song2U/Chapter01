package Chapter01;

import java.util.Scanner;

//(7/5) 3. while�� �ǽ����� - ������ ���ϱ�
public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//warning �ߴ� ���� : Ű���� �ڿ��� ���������� �ʾƼ�(������ �ʰ� ��� ��������)
												 //-> �ڿ��� �ݾ����� ������ ũ�ų� ������ ���α׷����� ���μ����� ����� �� ���� �߻� ����

		// System.out.println : ���� ��� �� ���๮��(\n) ����ؼ� ���� �ٷ� �Ѿ
		System.out.print("�¼� : "); // ���� ��� �� ���� �ٷ� �Ѿ�� ����
		int power = scanner.nextInt();
		int i = 0;
		int result = 1;
		while (i < power) {
			result = result * 2; // -> result *= 2 �� ����
			i++;
		}
		System.out.println("2�� " + power + "������ " + result + "�Դϴ�.");
	}
}
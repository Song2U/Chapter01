package Chapter01;

//11.swap
public class Swap {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;

		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		if (n1 > n2) {
			System.out.println("�ִ밪�� " + n1 + "�Դϴ�.");
		} else {
			int temp = n1;
			n1 = n2;
			n2 = temp;
			System.out.println("�ִ밪�� " + n1 + "�Դϴ�.");
		}

		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println();

		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		if (a1 >= a2) {
			if (a2 >= a3) {
				System.out.println("�ִ밪 : a1");
				System.out.println(a1 + ">" + a2 + ">" + a3);
			} else if (a3 >= a1) {
				System.out.println("�ִ밪 : a3");
				System.out.println(a3 + ">" + a1 + ">" + a2);
			} else {
				System.out.println("�ִ밪 : a1");
				System.out.println(a1 + ">" + a3 + ">" + a2);
			}
		} else if (a1 >= a3) {
			System.out.println("�ִ밪 : a2");
			System.out.println(a2 + ">" + a1 + ">" + a3);
		} else {
			System.out.println("�ִ밪 : a2");
			System.out.println(a2 + ">" + a3 + ">" + a1);
		}
	}
}
/*
 * ��� ��� 
 * if a1>=a2 if a1>=a3 �ִ밪�� a1 else �ִ밪�� a3 
 * else if(a2>=a3) �ִ밪�� a1 else �ִ밪�� a3
 */
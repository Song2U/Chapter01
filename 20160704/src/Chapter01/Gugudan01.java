package Chapter01;

//(7/5) 5. ��ø while�� �ǽ����� - ������ �ۼ�
public class Gugudan01 {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 9) {

			int j = 1;
			while (j < 9) {
				j = j + 1;
				System.out.println(i + " x " + j + " = " + i * j);
			}
			i = i + 1;
			System.out.println();
		}
	}
}
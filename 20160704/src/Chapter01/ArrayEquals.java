package Chapter01;

//(7/5) 11 ������ �迭���� Ȯ���ϴ� ���α׷�
public class ArrayEquals {

	public static void main(String[] args) {
		int[] a1 = { 100, 200, 300 };
		int[] a2 = { 100, 200, 300 };

		boolean result = equals(a1, a2);
		System.out.println(result);
	}

	public static boolean equals(int[] array1, int[] array2) {// static �Լ��� static �Լ��� �ҷ� �� �� ����!
		if (array1 == null || array2 == null) {
			return false; // return���� ����ϸ� ���� break���� ������� �ʾƵ� �Լ��� �����
		}
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
}
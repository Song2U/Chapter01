package Chapter01;

//(7/5) 11 동일한 배열인지 확인하는 프로그램
public class ArrayEquals {

	public static void main(String[] args) {
		int[] a1 = { 100, 200, 300 };
		int[] a2 = { 100, 200, 300 };

		boolean result = equals(a1, a2);
		System.out.println(result);
	}

	public static boolean equals(int[] array1, int[] array2) {// static 함수는 static 함수만 불러 쓸 수 있음!
		if (array1 == null || array2 == null) {
			return false; // return문을 사용하면 굳이 break문을 사용하지 않아도 함수가 종료됨
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
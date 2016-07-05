package Chapter01;

//(7/5) 5. 중첩 while문 실습문제 - 구구단 작성
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
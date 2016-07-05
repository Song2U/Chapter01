package Chapter01;

//(7/5) 8. 이중For문 구구단 (보기 좋은 모양으로)
public class Gugudan {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + " = " + (j * i) + " ");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
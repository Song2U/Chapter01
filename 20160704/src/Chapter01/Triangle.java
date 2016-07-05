package Chapter01;

//(7/5) 7. 이중For문 과제 (*로 삼각형 그리기)
public class Triangle {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
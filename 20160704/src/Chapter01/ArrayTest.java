package Chapter01;

//(7/5) 9. �迭
public class ArrayTest {

	public static void main(String[] args) {
		char[] c; // -> char c[]; �ε� �� �� ����
		c = new char[3]; // ���� �� �������־�� ��� ����
		c[0] = 'S';
		c[1] = 'K';
		c[2] = 'U';
		// c[3] = 'N'; -> ������ ũ�⸦ �Ѿ�� ���� ���� �߻�

		int[] scores = { 100, 90, 20, 30, 40 };

		/*
		 * int[] scores2; scores2 = { 100, 90, 20, 30, 40 };
		 */ // -> �迭�� �ʱ�ȭ�� ����� ���ÿ� ���� ��!

		System.out.println(scores.length); // �迭�� ���� ��
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		/*Ȯ��  For��*/
		int sum2=0;
		for(int score:scores){
			sum2+=score;
		}
		System.out.println(sum + ", " + sum2);	//�׳� �ݷ�(:) �ڿ� �ִ¹迭�� ���������� loop
												//�Ϲ� ������ �ٸ� ���� �ε��� ������ �ʿ� ����, ������ �ε����� 1�� ���� �Ѵٴ� ���Դϴ�.
	}
}
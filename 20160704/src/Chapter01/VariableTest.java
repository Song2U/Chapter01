package Chapter01;
// 02. ���� & ���
public class VariableTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2;	// ������ �ʱ�ȭ������ ������ �ʱ� ���� �����Ⱚ�� �Ҵ� ��
		boolean b = true;
		
		num2 = 20;
		
		System.out.println(num1 + ", " + num2);
		System.out.println(num1 + " x " + num2 + " = " + num1*num2 + " " + b);
		
		/* ����  */
		//float f = 3.14; -> ���� ���� ���� : �����Ϸ��� 3.14��  Double ���·� �ν��ؼ� �̸���...
		float f = 3.14f; // ���� �ڿ� f�� �ٿ��� float���� ���� �����Ϸ����� �˷���
		double d = 3.14;
		
		/* ��� : �빮�ڷ� ǥ���� �ִ°� ���� (������ �����ϱ� ����) */
		final double PI = 3.14;	//���� ���� �տ� final�� ���� : ���Ⱑ pi��� ������ �� ������ ������ �����̴�. -> �� ���ķ� pi�� �� ��ȭ �Ұ��� (��� ����)
		double area = 3*3*PI;
	}
}

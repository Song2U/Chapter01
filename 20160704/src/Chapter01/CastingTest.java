package Chapter01;
// 03. �ڷ��� ��ȯ
public class CastingTest {
	
	public static void main(String args[]){
		int i = 100;
		long l = i;	//4����Ʈ�� 8����Ʈ�� ��ȯ
				
		System.out.println(l);
		
		// long l2 = 200;
		// int j = l2;
		// ���� ���� ���� : �����Ϸ��� ���� ����(�߸�)����� �ִٴ� ���� ����ڿ��� �˷���
		// ������ �ȳ����� �Ϸ��� �Ƚ��ص� �ȴٰ� ��������� �����Ϸ����� �˷������
		
		long l2 = 200;
		int j = (int)l2;
	}
}
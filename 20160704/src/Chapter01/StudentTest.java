package Chapter01;
// 05. Student ��ü �ǽ�
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student me = new Student();
		System.out.println(me);	// ���� �� ���
		
		me.name = "�����";
		me.grade = 4;
		me.address = "��⵵ �Ⱦ�� ���ȱ�";
		me.isEnrolld = true;
		me.juminNo = "930713";
		
		System.out.println(me.name + ", " + me.age + ", " + me.isEnrolld);	// ���ǰ� �� �� ���� �⺻ ��(null Ȥ�� 0)�� ��µ�
	}
}
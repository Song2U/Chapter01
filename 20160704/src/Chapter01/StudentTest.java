package Chapter01;
// 05. Student 객체 실습
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student me = new Student();
		System.out.println(me);	// 참조 값 출력
		
		me.name = "양송이";
		me.grade = 4;
		me.address = "경기도 안양시 동안구";
		me.isEnrolld = true;
		me.juminNo = "930713";
		
		System.out.println(me.name + ", " + me.age + ", " + me.isEnrolld);	// 정의가 안 된 것은 기본 값(null 혹은 0)이 출력됨
	}
}
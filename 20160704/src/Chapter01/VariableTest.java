package Chapter01;
// 02. 변수 & 상수
public class VariableTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2;	// 변수를 초기화해주지 않으면 초기 값에 쓰레기값이 할당 됨
		boolean b = true;
		
		num2 = 20;
		
		System.out.println(num1 + ", " + num2);
		System.out.println(num1 + " x " + num2 + " = " + num1*num2 + " " + b);
		
		/* 변수  */
		//float f = 3.14; -> 오류 나는 이유 : 컴파일러가 3.14를  Double 형태로 인식해서 겁먹음...
		float f = 3.14f; // 정수 뒤에 f를 붙여서 float형인 것을 컴파일러에게 알려줌
		double d = 3.14;
		
		/* 상수 : 대문자로 표시해 주는게 관례 (변수와 구분하기 위함) */
		final double PI = 3.14;	//변수 선언 앞에 final을 붙임 : 여기가 pi라는 변수의 값 대입의 마지막 지점이다. -> 이 이후로 pi의 값 변화 불가능 (상수 지정)
		double area = 3*3*PI;
	}
}

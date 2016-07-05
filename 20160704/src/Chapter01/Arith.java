package Chapter01;

//08. 산술 연산자 실습
public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;

		System.out.println(a + b); // 덧셈
		System.out.println(a - b); // 뺄셈
		System.out.println(a * b); // 곱셈
		System.out.println(a / b); // 나눗셈
		System.out.println(a % b); // 나머지값
		System.out.println(-a);
		System.out.println(++a);
		/*
		 * ++a -> a = a+1 or a+=1 or a++과 같은 뜻
		 * cf. --a -> a-=1, a = a-1, a--와 같은 뜻
		 * 연산자의 위치가 전위일때와 후위일 때의 차이
		 * 전위 : 먼저 연산을 실행한 후 구문 실행 후위 : 구문 실행 후 연산
		 */

		System.out.println(--b); // 2
		System.out.println(b--); // 2
		System.out.println(b); // 1
		
		System.out.println(10 / 3); // Integer끼리 연산하면 Integer
		System.out.println(10.0 / 3);// Integer와 Double 연산하면 Double
		System.out.println(10 / (double) 3);// 3은 내부적으로 double로 자동 형변환됨
		System.out.println((double) (10 / 3)); // (10/3) 전체가 내부적으로 double로 자동 형변환됨
		
		System.out.println(-7 % 3);
		System.out.println(7 % -3);
		/*
		 * 주로 정수(int) 값을 대상으로 하여 결과도 정수임 나누어지는 수에서 가장 가깝게 몫을 구한 후 나머지를 계산 나머지 값이
		 * 양수, 음수 모두 가능 수학의 나머지 정의(n÷d=q∙∙∙r	-> r은 0<r<d 인 자연수)와는 다름
		 * 
		 */
	}
}
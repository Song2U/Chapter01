package Chapter01;
//06. 실행결과 확인 후 오류 수정
public class TypeCast01 {
	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;

		byte b1 = (byte)256;	// 명시적으로 형변환 해주어야함

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);
	}
}
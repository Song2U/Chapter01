package Chapter01;

//07. 컴파일 후 오류 수정
class TypeCast02 {
	public static void main(String args[]) {
		byte b;
		int i = 414;
		float f = 123.456f; // 명시적으로 float라고 알려주기

		b = (byte) i;
		System.out.println("int 414를 byte로 변환 : " + b);
		i = (int) f;
		System.out.println("float 123.456을 int로 변환: " + i);
		b = (byte) f;
		System.out.println(" float 123.456을 byte로 변환: " + b);
	}
}
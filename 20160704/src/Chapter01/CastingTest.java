package Chapter01;
// 03. 자료형 변환
public class CastingTest {
	
	public static void main(String args[]){
		int i = 100;
		long l = i;	//4바이트를 8바이트로 변환
				
		System.out.println(l);
		
		// long l2 = 200;
		// int j = l2;
		// 오류 나는 이유 : 컴파일러가 값이 깨질(잘릴)우려가 있다는 것을 사용자에게 알려줌
		// 오류가 안나도록 하려면 안심해도 된다고 명시적으로 컴파일러에게 알려줘야함
		
		long l2 = 200;
		int j = (int)l2;
	}
}
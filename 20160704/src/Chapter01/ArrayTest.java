package Chapter01;

//(7/5) 9. 배열
public class ArrayTest {

	public static void main(String[] args) {
		char[] c; // -> char c[]; 로도 쓸 수 있음
		c = new char[3]; // 선언 후 생성해주어야 사용 가능
		c[0] = 'S';
		c[1] = 'K';
		c[2] = 'U';
		// c[3] = 'N'; -> 지정된 크기를 넘어서는 값은 오류 발생

		int[] scores = { 100, 90, 20, 30, 40 };

		/*
		 * int[] scores2; scores2 = { 100, 90, 20, 30, 40 };
		 */ // -> 배열의 초기화는 선언과 동시에 해줄 것!

		System.out.println(scores.length); // 배열의 길이 값
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		/*확장  For문*/
		int sum2=0;
		for(int score:scores){
			sum2+=score;
		}
		System.out.println(sum + ", " + sum2);	//그냥 콜론(:) 뒤에 있는배열을 순차적으로 loop
												//일반 포문과 다른 점은 인덱스 변수가 필요 없고, 무조건 인덱스는 1씩 증가 한다는 것입니다.
	}
}
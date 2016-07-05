package Chapter01;

//(7/5) 11 Argument의 값을 integer로 형변환 후 연산?
public class Add {

	public static void main(String[] args) {
		int sum = 0;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			System.out.println(value);
			sum += value;
		}
		System.out.println(sum);
	}
}
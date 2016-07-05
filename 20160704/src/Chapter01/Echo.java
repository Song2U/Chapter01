package Chapter01;
//(7/5) 10. arg변수 이용
public class Echo {

	public static void main(String[] args) {
		System.out.println(args.length);
		for(String arg : args){
			System.out.println(arg);
		}
	}
}
package Chapter01;

//11.swap
public class Swap {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		if (n1 > n2) {
			System.out.println("최대값은 " + n1 + "입니다.");
		} else {
			int temp = n1;
			n1 = n2;
			n2 = temp;
			System.out.println("최대값은 " + n1 + "입니다.");
		}

		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println();

		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		if (a1 >= a2) {
			if (a2 >= a3) {
				System.out.println("최대값 : a1");
				System.out.println(a1 + ">" + a2 + ">" + a3);
			} else if (a3 >= a1) {
				System.out.println("최대값 : a3");
				System.out.println(a3 + ">" + a1 + ">" + a2);
			} else {
				System.out.println("최대값 : a1");
				System.out.println(a1 + ">" + a3 + ">" + a2);
			}
		} else if (a1 >= a3) {
			System.out.println("최대값 : a2");
			System.out.println(a2 + ">" + a1 + ">" + a3);
		} else {
			System.out.println("최대값 : a2");
			System.out.println(a2 + ">" + a3 + ">" + a1);
		}
	}
}
/*
 * 모범 답안 
 * if a1>=a2 if a1>=a3 최대값은 a1 else 최대값은 a3 
 * else if(a2>=a3) 최대값은 a1 else 최대값은 a3
 */
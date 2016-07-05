package Chapter01;

//10. ¿±≥‚ ∞ËªÍ ≈Î«— ¡∂∞«πÆ Ω«Ω¿
public class LeapYear {

	public static void main(String[] args) {
		int year = 2015;
		if (year % 4 != 0) {
			System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
		} else if (year % 100 != 0) {
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ.");
		} else if (year % 400 == 0) {
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ.");
		} else {
			System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
		}
	}
}
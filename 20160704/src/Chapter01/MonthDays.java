package Chapter01;
//12. 달마다의 날짜수 조건문으로 출력
public class MonthDays {

	public static void main(String[] args) {
		int month = 11;
		int days = 0;

		if (month == 1) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month == 3) {
			days = 31;
		} else if (month == 4) {
			days = 30;
		} else if (month == 5) {
			days = 31;
		} else if (month == 6) {
			days = 30;
		} else if (month == 7) {
			days = 31;
		} else if (month == 8) {
			days = 31;
		} else if (month == 9) {
			days = 30;
		} else if (month == 10) {
			days = 31;
		} else if (month == 11) {
			days = 30;
		} else if (month == 12) {
			days = 31;
		} else {
			System.out.println("12 이내의 숫자가 아닙니다.");
		}
		System.out.println(month + "월의 날짜 수는 " + days + "일 입니다.");
	}
}
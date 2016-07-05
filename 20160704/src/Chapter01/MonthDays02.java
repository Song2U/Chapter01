package Chapter01;
//14. if문 조건 안에 or를 넣어 중복 코드 제거
public class MonthDays02 {

	public static void main(String[] args) {
		int month = 11;
		int days = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month == 4 || month == 6) {
			days = 30;
		} else {
			System.out.println("12 이내의 숫자가 아닙니다.");
		}
		System.out.println(month + "월의 날짜 수는 " + days + "일 입니다.");
	}
}
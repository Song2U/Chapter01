package Chapter01;
//15. switch-case 조건의 결과값이 동일한 경우 break문을 걸지 않고 일부러 다음으로 넘김
public class MonthDaysSwtich02 {

	public static void main(String[] args) {
		int month = 15;
		int days = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			System.out.println(month + "월의 날짜 수는 " + days + "일 입니다.");
			break;

		case 2:
			days = 28;
			System.out.println(month + "월의 날짜 수는 " + days + "일 입니다.");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			System.out.println(month + "월의 날짜 수는 " + days + "일 입니다.");
			break;

		default:
			System.out.println("12 이내의 숫자를 입력해주세요.");
		}
		
	}
}
package Chapter01;

//13. switch-case 문으로 달마다의 날짜수 출력
public class MonthDaysSwitch {

	public static void main(String[] args) {
		int month = 5;
		int days = 0;

		switch (month) {
		case 1:
			days = 31;
			break; // break문을 사용하지 않을 경우 아래 케이스로 넘어가버린다.
		case 2:
			days = 28;
			break;
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 9:
			days = 30;
			break;
		case 10:
			days = 31;
			break;
		case 11:
			days = 30;
			break;
		case 12:
			days = 31;
			break;
		default:
			System.out.println("12 이내의 숫자를 입력해주세요.");
		}
		System.out.println(month + "월의 날짜 수는 " + days + "일 입니다.");
	}
}
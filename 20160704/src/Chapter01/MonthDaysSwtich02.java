package Chapter01;
//15. switch-case ������ ������� ������ ��� break���� ���� �ʰ� �Ϻη� �������� �ѱ�
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
			System.out.println(month + "���� ��¥ ���� " + days + "�� �Դϴ�.");
			break;

		case 2:
			days = 28;
			System.out.println(month + "���� ��¥ ���� " + days + "�� �Դϴ�.");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			System.out.println(month + "���� ��¥ ���� " + days + "�� �Դϴ�.");
			break;

		default:
			System.out.println("12 �̳��� ���ڸ� �Է����ּ���.");
		}
		
	}
}
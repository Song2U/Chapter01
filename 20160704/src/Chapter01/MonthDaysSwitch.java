package Chapter01;

//13. switch-case ������ �޸����� ��¥�� ���
public class MonthDaysSwitch {

	public static void main(String[] args) {
		int month = 5;
		int days = 0;

		switch (month) {
		case 1:
			days = 31;
			break; // break���� ������� ���� ��� �Ʒ� ���̽��� �Ѿ������.
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
			System.out.println("12 �̳��� ���ڸ� �Է����ּ���.");
		}
		System.out.println(month + "���� ��¥ ���� " + days + "�� �Դϴ�.");
	}
}
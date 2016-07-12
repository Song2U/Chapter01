package kr.ac.sungkyul.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color){	//�θ� �⺻ �����ڰ� ������ �θ��� �����ڿ� �°� ������־����
		super(x,y);
		//setX(x); 
		//setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override // Annotation(������ �߿����������� ���������� �ſ� �߿���)
				// - Ŭ����, �޼���, ����, �ʵ�, �Լ� ���� �Ķ���� �� ���� �� ���� �� ����... (�����Ϸ��� �ٸ�
				// ���α׷� � ������ �ִ� �±�)
				// ����� �ʿ���� ���� �ٰԵǸ� ���� �߻�
	public void show() { // �θ��� �޼��� ������
		// super.show(); //this : �ڱ� �ڽ��� ����, super : �θ��� ����
		// System.out.println("[x = " + x + ", y = " + y + "]�� ���� �׷Ƚ��ϴ�.");
		// //�θ��� private �������� x,y�� ���� �Ұ�(�׷��� �θ��� ������ ��ġ�� ���� �ٶ��� ���� ����)
		System.out.println("[x = " + getX() + ", y = " + getY() + ", color = " + color + " ]�� ���� �׷Ƚ��ϴ�."); // �޼���� public�̹Ƿ� ���� ����
	}
}
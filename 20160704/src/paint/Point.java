package paint;

public class Point {
	private int x;
	private int y;

	public void show() {
		System.out.println("[x = " + x + ", y = " + y + "에 원을 그렸습니다.");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point(100,200);
		//point1.setX(100);
		//point1.setY(200);
		point1.show();

		Point point2 = new Point(10,20);
		//point2.setX(100);
		//point2.setY(200);
		point2.show(false);

		ColorPoint point3 = new ColorPoint(100, 200, "Red");
		//point3.setX(77);
		//point3.setY(200);
		//((ColorPoint) point3).setColor("Red"); // �θ�� �ڽ��� �޼��带 �̿� ����
		//drawPoint(point1);
		//drawPoint(point2);
		//drawPoint(point3);

		draw(point1);
		draw(point2);
		draw(point3);
		
		draw(new Rectangle());
		draw(new Triangle());
		draw(new Circle());
		draw(new Pentagon());
		
		/*drawShape(new Rectangle());
		drawShape(new Triangle());
		drawShape(new Circle());*/
		//drawShape(new Shape());	// �߻�ȭ�� �Ǿ� �Լ� ��ü�� ���� ������ �����߻�
		
		point3.show(); // color ��� ���� ���� (�θ𿡴� Color�� ���ǵǾ����� �ʱ⶧��) -> �ڽĿ� Show
						// �޼��� ������(Override)
		point3.show(true);
	}

	public static void drawPoint(Point point) {
		point.show();
	}
	
/*	public static void drawRectangle(Rectangle rect){
		
	}
	public static void drawTriangle(Triangle triangle){
		
	}
	public static void drawCircle(Circle circle){
		
	}*/
	
/*	public static void drawShape(Shape shape) {
		shape.draw();
	}*/
	
	public static void draw(Drawable drawable){
		drawable.draw();
		
	}
}
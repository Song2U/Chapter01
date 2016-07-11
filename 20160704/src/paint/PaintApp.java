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
		//((ColorPoint) point3).setColor("Red"); // 부모는 자식의 메서드를 이용 가능
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
		//drawShape(new Shape());	// 추상화가 되어 함수 자체가 없기 때문에 오류발생
		
		point3.show(); // color 출력 되지 않음 (부모에는 Color가 정의되어있지 않기때문) -> 자식에 Show
						// 메서드 재정의(Override)
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
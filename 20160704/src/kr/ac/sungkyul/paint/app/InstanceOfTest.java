package kr.ac.sungkyul.paint.app;

import i.Drawable;
import kr.ac.sungkyul.paint.point.ColorPoint;
import kr.ac.sungkyul.paint.point.Point;

/*import kr.ac.sungkyul.paint.shape.Circle;
import kr.ac.sungkyul.paint.shape.Rectangle;
import kr.ac.sungkyul.paint.shape.Shape;*/

import kr.ac.sungkyul.paint.shape.*;

public class InstanceOfTest {

	public static void main(String[] args) {
		// Circle c = new Circle();
		// System.out.println(c instanceof Rectangle);
		Shape s = new Circle();
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rectangle);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Drawable);

		System.out.println("====");

		Point p = new ColorPoint(50, 100, "yellow");
		System.out.println(p instanceof ColorPoint);
		System.out.println(p instanceof Point);
		System.out.println(p instanceof Drawable);

		System.out.println("====");

		System.out.println(p instanceof ColorPoint);
	}
}
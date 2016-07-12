package kr.ac.sungkyul.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color){	//부모에 기본 생성자가 없으면 부모의 생성자에 맞게 명시해주어야함
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

	@Override // Annotation(지금은 중요하지않지만 스프링에서 매우 중요함)
				// - 클래스, 메서드, 변수, 필드, 함수 안의 파라미터 등 거의 다 붙을 수 있음... (컴파일러나 다른
				// 프로그램 등에 정보를 주는 태그)
				// 사용이 필요없는 곳에 붙게되면 오류 발생
	public void show() { // 부모의 메서드 재정의
		// super.show(); //this : 자기 자신의 정보, super : 부모의 정보
		// System.out.println("[x = " + x + ", y = " + y + "]에 원을 그렸습니다.");
		// //부모의 private 변수여서 x,y에 접근 불가(그러나 부모의 내용을 고치는 것은 바람직 하지 못함)
		System.out.println("[x = " + getX() + ", y = " + getY() + ", color = " + color + " ]에 원을 그렸습니다."); // 메서드는 public이므로 접근 가능
	}
}
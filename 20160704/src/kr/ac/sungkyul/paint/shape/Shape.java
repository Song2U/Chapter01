package kr.ac.sungkyul.paint.shape;

public abstract class Shape { // 자바 현실세계(메모리 상)에 존재하지 않게 함 - 인스턴스화 시키면 안되기 때문에 (new로 생성 불가)
	//추상 클래스가 정의 된 경우 : 인스턴스가 존재하지 않고, 자식 메소드 들에게 다 맡겨야 할 경우

	private String lineColor;
	private String fillColor;

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	//public abstract void draw(); // 추상 메소드 (개념적인 메소드) - 실제 개발은 안 됨
	//추상화 하는 이유 : 확장성 증대를 위해서
}
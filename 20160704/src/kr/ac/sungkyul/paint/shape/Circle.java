package kr.ac.sungkyul.paint.shape;

import i.Drawable;

public class Circle extends Shape implements Drawable{
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
}

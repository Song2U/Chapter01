package kr.ac.sungkyul.paint.shape;

public abstract class Shape { // �ڹ� ���Ǽ���(�޸� ��)�� �������� �ʰ� �� - �ν��Ͻ�ȭ ��Ű�� �ȵǱ� ������ (new�� ���� �Ұ�)
	//�߻� Ŭ������ ���� �� ��� : �ν��Ͻ��� �������� �ʰ�, �ڽ� �޼ҵ� �鿡�� �� �ðܾ� �� ���

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

	//public abstract void draw(); // �߻� �޼ҵ� (�������� �޼ҵ�) - ���� ������ �� ��
	//�߻�ȭ �ϴ� ���� : Ȯ�强 ���븦 ���ؼ�
}
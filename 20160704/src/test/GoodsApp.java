package test;

import Chapter02.Goods;

// 7/7 3. ��Ű��
public class GoodsApp {// �ٸ� ��Ű�� ���̿����� ���� Ŭ���� ���� ����

	public static void main(String[] args) {
		Goods goods = new Goods(); // �������� : ��Ű�� ���� Goods��� Ŭ������ ���� ���� (import ���ָ� ��)
		goods.name = 'nikon'; //���� ���� : Default�� ���� �Ұ�(���� ��Ű�� �������� ���� ����)
		goods.price="40000";//���� ���� : protected�� ���� ��Ű�� ���� �־�� ���� ����
	}
}
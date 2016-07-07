package test;

import Chapter02.Goods;

// 7/7 3. 패키지
public class GoodsApp {// 다른 패키지 사이에서는 같은 클래스 존재 가능

	public static void main(String[] args) {
		Goods goods = new Goods(); // 오류이유 : 패키지 내에 Goods라는 클래스가 없기 때문 (import 헤주면 됨)
		goods.name = 'nikon'; //오류 이유 : Default는 접근 불가(같은 패키지 내에서만 접근 가능)
		goods.price="40000";//오류 이유 : protected는 같은 패키지 내에 있어야 접근 가능
	}
}
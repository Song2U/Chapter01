package test;

import Chapter02.Goods;

public class BookGoods extends Goods{	//Goods 상속

		void test(){
			price = 2000;
			countStock = 10;	//Default 값이어서 상속 안 됨(같은 패키지가 아님)
		}
}

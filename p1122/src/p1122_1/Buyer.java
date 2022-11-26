package p1122_1;

import java.util.ArrayList;



public class Buyer extends Member{
	int money;
	int bonus;
	ArrayList <Product>list=new ArrayList<Product>(); // 구입목록 
	
	Buyer(){
		this.money=1000;
		this.bonus=0;
	}
	
	
	Buyer(String id, int money,int bonus){
		this.id=id;
		this.money=money;
		this.bonus=bonus;
	}
	
	//구매 매소드
	void buy(Product p) {
		
			if(money<p.price) {
				System.out.println("보유 금액이 부족합니다. 충전 후 다시 이용해 주세요");
				return;
			}
			
			money-=p.price;
			bonus+=p.bonus;
			list.add(p);

	}

}

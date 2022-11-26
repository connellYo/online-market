package p1122_1;

public class buy {
	
	buy() {}
	
	Member Buy(Product p,Member m) {
		
		if(m.money < p.price) { //잔액을 비교해서 물건을 구매하지 못하도록 함.
			System.out.println("잔액이 부족합니다. 금액을 충전하세요.!!");
			return m;
		}
		
		m.money = m.money - p.price;
		m.bonus= m.bonus + p.bonus;
		m.list.add(p);
		
		return m;
	}


}

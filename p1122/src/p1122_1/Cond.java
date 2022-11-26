package p1122_1;

public class Cond extends Product {
	
	Cond() {
		this("무풍 에어콘",120,10);
		}
	
	Cond(String productName, int price, int bonus){
		this.productName=productName;
		this.price=price;
		this.bonus=bonus;
	}

}

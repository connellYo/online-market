package p1122_1;

public class Ref extends Product{
	
	Ref() {
		this("bespoke 냉장고",150,15);
		}
	
	Ref(String productName, int price, int bonus){
		this.productName=productName;
		this.price=price;
		this.bonus=bonus;
	}

}

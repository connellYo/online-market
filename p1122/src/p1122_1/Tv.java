package p1122_1;

public class Tv extends Product{
	Tv() {
		this("그랑데 세탁기",90,9);
		}
	
	Tv(String productName, int price, int bonus){
		this.productName=productName;
		this.price=price;
		this.bonus=bonus;
	}
	

}

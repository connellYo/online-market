package p1122_1;

public class WM extends Product {
	WM() {
		this("그랑데 세탁기",90,9);
		}
	
	WM(String productName, int price, int bonus){
		this.productName=productName;
		this.price=price;
		this.bonus=bonus;
	}

}

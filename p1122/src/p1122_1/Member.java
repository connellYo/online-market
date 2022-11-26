package p1122_1;

import java.util.ArrayList;

public class Member {
	String name;
	public String id;
	public String pw;
	int bonus;
	int money=0;

	ArrayList <Product>list=new ArrayList<Product>(); // 구입목록 
	
	Member(){}
	
	
	Member(String id, String pw){
		this.id=id;
		this.pw=pw;
		this.bonus=1000; // 가입 축하 보너스 금액 1000원
	}
	
	
}

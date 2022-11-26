package p1122_1;

import java.util.ArrayList;
import java.util.Scanner;

import p1122_1.Member;



public class LOG_IN {
	Scanner scan=new Scanner(System.in);
	
	public LOG_IN(){}
	
	public Member log_in(ArrayList<Member> list_member) {
	int i=0;
	String id;
	String pw;
	int list_index=0;
	
	while(i<1) {
	System.out.println(" ID를 입력해주세요");
		id=scan.next();
	System.out.println(" pw를 입력해주세요");
		pw=scan.next();
		
		for(int j=0;j<list_member.size();j++) {
			if(id.equals(list_member.get(j).id)) {
				if(pw.equals(list_member.get(j).pw)){
								System.out.println("로그인 성공!");
								list_index=j;
								i++;
								break;
				}
				}
		}
		
		if(i==0) {
			System.out.println("아이디와 비밀번호가 틀리셨습니다. 다시 입력해주세요");
		}
		
	}//while
	
		return list_member.get(list_index);
	
		
	
		////	
	}//log_in

	
	
	
	
	
	
	
	
	
	
	
	
///////////////
}//class

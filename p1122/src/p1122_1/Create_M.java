package p1122_1;

import java.util.ArrayList;
import java.util.Scanner;



public class Create_M {
	
	ArrayList <Member>list_member=new ArrayList<Member>();
	Scanner scan=new Scanner(System.in);
	
	Create_M(){}
	
	void Make_Account(ArrayList<Member> list_member) {
		
		int choice;
		String id="";
		String pw = "";
				
				System.out.println(" <<<< 회원 가입 >>>>");
				System.out.println(" 1. 회원 가입 진행 ");
				System.out.println(" 2. 나가기 ");
				System.out.println("---------------------");
				System.out.println("원하시는 번호를 선택해 주세요.>>");
				choice = scan.nextInt();
				
				
				switch(choice) {
				case 1:
					
					int checkNo_id=0; // id 생성 체크
					int checkNo_pw=0; // pw 생성 체크
					String check_pw=""; // pw 재확인 용도
					
					// 첫번째 고객 
					if(list_member.size()==0) {
						System.out.println("아이디를 입력해주세요");
						id=scan.next();
						
						
						
						while(checkNo_pw<1) { // 비빌번호 생성
						System.out.println("비밀번호를 입력해주세요>>>>");
						pw=scan.next();
						
						
						if(pw.length()<8||pw.length()>16) {
							System.out.println("8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
						} else {System.out.println("비밀번호 입력이 완료되었습니다."); checkNo_pw=1;}
						
						}
						
						while(checkNo_pw<2) {//비밀번호 재확인 
							
							System.out.println("비밀번호를 재확인하겠습니다.");
							System.out.println("비밀번호를 다시 한번 입력해주세요>>>>");
							check_pw=scan.next();
							if(check_pw.equals(pw)) {
								System.out.println("비밀번호가 일치했습니다. 비밀번호 생성이 완료되었습니다.");
								checkNo_pw=2;
							}else {System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");}
							
						}//비밀번호 재확인 
						
						list_member.add(new Member(id, pw));
					}else {//2명 이상
						
						while(checkNo_id<1) {
							checkNo_id=1;	
							System.out.println("아이디를 입력해주세요");
							id=scan.next();
							for(int i=0;i<list_member.size();i++) {
							if(id.equals(list_member.get(i).id)) {
								System.out.println("중복된 아이디가 있습니다. 다른 아이디를 입력해주세요");
								checkNo_id=0;
							}
							}
						}//id check and 생성 
						while(checkNo_pw<1) { // 비빌번호 생성
							System.out.println("비밀번호를 입력해주세요>>>>");
							pw=scan.next();
							
							
							if(pw.length()<8||pw.length()>16) {
								System.out.println("8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
							} else {System.out.println("비밀번호 입력이 완료되었습니다."); checkNo_pw=1;}
							
							}
							
							while(checkNo_pw<2) {//비밀번호 재확인 
								
								System.out.println("비밀번호를 재확인하겠습니다.");
								System.out.println("비밀번호를 다시 한번 입력해주세요>>>>");
								check_pw=scan.next();
								if(check_pw.equals(pw)) {
									System.out.println("비밀번호가 일치했습니다. 비밀번호 생성이 완료되었습니다.");
									checkNo_pw=2;
								}else {System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");}
								
							}//비밀번호 재확인 
							
							list_member.add(new Member(id, pw));
						
					}// 2명이상 고객
					
					break;
					
				case 2:
					System.out.println("회원 가입 화면에서 나가겠습니다.");
					return;
				
				case 3:
				
					for(int i=0;i<list_member.size();i++) {
						System.out.println("아이디:"+list_member.get(i).id+"\t비밀번호:"+list_member.get(i).pw);
					}
					System.out.println("---------------------");
				}//switch
					
//////////////					
			}//make_account
	
	
	
	
	
	
/////
}//class

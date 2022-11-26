package p1122_1;

import java.util.ArrayList;
import java.util.Scanner;



public class Samsung {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice=0;
		Create_M ac=new Create_M();
		LOG_IN log=new LOG_IN();
		ArrayList <Member>list_member=new ArrayList<Member>();
		Member m=new Member();
		buy b=new buy();
		
		loop:
		while(true) {// 첫 화면 부터 시작 
		System.out.println("[[삼성프라자 마일리지 온라인 매장 메인화면 ]]");
		System.out.println("1.로그인 ");
		System.out.println("2.회원가입 ");
		System.out.println("3.나가기 ");
		System.out.println("---------------------");
		System.out.println("원하시는 번호를 선택해 주세요.>>");
		choice = scan.nextInt();
		
		loop2:
		switch(choice){
			
		case 1:
				m=log.log_in(list_member);
				System.out.printf("%s님이 로그인하셨습니다.!!\n",m.id);
				break loop2;
		
		
		case 2:
				ac.Make_Account(list_member);
				break;
		
		case 3: System.out.println("온라인 매장을 나가겠습니다.");
				break loop;
		}
		
		
	
		if(choice==1) {
			loop3:
			while(true) {// 첫 화면 부터 시작 
				
				
				System.out.println("[[!!!!! 특급 세일 !!!!!!!!!!!!]]");
				System.out.println("1. 75인치 smartTV"); //100,10
				System.out.println("2. bespoke 냉장고");  //ref 150,15
				System.out.println("3. 그랑데 세탁기");     //wash 90,9
				System.out.println("4. 무풍 에어콘");      // cond 120,12
				System.out.println("5. 보너스포인트 전환");      
				System.out.println("7. 금액충전");
				System.out.println("8. 구매 상품리스트");
				System.out.println("9. 현재 보유금액 및 보너스포인트");
				System.out.println("0. 로그아웃");
				System.out.println("---------------------");
				System.out.println("구매하고 싶은 물건을 선택하세요.>>");
				choice = scan.nextInt();
			
				switch(choice) {
				
				case 1:
					b.Buy(new Tv(),m);
					System.out.println("75인치 smartTV 1대가 구매되었습니다.");
					break;
				case 2:
					b.Buy(new Ref(),m); //1대구매
					System.out.println("bespoke 냉장고 1대가 구매되었습니다.");
					break;
				case 3:
					b.Buy(new WM(),m); //1대구매
					System.out.println("그랑데 세탁기 1대가 구매되었습니다.");
					break;
				case 4:
					b.Buy(new Cond(),m); //1대구매
					System.out.println("무풍 에어콘 1대가 구매되었습니다.");
					break;
					
				case 5:
					System.out.println("50만원 이상부터 전환가능합니다.");
					System.out.println("현재 포인트 : "+m.bonus);
					System.out.println("변경할 포인트를 입력하세요.>>");
					choice = scan.nextInt();
					if(m.bonus<choice) {
						System.out.println("입력한 포인트가 더 많습니다. 다시 한번 확인해주세요.!!");
						break;
					}
					
					m.bonus = m.bonus - choice;
					m.money = m.money + choice;
					System.out.println("전환이 완료되었습니다.!!");
					
				case 7:
					System.out.println("충전금액을 입력하세요.>>");
					choice = scan.nextInt();
					m.money = m.money + choice;
					System.out.println("충전금액 : "+choice);
					System.out.println("현재보유금액 : "+m.money);
					
					break;
					
				case 8:
					System.out.println("[ 구매상품 리스트 ]");
					System.out.println("총 구매상품 개수 : "+m.list.size());
					System.out.printf("구매상품리스트 : ");
					for(int i=0;i<m.list.size();i++) {
						System.out.printf("%s, ",m.list.get(i).productName);
					}
					System.out.println();
					
					break;
					
				case 9:
					System.out.println("보유금액 : "+m.money);
					System.out.println("보너스포인트 : "+m.bonus);
					break;
					
				case 10:
					System.out.println("로그아웃 하겠습니다.");
					break loop3;
				
				}//switch
				
			
				
				
				
				
				
			 ////////
			}//while
			
			///////
		}//if
	
	
		
	/////////////////////////
		}//1번 while
////////////////////	
	}//main

}


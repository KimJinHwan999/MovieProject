package Main;

import java.util.Scanner;

public class MenuManager {
	Work work;
	// work 클래스를 MenuManager 클래스에 전역으로 선언하여
	// 어디서도 work 클래스에 접근할 수 있도록 합니다.
	
	MenuManager() {
		this.work = new Work();
		// work 클래스를 한번 초기화 해줍니다.
	}
	
  void Run()
	{
		int cursor = 0;
    		// 계속해서 선택지를 보여줄 수 있도록 합니다.
    
		while(cursor == 0)
		{
			if(work.userState) {
        		// 유저의 로그인 상태를 확인하여 선택지를 다르게 보여줍니다.
        
				cursor = menuShowLogin();
			} else {
				cursor = menuShow();	
			}
		}
	}
	
	int menuShow() {
		Scanner scan = new Scanner(System.in); 
    		// 문자 입력을 인자로 Scanner 생성
		
		System.out.println("안녕하세요.\n선택해주세요.");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		
		byte message = 0;
		message = scan.nextByte();             
    		// 키보드 문자 입력
		
		switch(message) {
			case 1 :
				menuLogin();
				return 0;
				// 로그인을 선택합니다.
        
			case 2 :
				menuRegister();
				return 0;		
				// 회원가입을 선택합니다.
        
			default :
				System.out.println("잘못입력했습니다.");
				return 0;
				// 1 or 2 이외 값을 입력했을 경우 출력
        
		}
	}
	// 처음 화면에 나타나는 안내창
	
	int menuShowLogin() {
		Scanner scan = new Scanner(System.in); 
    		// 문자 입력을 인자로 Scanner 생성
		
		System.out.println("안녕하세요.\n선택해주세요.");
		System.out.println("1. 로그아웃");
		System.out.println("2. 회원탈퇴");
		
		byte message = 0;
		message = scan.nextByte();             
    		// 키보드 문자 입력
		
		switch(message) {
			case 1 :
				menuLogout();
				return 0;
				// 로그아웃
        
			case 2 :
				menuWithDraw();
				return 0;		
				// 회원탈퇴
        
			default :
				System.out.println("잘못입력했습니다.");
				return 0;
				// 1 or 2 이외 값을 입력했을 경우 출력
        
		}
	}
	// 로그인 상태일경우 안내창
	
	String menuInputId() {
		Scanner scan = new Scanner(System.in); 
   		// 문자 입력을 인자로 Scanner 생성
		String id = new String(); 
		// 문자 입력을 인자로 Scanner 생성
		id = scan.nextLine();    
		
		// 사용자의 입력정보를 받습니다.
		return id;
	}
	// 회원정보 ID 입력 함수
	
	String menuInputPw() {
		Scanner scan = new Scanner(System.in); 
    		// 문자 입력을 인자로 Scanner 생성
		String pw = new String(); 
		// 문자 입력을 인자로 Scanner 생성
		pw = scan.nextLine();
		
		// 사용자의 입력정보를 받습니다.
		return pw;
	}
	// 회원정보 PW 입력 함수
	
	void menuLogin() {
		System.out.println("로그인 입니다.");
		String id = menuInputId();
		String pw = menuInputPw();
		
		work.login(id, pw);
	}
	// 로그인 안내창
	
	void menuRegister() {
		System.out.println("회원가입 입니다.");
		String id = menuInputId();
		String pw = menuInputPw();

		work.register(id, pw);
	}
	// 회원가입 안내창
	
	void menuLogout() {
		work.userCheck();
		System.out.println("로그아웃 입니다.");
	}
	// 로그아웃 안내창
	
	void menuWithDraw() {
		work.withDraw();
		System.out.println("회원 탈퇴입니다.");
	}
	// 회원 탈퇴 안내창
}

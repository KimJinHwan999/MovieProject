package Main;



	public class Member {
		private String id;
		private String pw;
	  	// 각각의 아이디 페스워드는 외부에서 접근할 수 없도록
	  	// 접근제어자 private 을 주어 해당 클레스에서만 접근할 수 있도록 했습니다.
		Member(String id, String pw) 
		{
			this.id = id;
			this.pw = pw;
		}
	  	// Member 생성자를 this를 사용하여 초기화 해주었습니다.
		@Override
		public String toString() {
			return getClass().getSimpleName() + "[id: "+ id +" pw: "+ pw +"]";
	    		// 회원의 객체를 그냥 출력하면  16진수로 표현된 객체의 hashcode 로 출력되는것을 
	    		// toString 을 오버라이드 해서 객체를 문자열로 출력하였습니다.
		}
		public String userId() {
			return id;
			// 유저의 아이디를 반환하는 함수
		}
		public String userPw() {
			return pw;
			// 유저의 페스워드를 반환하는 
		}
	}


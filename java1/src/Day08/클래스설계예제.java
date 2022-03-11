package Day08;

public class 클래스설계예제 {
			// 회원 클래스

	// 1. 필드 (* 대체적으로 private 를 쓰는게 일반적이다 )
	private String id;
	private String password;
	private String name;
	private String point;
	



	
	
	// 2. 생성자
		//1. 필드0개 : 빈생성자 [ 메소드 호출용 사용예정]
		//2. 필드3개 : 생성자 [회원 가입시 사용예정]
		//3. 필드4개 : 풀생성자 [ 회원 정보 호출시 사용예정 ]
	
	
	public 클래스설계예제() {
		
	}
	public 클래스설계예제(String id, String password, String name, String point) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.point = point;
	}
	
	
	// 3. 메소드
		//private 필드 사용시 get or set 메소드
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

}

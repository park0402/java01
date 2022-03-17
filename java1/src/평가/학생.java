package 평가;

public class 학생 {
	
	//1. 필드
	private String 이름;
	private int 국어;
	private int 영어;
	private int 수학;
	
	
	
	
	//2. 생성자
		// 1. 빈생성자 : 메소드 호출용 객체생성
	public 학생() {}



		// 2. 모든 필드 받는 생성자 
	public 학생(String 이름, int 국어, int 영어, int 수학) {
		super();
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
	}


	
	
	//3. 메소드
	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get국어() {
		return 국어;
	}

	public void set국어(int 국어) {
		this.국어 = 국어;
	}

	public int get영어() {
		return 영어;
	}

	public void set영어(int 영어) {
		this.영어 = 영어;
	}

	public int get수학() {
		return 수학;
	}

	public void set수학(int 수학) {
		this.수학 = 수학;
	}
	
	
	
	
	
	
	
	
	

}

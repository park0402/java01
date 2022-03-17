package 평가2;

public class 학생 {
	
	// 1. 필드
	
	private String 이름;
	private int 번호;
	private int 국어;
	private int 영어;
	private int 수학;
	private int 총점; // 국 영 수 / 3
	private double 평균; //소수점 두자리
	
	// 2. 생성자
	
	public 학생() {} // 빈생성자
	
	
	
	public 학생(int 번호, String 이름, int 국어, int 영어, int 수학, int 총점, double 평균) {
		super();
		this.번호 = 번호;
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.총점 = 총점;
		this.평균 = 평균;
	} //풀생성자


	
	
	// 3. 메소드
	
	// 개인정보 이므로 private사용 getter setter

	public int get번호() {
		return 번호;
	}



	public void set번호(int 번호) {
		this.번호 = 번호;
	}



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

	public int get총점() {
		return 총점;
	}



	public void set총점(int 총점) {
		this.총점 = 총점;
	}



	public double get평균() {
		return 평균;
	}



	public void set평균(double 평균) {
		this.평균 = 평균;
	}
	
	


	
	
	
	

}

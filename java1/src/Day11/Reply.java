package Day11;

public class Reply {
	//1. �ʵ�
	private String content;
	private String password;
	private String writer;
	private String date;
	
	//2. ������
		//1. �������
	public Reply() {}
		//2. Ǯ������
	public Reply(String content, String password, String writer, String date) {
		super();
		this.content = content;
		this.password = password;
		this.writer = writer;
		this.date = date;
	}
		//3.��۵�Ͻ� ���Ǵ� ������

	public Reply(String content, String password, String writer) {
		super();
		this.content = content;
		this.password = password;
		this.writer = writer;
	}
	
	
	
	//3. �޼ҵ�

}

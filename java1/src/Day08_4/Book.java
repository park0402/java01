package Day08_4;

import java.util.Scanner;

public class Book {
	
	// 1. �ʵ�
	String ISBN;	// ISBN [ ������ȣ = �ĺ��� ] 
	String bname;	// ������
	String bwriter;	// �۰�
	boolean brental;// �����뿩����
	String mid;		// �뿩��ID
	
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ�ȣ���   ( ctrl+�����̹�)
	public Book() {}
		// 2. Ǯ������[����ʵ�޴»�����] : �������
	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	// 3. �޼ҵ� 
		// 1. �����˻� �޼ҵ�
	void �����˻�() { 
		System.out.println(" ------- �����˻� ������ -------");
	}
		// 2. ������� �޼ҵ�
	void �������() {
		System.out.println(" ------- ������� ������ -------");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for( Book temp : BookApplication.books) {
			if( temp != null ) { // ������ �����ϸ� 
				if(  temp.brental ) // �ش絵���� �����뿩���ΰ� true �̸� 
					System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩����");
				else // �ش絵���� �����뿩���ΰ� false 
					System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩��");
			}
		}
	}
		// 3. �����뿩 �޼ҵ�
	void �����뿩( String loginid ) {
		System.out.println(" ------- �����뿩 ������ -------");
		System.out.println(" ���� ISBN : ");	String isbn = BookApplication.scanner.next();
		
		for( Book temp : BookApplication.books ) {
			if( temp != null && temp.ISBN.equals(isbn) ) {
				if( temp.brental ) {
					System.out.println(" �˸�]] �ش� ���� �뿩 �մϴ�.");
					temp.brental = false; // �뿩������ ���� 
					temp.mid =loginid; // ���� �α����� id�� ����
					return;
				}else {
					System.out.println(" �˸�]] �ش� ���� �뿩�� ���� �Դϴ� . [ �뿩�Ұ� ] ");
					return;
				}
			}
		}
		System.out.println(" �˸�]] ������ ����ISBN�� �����ϴ�. ");
	}
		// 4. �����ݳ� �޼ҵ�
	void �����ݳ�( String loginid ) {
		System.out.println(" ------- �����ݳ� ������ -------");
		�����뿩���( loginid  );
		System.out.println(" ���� ISBN "); String isbn = BookApplication.scanner.next();
		for( Book temp : BookApplication.books ) {
			if( temp !=null && temp.ISBN.equals(isbn) ) { // �Է��� isbn�� ������
				if( temp.mid.equals(loginid) ) { // �뿩��id �� ���� �α��ε�id �����ϸ� 
					if( temp.brental ) { // �뿩���� �ƴϸ� 
						System.out.println(" �˸�]] ���� ������ �뿩���� �ƴմϴ�. ");
					}else { // �뿩���̸� 
						System.out.println(" �˸�]] �ݳ� �Ϸ� !!!! ");
						temp.brental = true; // �뿩�� -> �뿩���� ���� 
						temp.mid = null; // �뿩�� ����� id�� �ٽ� �������� [ null ]
						return;
					}
				}else {
					System.out.println(" �˸�]] ȸ������ �뿩�� ������ �ƴմϴ�.");
				}
			}
		}
		System.out.println(" �˸�]] ������ ����ISBN�� �����ϴ�. ");
	}
		// * ���� �α��� �� ȸ���� �뿩���� ���� ��� [ �� �����뿩 ��� ] 
	void �����뿩���( String loginid ) {
		System.out.println(" ------- ������� ������ -------");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for( Book temp : BookApplication.books) {
			if( temp != null && temp.mid.equals( loginid ) ) {
				// * ������ �����ϸ鼭 �뿩id �� ���� �α��ε�id�� ������
				System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩��");
			}
		}
	}
	
		// 5. ������� �޼ҵ�
	void �������() {
		System.out.println(" ------- ������� ������ -------");
		// 1. �Է¹޾� 
		System.out.print(" ISBN : ");	String isbn = BookApplication.scanner.next();
		System.out.print(" ������ : ");	String bname = BookApplication.scanner.next();
		System.out.print(" �۰� : ");	String bwriter = BookApplication.scanner.next();
		//*�ߺ�üũ[isbn]
		for( Book temp : BookApplication.books ) {
			if(  temp !=null && temp.ISBN.equals(isbn) ) {
				System.out.println(" �˸�]] ���� ������� ISBN �Դϴ�. [ ��Ͻ��� ]");
				return; // ������� �޼ҵ� ���� ( ��Ͻ��� )
			}
		}
		// 2. ��üȭ [ �����뿩���� = true , �뿩ȸ��id = null ]
		Book book = new Book(isbn, bname, bwriter, true , null);
		// 3. �迭 ����[�ֱ�]
		int i = 0; // �ݺ�Ƚ�� [ �ε��� ]
		for( Book temp : BookApplication.books ) {
			if(temp == null ) {
				BookApplication.books[i]=book;
				System.out.println(" �˸�]] ��������� �Ǿ����ϴ�. ");
				return; // ������� �޼ҵ� ���� ( ��ϼ��� )
			}
			i++; // �ε�������
		}
	}
		// 6. �������� �޼ҵ�
	void ��������() {
		System.out.println(" ------- �������� ������ -------");
	}
	
}





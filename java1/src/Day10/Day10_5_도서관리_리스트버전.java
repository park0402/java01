package Day10;

import java.util.ArrayList;
import java.util.Scanner;


public class Day10_5_��������_����Ʈ���� {
	//���������� ����Ʈ
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ����Ʈ ��ü ����
		ArrayList<Book> bookList = new ArrayList<>();
		// ����ƮŬ���� < ����Ʈ�ȿ� ������ Ŭ���� > 
			// <Ŭ����> : �ش� Ŭ������ ������ü�� ����Ʈ�� ����
			// ���̴� ���� [ �⺻ : 10 ] �߰��ϸ� �þ�� �����ϸ� �پ���.
		
		while(true) {
			System.out.println("1)��� 2)��� 3)���� 4)����");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
			// �迭
				// 1. ���� �Է¹ޱ�
				System.out.println("������ : ");
				String bookname = scanner.next();
				System.out.println(" ���� : ");
				String writer = scanner.next();
				// 2. ��üȭ [ �������� ������ �ϳ��� ���� ]
				Book book = new Book(bookname, writer);
				// 3. �迭���� [ ������ ã�Ƽ� ���� ] vs ����Ʈ [ ������ ã�� �ʿ䰡 ���� ]
				bookList.add(book);
				// �� �̷��� �ǳ�? : ����Ʈ��.add( ��ü�� )
					//������ �ε����� �ڵ������� ��ü�� �߰�
			}
			else if(ch == 2) {
				// 1. �迭 [ null�� ���� ]
				System.out.println("å\t����");
				for(Book book : bookList) {
					System.out.println(book.get������()+"\t"+book.get����());
				}
			}
			else if(ch == 3) {
				System.out.println("������ å�̸� �Է�");
				String aa = scanner.next();
				for(Book book : bookList) {
					if(book.get������().equals(aa)){
						bookList.remove(book);
						break;
					}
					
				}
				System.out.println("�ش� å�� ���� �Ǿ����ϴ�.");
			}
			else if(ch == 4) {
				System.out.println("������ å�̸� �Է� :");
				String aa = scanner.next();
				for(Book book : bookList) {
					if(book.get������().equals(aa)) {
						System.out.println("���ο� ���ڸ� �Է� : ");
						String writer = scanner.next();
						book.set����(writer);
					}
				}
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}
			
			
		}
	}
}

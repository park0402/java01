//package ����������;  ��Ʈ�ѷ� ���� 
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//
//
//
//
//
//public class ��Ʈ�ѷ� {
//	//0. �Խù�����Ʈ
//	public static ArrayList<��������> ��������Ʈ= 
//			new ArrayList<>();
//
//	
//	//1.����޼ҵ�
//	public static void write(int ������ȣ, int �����ð�) {
//		// TODO Auto-generated method stub
//		
//	
//		�������� ������ü = new �������� (������ȣ,�����ð� ) ;
//		// 1. ��üȭ
//		��������Ʈ.add(������ü);
//		// 2. ����Ʈ�� ����
//		save();
//		// 3. ���Ͽ� ����
//	
//
//}
//	//2.����޼ҵ�
//	public static void save() {
//		try {
//			// 1. ������� Ŭ����
//		FileOutputStream outputStream = new FileOutputStream("C:/mine_data/��������.txt");
//			// 2. ���Ͽ� �ۼ��� ����[���پ� �Խù��ϳ��� ��ü1���� ]
//		for(�������� ������ü : ��������Ʈ) {
//			String �������� = ������ü.get������ȣ() + "," +������ü.get�����ð�() +"\n";
//		
//			outputStream.write(��������.getBytes());
//
//		}
//		}catch(Exception e) {
//			System.err.println("�˸�)) ���� ���� ������ ���� ����");
//		}
//		
//	}
//}

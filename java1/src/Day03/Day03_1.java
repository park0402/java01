package Day03;

public class Day03_1 { // c s
	public static void main(String[] args) { // m s
		
	
		
		// 1���� : ���, �Է�
		// 2���� : ����, ���(����)
		// ���
			// ��ǻ���� �Ǵܷ��� ����
			// ���� 
				// if(����) ���๮; *���ǹ��� true�̸� ����
		// if-else ����Ǽ� 2���� �̻� ������ ���� �� ��� �帧���� �ۼ��ϱ�. 
		// 1-1. �帧�� �ۼ� 1000���ְ� ������ �ݶ����� ���״� ��Ȳ ���� 
		// 1-2. A������ �ݶ�X, B������ �ݶ� 1200�� , C������ �ݶ� 1000��
		
		
		// if( A������ == �ݶ� && �ݶ󰡰� <= 1000 ) { ���� }
		// else if( B������ == �ݶ� && �ݶ󰡰� <= 1000 ) { ���� }
		// else if( C������ == �ݶ� && �ݶ󰡰� <= 1000 ) { ���� }
		// else { ���� }
		
	// ���� 1
		if(3>1) System.out.println("��) 3�� 1���� ũ��. ");
		// ���࿡ 3�� 1���� ũ�� ��� �ƴϸ� ���x
		if(3>5) System.out.println("��) 3�� 5���� ũ��. ");
		//���࿡ 3�� 5���� ũ�� ���o �ƴϸ� ���x
		
	// ���� 2 
		if(3>1) System.out.println("��2_1) 3�� 1���� ũ��.");
		else System.out.println("��2_2) 3�� 1���� �۴�. ");
			//3�� 1���� ũ��(if) ��3_1 ��� �ƴϸ�(else) 3_2 ���
	// ���� 3
		if(3>2) {//if s 
			System.out.println("true�̸� ����Ǵ��ڸ�");
			System.out.println("3�� 2����ũ��.");}// if e
		// ���๮�� 2���̻��϶� ǥ���ص���.
		else { //ifs
	// ���� 4
		if(3>5) System.out.println("��4) 3�� 5���� ũ��.");
		else if(3>4) System.out.println("��4) 3�� 4����ũ��.");
		else if(3>3) System.out.println("��4) 3�� 3����ũ��.");
		else if(3>2) System.out.println("��4) 3�� 2����ũ��.");
		else System.out.println("true ����.");
		
		if(3>5) System.out.println("��4) 3�� 5���� ũ��.");
		if(3>4) System.out.println("��4) 3�� 4����ũ��.");
		if(3>3) System.out.println("��4) 3�� 3����ũ��.");
		if(3>2) System.out.println("��4) 3�� 2����ũ��.");
		if(3<2) System.out.println("true ����.");
		/* if�ڵ庸�� else �ڵ尡 �� ȿ�����ִ� : else �ڵ�� ���� if�ڵ��
		�ϳ��� ��������� if�ڵ�� ���� �˻��غ��� ������ �����͸� �� ��ƸԴ´�.
		*/
		} //if e 
		
		
		// ���� 
		// 1.  IF( ���ǽ�[true/false] ) ���๮;
		// 2.  IF( ���ǽ� ) ���๮[��];
		//     ELSE ���๮[����];
		// 3.  ���๮�� 2�� �̻�( ; 2�� �̻��̸� )  {   } ����ó�� 
		// 4.  ����Ǽ� �ټ��϶� [ ������ �ټ��϶� ]
		//	   IF( ����1 ) { ���๮[��1]; }
		//	   ELSE IF( ����2 ) { ���๮[��2]; }
		//	   ELSE IF( ����3 ) { ���๮[��3]; }
		//	   ELSE IF( ����4 ) { ���๮[��4]; }
		//	   ELSE IF( ����5 ) { ���๮[��5]; }
		//     ELSE { ���๮[����]; }
		// 5. if ��ø
		//		IF( ���ǽ� ) { 
		//			IF( ���ǽ� ){ ���๮; }
		//			ELSE { ���๮; } 
		//		}ELSE{
		//			IF( ���ǽ� ){ ���๮; }
		//			ELSE { ���๮; }
		//		}
			
		
		
	}// m d 

} // c d
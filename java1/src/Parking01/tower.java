package Parking01;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class tower {
	
	 String carnum; // ��ȣ
	 int parklo;	// ������ġ
// ������ ���� "[o]" ��� "[ ]"

	public int getParklo() {
		return parklo;
	}

	public void setParklo(String carnum, int parklo) {
		this.carnum = carnum;
		this.parklo = parklo;
	}

	//���� �ð�
	private ZonedDateTime parkStart = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	//���� �ð�
	private ZonedDateTime parkEnd = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

	public ZonedDateTime getParkStart() {
		return parkStart;
	}

	public ZonedDateTime getParkEnd() {
		return parkEnd;
	}
	//�޼ҵ�
	
	public void �������(String carNumber, int index) { // ������� s
		carnum = carNumber; // ����ȣ ���ڷ� �޾ �ʵ��� ����
		parklo = index;		// ��ġ�޾Ƽ� �ʵ忡 ����
		main.park[index] = "[" + carNumber + "]"; 
	} // ������� e

	public void ��������(String carNumber) { // �������� s
		for(int i=0; i<12; i++) { // for s
			if(main.park[i].equals("[" + carNumber + "]")) { // ������ȣ ��ġ�ϸ�
				main.park[i] = "[ ]"; return;
			}
		} // for e
	} // �������� e
}

package Day10;

public class Television implements RemoteControl{
			//Ŭ������ implements �������̽���
					// �����ϴ�.
	private int volume;
	
	//turnon
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//turnoff
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	//setvolume
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//�������� �ִ� �������� ũ�� ������10����
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME){
			//�������� �ּҼ������� ������ ������ 0����
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
	}
}
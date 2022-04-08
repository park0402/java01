package Day10;

public class Television implements RemoteControl{
			//클래스명 implements 인터페이스명
					// 구현하다.
	private int volume;
	
	//turnon
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnoff
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setvolume
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//리모컨의 최대 소음보다 크면 소음을10으로
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME){
			//리모컨의 최소소음보다 작으면 소음을 0으로
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
}
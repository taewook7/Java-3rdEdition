package ch07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
// 클래스 외부에서 접근할수 없도록 private 지시자를 넣어주었다.
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
// 채널과 볼륨은 100 을 넘지않도록하자. 
	
	
	public void setChannel(int channel) {
		if(volume>MAX_CHANNEL || volume < MIN_CHANNEL)
//			System.out.println("범위를 초과하였습니다.");
			return;
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
}

public class Exercise7_4 {

	public static void main(String[] args) {
		MyTv2 tv = new MyTv2();
		tv.setChannel(255);
		System.out.println("채널은: "+tv.getChannel());
		tv.setVolume(20);
		System.out.println("볼륨은: "+tv.getVolume());
		
	}

}

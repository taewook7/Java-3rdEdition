package ch07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
// Ŭ���� �ܺο��� �����Ҽ� ������ private �����ڸ� �־��־���.
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
// ä�ΰ� ������ 100 �� �����ʵ�������. 
	
	
	public void setChannel(int channel) {
		if(volume>MAX_CHANNEL || volume < MIN_CHANNEL)
//			System.out.println("������ �ʰ��Ͽ����ϴ�.");
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
		System.out.println("ä����: "+tv.getChannel());
		tv.setVolume(20);
		System.out.println("������: "+tv.getVolume());
		
	}

}

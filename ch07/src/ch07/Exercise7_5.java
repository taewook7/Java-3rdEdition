package ch07;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int previousChannel;
// Ŭ���� �ܺο��� �����Ҽ� ������ private �����ڸ� �־��־���.
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
// ä�ΰ� ������ 100 �� �����ʵ�������. 
	
	
	public void setChannel(int channel) {
		if(channel >MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		previousChannel=this.channel;
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
	public void gotoPreviousChannel() {
		setChannel(previousChannel);
	}
	
}

public class Exercise7_5 {

	public static void main(String[] args) {
		MyTv tv = new MyTv();
		tv.setChannel(10);
		System.out.println("ä����: "+tv.getChannel());
		tv.setChannel(20);
		System.out.println("ä����: "+tv.getChannel());
		tv.setChannel(26);
		System.out.println("ä����: "+tv.getChannel());
		tv.gotoPreviousChannel();
		System.out.println("ä����: "+tv.getChannel());
		tv.gotoPreviousChannel();
		System.out.println("ä����: "+tv.getChannel());
		
	}

}

package ch10_2Interface;
public class Remote{}

class RemoteAudio implements RemoteControl{		//	�������̽��� ����Ŭ������ implements [Ŭ����] �� ����Ѵ�.
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio on");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}
	@Override
	public void setVolume(int volume) {
		if		(volume>RemoteControl.MAX_VOLUME) 	this.volume = RemoteControl.MAX_VOLUME;
		else if	(volume<RemoteControl.MIN_VOLUME) 	this.volume = RemoteControl.MIN_VOLUME;
		else										this.volume = volume;
		System.out.println("���� Audio ����: "+this.volume);
		
	}

}

class RemoteTv implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio on");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}
	@Override
	public void setVolume(int volume) {
		if		(volume>RemoteControl.MAX_VOLUME) 	this.volume = RemoteControl.MAX_VOLUME;
		else if	(volume<RemoteControl.MIN_VOLUME) 	this.volume = RemoteControl.MIN_VOLUME;
		else										this.volume = volume;
		System.out.println("���� TV ����: "+this.volume);
		
	}
}
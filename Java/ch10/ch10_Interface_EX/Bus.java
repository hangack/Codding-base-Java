package ch10_Interface_EX;

public class Bus implements Ex04Vehiclable {
	private int speed;
	@Override
	public void run() {
		System.out.println("����: "+this.speed+"Km");
	}
	@Override
	public void stop() {
		System.out.println("����: ����!");
	}
	@Override
	public void setSpeed(int speed) {
		if(speed<0) {
			System.out.println("error: negative");
			return;
		}
		this.speed = speed;
	}

}

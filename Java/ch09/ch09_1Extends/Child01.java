package ch09_1Extends;

public class Child01 extends Parent01 {
	int channel;
	Child01(String model, String color, int channel){
		this.model = model;		//	this.model = �θ� Ŭ���� ���
		this.color = color;		//	this.color = �θ� Ŭ���� ���
		this.channel = channel;
	}
	
	void turnOn() {
		System.out.println("ä��: "+channel+"�� ��� ����");
	}
	void changeChannel (int channel) {
		System.out.println("ä���� "+channel+"������ ����");
	}
	void turnOff() {
		System.out.println("��� �ߴ�");
	}

}

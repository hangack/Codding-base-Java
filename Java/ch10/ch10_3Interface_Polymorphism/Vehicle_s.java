package ch10_3Interface_Polymorphism;

public class Vehicle_s {}

class Bus implements Vehicle{
	@Override
	public void run(){
		System.out.println("�޸��� ����");
	}
}
class Taxi implements Vehicle{
	@Override
	public void run(){
		System.out.println("�޸��� �ý�");
	}
}

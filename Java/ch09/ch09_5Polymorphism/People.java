package ch09_5Polymorphism;

public class People {
	public void printInfo() {
		System.out.println("����Դϴ�");
	}
}
class Man extends People{
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("����");
	}
	
	public void enlist() {
		System.out.println("����");
	}
}
class Woman extends People{
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("����");
	}
	public void working() {
		System.out.println("w");
	}
}

package ch10_Interface_EX;

public class Ex02_implements implements Ex02 {
	@Override
	public void makeThis() {
		System.out.println("make This method ����");
	}
	@Override
	public void makeThisWith(String name, int age) {
		System.out.printf("With method ����, �Ű�����: %s,%d",name,age);
	}

}

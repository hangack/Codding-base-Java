package ch10_4Interface_Extends;

public class implementationC implements C {
	public void methodA() {
		System.out.println("methodA ��ü�� �־���Ѵ�.");
	}
	public void methodB() {
		System.out.println("methodA ��ü�� �־���Ѵ�.");
	}
	public void methodC() {
		System.out.println("methodA ��ü�� �־���Ѵ�.");
	}

}

class implementationAB implements A,B{		//	�������̽� ���� ���� ����
	public void methodA() {
		System.out.println("methodA ��ü�� �־���Ѵ�.");
	}
	public void methodB() {
		System.out.println("methodA ��ü�� �־���Ѵ�.");
	}
}

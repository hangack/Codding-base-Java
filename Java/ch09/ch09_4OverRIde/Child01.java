package ch09_4OverRIde;

public class Child01 extends Parent01 {
	int age = 25;
	@Override		//	������̼�: �������̵��� �� �Ǿ����� üũ�ϴ� ���� (�ʿ����� ����)
	public void info() {	//	�޼ҵ� �������̵� -> �θ�&�ڽ� �޼ҵ��� ��� �ڽ� �޼ҵ尡 �켱
		//	�������̵� �� ���� �������� Ȯ���� �����ϳ� ��Ҵ� �Ұ����ϴ�.	(ex: P= public, C= (defualt)  �� �Ұ���)
//		System.out.println("�ڽİ�ü info() �̸�: "+this.name);		//	�θ� Ŭ������ ��ü�� ���
		super.info();											//	�θ� Ŭ������ info �޼ҵ带 �ҷ��Դ�.
		System.out.println("�ڽİ�ü info() ����: "+this.age);
	}

}

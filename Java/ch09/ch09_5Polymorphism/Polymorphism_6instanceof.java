package ch09_5Polymorphism;

public class Polymorphism_6instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent06 parentA = new Child06();
		method1(parentA);
		
		Parent06 parentB = new Parent06();
		method1(parentB);

	}
	public static void method1(Parent06 parent) {	//	������ �޼ҵ�: "Ÿ�� ������"�� �޼ҵ� ���� ������ �־ �޼ҵ� ���� ������ ���
		if(parent instanceof Child06) {			//	if (instanceof): Ÿ�� ��ȯ�� �������� Ȯ��
			Child06 Child = (Child06)parent;	//	Parent06 -> Child06	Ÿ�� ���� ��ȯ
			System.out.println("m1 - child ��ȯ ����");
		}else {
			System.out.println("m1 - child ��ȯ ����");
		}
		
	}

}


class Parent06{}
class Child06 extends Parent06{}

package ch10_1Abstract;

class Cat extends Animal{
	Cat() {
		super("�����");
	}

	@Override
	void sound() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal{
	Dog() {
		super("������");
	}

	@Override
	void sound() {
		System.out.println("�۸�");
	}
	
}

public class Abstract_2animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		Dog dog = new Dog();
//		Animal ami = new Animal();	//�߻� Ŭ������ ��ü�� ���� �� ����.
		
		cat.sound();
		cat.breathe();
		dog.sound();
		dog.breathe();
		
	}

}

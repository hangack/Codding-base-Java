package ch09_5Polymorphism;

public class Polymorphism_5Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People man = new Man();
		People woman = new Woman();
		
		man.printInfo();
//		man.enlist();			//	People Ÿ�Կ��� enlist �޼ҵ尡 ����.
		((Man)man).enlist();	//	Man Ÿ������ ���� ��ȯ(casting)
		System.out.println();
		woman.printInfo();
		((Woman)woman).working();

	}

}

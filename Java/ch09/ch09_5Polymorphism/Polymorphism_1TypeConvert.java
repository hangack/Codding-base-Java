package ch09_5Polymorphism;

public class Polymorphism_1TypeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child01 c1 = new Child01();
		Parent01 p1 = c1;		//	�ڵ� Ÿ�� ��ȯ1
		
		Parent01 p2 = new Child01();		//	�ڵ� Ÿ�� ��ȯ2
		
		c1.m1();	c1.m2();	c1.m3();	//	�θ� �޼ҵ� m1 ���
		p1.m1();	p1.m2(); //	p1.m3();	//	�ڽ����κ��� ����� �Ұ�
		p2.m1();	p2.m2(); //	p2.m3();	//	Same
		
	}

}

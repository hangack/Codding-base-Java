package ch09_5Polymorphism;

class a{
	public String x() {
		return "x";
	}
}
class b extends a{
	@Override
	public String x() {
		return "b.x";
	}
	public String y() {
		return "y";
	}
}
class b2 extends a{
	@Override
	public String x() {
		return "b2.x";
	}
}

public class Polymorphism_2 {
//	public�� ���� Ŭ������ ���ϸ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a ex = new b();
		a ex2 = new b2();
		System.out.println(ex.x());
//		System.out.println(ex.y());		//	�θ� Ÿ���� �ν��Ͻ��� �ڽ� ������ �޼ҵ�� �ҷ� �� �� ����.
		System.out.println(ex2.x());	//	�������̵��� ��� �ڽ��� �켱

	}

}

package ch06_1method;

public class Method_1 {

	public static void main(String[] args) {		// main: ���� �޼ҵ�
		// TODO Auto-generated method stub
		int a = 30,b = 7;
//		Waldo(a);
		Calc1 myCalc = new Calc1();		// ���� ������Ʈ �ȿ� �ִ� �޼ҵ带 �ҷ��´�.
		myCalc.powerOn();
		
		int result1 = myCalc.plus(a, b);
		System.out.println("result1: "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		
		myCalc.powerOff();
	}
	public static void Waldo(int age) {
//	public static ����Ÿ�� �޼ҵ��̸� (�Ű���������, ...)
//	private: �ܺ� class���� ���� �Ұ�	{public:������, private:������}
//	stactic: Ŭ���� ���Ͼȿ��� ���� ���� = ��ü �������� ���� ex) Calc1 myCalc = new Calc1();
// void: �⺻ ��(������ ���� ����)
		System.out.println("����� ���� ��ħ");
		System.out.printf("�� ���̴� %d�Դϴ�", age);
	}
}

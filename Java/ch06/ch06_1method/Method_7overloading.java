package ch06_1method;

public class Method_7overloading {
/*	�̸��� ���� �żҵ带 ������ ������ �� �ִ�.
 * 	�Ű����� ���� Ȥ�� Ÿ���� �ٸ� �� ���� �̸��� �޼ҵ� �� �ش��ϴ� �żҵ带 ã�ư���.
 *	����Ÿ���� �ڵ���ȯ�ȴ�.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		System.out.printf("int�� +: %d\n",add(3,5));
//		System.out.printf("double�� +: %4.2f\n",add(3.14,5.78));
		System.out.println("���� + ���� = "+add(5,7));
		System.out.println("�Ǽ� + �Ǽ� = "+add(2.2,8));
		System.out.println("���� + �Ǽ� = "+add(30,5.5));
		

		info("��浿");
		info("��浿",25);
		info("asdf","1234");
		info(123,"�ڵ� ���ø�Ʈ");

	}

	public static int add(int a, int b) {
		return a+b;	}
	public static double add(double a, double b) {
		return a+b;	}
	public static double add(int a, double b) {
		return a+b;	}

	private static void info(String name) {
		System.out.println("name: "+name);	}
	private static void info(String name, int age) {
		System.out.println("name: "+name);
		System.out.println("age: "+age);	}
	private static void info(String id, String pw) {
		System.out.println("ID: "+id);
		System.out.println("PW: "+pw);	}
	private static void info(int number, String title) {
		System.out.println("num: "+number);
		System.out.println("title: "+title);	}

}

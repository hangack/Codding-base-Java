package practice;

public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		System.out.println(ch);

		int num = 100;
		long l = 100l;
		System.out.println(num + "," + l);

		float f = 10.123f;
		double d = 10.123;
		System.out.println(f + "," + d);

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 + "," + b2);

		
		System.out.println();

		char ch2 = 'A' + 1;
		int i2 = ch2;
		System.out.println(ch2);
		System.out.println(i2);

		double d2 = 10.1;
		int i3 = (int) d2;
		System.out.println(d2);
		System.out.println(i3);

		byte bb = (byte) 128;		//���� Ÿ�� ��ȯ	(128 = 0000 0000 0000 0000 0000 0000 1000 0000)
		byte bbb = (byte)130;		//				�� �� 0�� ���(+)�� 1�� ����(-)�� �ǹ�
		System.out.println(bb);		//				��, ������ ����� �ݴ�� ǥ���Ѵ�. ex) 1111 1111 = -1, 1000 0000 = -128
		System.out.println(bbb);

		String str = "Hello";
		System.out.println(str);

	}

}

package ch02_3DataType;

public class TypeChange {	// �ڵ� Ÿ�� ��ȯ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 10;
		System.out.println("byteValue: "+byteValue);

		int intValue = byteValue;
		System.out.println("intValue: "+intValue);

		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�: "+intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+doubleValue);
		System.out.printf("doubleValue: %15.15f",floatValue);
	}
	
	// ���� �������� Ÿ�� ��ȯ�� �����Ӵ�.

}

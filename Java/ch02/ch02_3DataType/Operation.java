package ch02_3DataType;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 10, y = 20;
	//	byte result = x+y;				// byte+byte = int����
		int result = x+y;				// ������ int���������� ��� ������ byte�� �̷����
		System.out.println(result);

		System.out.println();
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		intValue = (int)   doubleValue;
		System.out.println(intValue);
		
	}

}

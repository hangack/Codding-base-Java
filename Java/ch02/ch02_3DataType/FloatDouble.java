package ch02_3DataType;

public class FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ǽ� �� ����
	//	float var1 = 3.14;
		float var2 = 3.14f;		// �Ǽ��� float Ÿ���� ��� Java���� �ݵ�� f�� �ٿ������
		double var3 = 3.14;
		
		//���е� �׽�Ʈ
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		double var6 = 0.1234567890123456789f;

		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);	//0.12345679				8���� �ݿø�
		System.out.println("var5: "+var5);	//0.123456789012345678(9)
		System.out.println("var6: "+var6);	//0.1234567/9/104328156		8���� �ݿø� ��?
		double var10 = var4;
		System.out.println("var10: "+var10);//							�ڵ� Ÿ�� ��ȯ
		
		
		//e(exponential: ����) ����ϱ�
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		System.out.println("var9: "+var9);
		
		//e ����ϱ�
		

	}

}

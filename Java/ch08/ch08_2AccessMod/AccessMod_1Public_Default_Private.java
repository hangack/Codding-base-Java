package ch08_2AccessMod;

import ch08_2AccessMod.dto.TestDto;
//import ch08_2AccessMod.vo.TestVo;		
//	default ���������ڴ� ���� ��Ű�� �ȿ����� ��� �����ϴ�.
//	������Ű��: ch08_AccessMod;
//	������ �����ڴ� �⺻������ class�� ���󰣴�.

//	public > protected > (default) > private

public class AccessMod_1Public_Default_Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDto testdto = new TestDto();
//		testVo testvo = new TestVo();
		
		ch08_2AccessMod.Public_Default_Private ex1 = new ch08_2AccessMod.Public_Default_Private();
		//	���� ��Ű��
		ch08_2AccessMod.dto.DTO_Public_Default_Private ex2 = new ch08_2AccessMod.dto.DTO_Public_Default_Private();
		//	���� ������Ʈ

		System.out.println("public"+ex1.field1);	//public:	������Ʈ �ȿ��� ���
		System.out.println("public"+ex1.field2);	//default:	����Ű�� �ȿ��� ���
//		System.out.println("public"+ex1.field3);	//private:	��Ŭ���� �ȿ��� ���
		
		ex1.method1();
		ex1.method2();
//		ex1.method3();
		
		System.out.println("public"+ex2.field1);	//public:	������Ʈ �ȿ��� ���
//		System.out.println("public"+ex2.field2);	//default:	����Ű�� �ȿ��� ���
//		System.out.println("public"+ex2.field3);	//private:	��Ŭ���� �ȿ��� ���
		
		ex2.method1();
//		ex2.method2();
//		ex2.method3();

	}

}

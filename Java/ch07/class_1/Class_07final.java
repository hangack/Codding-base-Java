package class_1;

public class Class_07final {
	final static String constant = "���";
	final String NAME = "�ȳ��ϼ���";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(constant);
		System.out.println(Class_07final.constant);
//		System.out.println(NAME);		//	static�� ����.
//		System.out.println(Class_07final.NAME);
		Class_07final fm = new Class_07final();
//		fm.NAME = "�ݰ����ϴ�";			//	final: ���尪 ���� �Ұ�
//		Class_07final.constant = "���� �Ұ�"
		System.out.println(fm.NAME);

	}

}

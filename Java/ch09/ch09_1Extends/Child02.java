package ch09_1Extends;

public class Child02 extends Parent02 {
	int studnetNo;
	public Child02(String name, String ssn, int studentNo) {
		super(name,ssn);				//	super(�Ű���): �Ű� ���� Ÿ�԰� ��ġ�ϴ� �θ� �����ڸ� ȣ��
										//				> Parent02(String name, String ssn)
		this.studnetNo = studentNo;
	}

}

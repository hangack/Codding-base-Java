package ch09_1Extends;

public class Parent03_AccessMod {
	public String lastName = "��";
	private String firstName = "����";	//	private: Ŭ���� ������ ���
	private void method() {
		System.out.println("�θ�Ŭ����");
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

}

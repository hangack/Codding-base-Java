package Practice;

public class Teacher extends Member {
	String subject;
	Teacher(String subject){
		this.subject = subject;
	}
	public void work() {
		System.out.println("�Ѵ� ����");
	}
	public void test() {
		System.out.println("�Ѵ� ä��");
	}

}

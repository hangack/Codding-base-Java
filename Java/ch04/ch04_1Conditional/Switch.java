package ch04_1Conditional;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lang = "Java";
		switch (lang) {	//Ư�� ������ ã�� �ش� ������ �̵�
		case "Python":	//����, ����, ���ڿ� ��� ����; �Ǽ�, ������ ��� �Ұ�
			System.out.println("���̽�");
			// break;
		case "Java": // Ư�� ���� Java���� �ڵ� ����.
			System.out.println("�ڹ�");
			// break; //break���� ������ ���� ��� �ڵ尡 �۵��Ѵ�.
		case "C#":
			System.out.println("C#");
			// break;
		case "C++":
			System.out.println("Cpp");
			// break;
		default:
			System.out.println("��Ÿ ���");
		}
		System.out.println();

		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case'a':
			System.out.println("���ȸ��");
			break;
		case'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;
		default:
			System.out.println("�մ�");
		}
	
	}

}

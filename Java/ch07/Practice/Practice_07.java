package Practice;

import java.util.Scanner;

public class Practice_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("����,����,���� ������ 3���� ���� �Է� >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("�����"+me.average());	// 	average()�� ��� ��� �� return

		sc.close();
	}

}

package ch03_01inout;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�, ��, ����, ��¥�� ��ĭ���� �и��Ͽ� �Է�");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
		String phone = scan.next();
		System.out.println("����� ��ȣ�� "+phone+"�Դϴ�.");
		int age = scan.nextInt();
		System.out.println("����� ���̴� "+age+"�Դϴ�.");
		int date = scan.nextInt();
		System.out.println("������ "+date+"�� �Դϴ�.");
		scan.close();

	}

}

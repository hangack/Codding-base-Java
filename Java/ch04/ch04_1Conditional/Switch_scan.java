package ch04_1Conditional;

import java.util.Scanner;

public class Switch_scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		System.out.println("1.���� 2.���� 3.���� 4.����");
		System.out.println("�����ȣ: ");
		int num = sc.nextInt();
		
		switch(num){
			case 1: System.out.println("101ȣ"); break;
			case 2:System.out.println("102ȣ");break;
			case 3:System.out.println("203ȣ"); break;
			case 4: System.out.println("204ȣ");break;
			default: System.out.println("�������� ���� ���ּ���");
		}

	}

}

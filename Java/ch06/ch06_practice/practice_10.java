package ch06_practice;

import java.util.Scanner;

public class practice_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		calc_p10 bank = new calc_p10();
		int account,money,menu;
		account = 210000;
		boolean input=true;
		
		bank.account = account;
		while(input) {
			System.out.printf("1.���� 2.��� 3.��ȸ 0.����\n: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("�ݾ� ����: ");
				bank.in();
				bank.check();
				continue;
			case 2:
				System.out.print("ã���� �ݾ�: ");
				bank.out();
				bank.check();
				continue;
			case 3:
				bank.check();
				continue;
			case 0:
				input =false;
				continue;

			default:System.out.println("error");
				continue;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");

		
		scan.close();
		bank.scan.close();
	}

}

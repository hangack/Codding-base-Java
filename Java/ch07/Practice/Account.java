package Practice;

import java.util.Scanner;

public class Account {
	String account, num;
	int balance;
	Scanner scan = new Scanner(System.in);
	
	void deposit() {
		System.out.print("�Ա�: ");
		int money = scan.nextInt();
		balance += money;
	}
	void withdraw() {
		System.out.print("���: ");
		int money = scan.nextInt();
		balance -= money;
	}
	void user(String account,String num, int balance) {
		this.account = account; this.num = num;
		this.balance = balance;
	}
	
}

package Practice;

import java.util.Scanner;

public class Book {
	String book = "������ ��������."
			,author;
	Scanner scan = new Scanner(System.in);

	void In() {
		System.out.print("����>>");
		book = scan.nextLine();
		System.out.print("����>>");
		author = scan.nextLine();
	}
	void info(){
			System.out.printf("(%s, %s)",book,author);
		
	}
}

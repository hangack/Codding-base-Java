package ch03_01inout;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String inputdata;
		
		inputdata = scan.nextLine();	// ���� ���� \n�� ��(Line)����
		System.out.println("�Էµ� ���ڿ�: \""+inputdata+"\"");

		scan.close();

	}

}

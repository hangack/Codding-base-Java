package ch06_1method;

import java.util.Scanner;

public class Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �ΰ� �Է�");
		System.out.print(">");
		int ai = scan.nextInt();
		System.out.print(">");
		int bi = scan.nextInt();
		
		maxNum(ai,bi);

	}
	public static void maxNum(int a,int b) {
		int max;
		if(a>b) max = a;
		else max = b;
		System.out.printf("%d �� %d �߿� ū ��: %d",a,b,max);
	}

}

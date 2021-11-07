package test0928;

import java.util.Scanner;

public class Question02 {
	
	public static void main(String[] args) {
		int[] prices = {240,250,120,75,100,25};
		int select;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ ��ǰ�� �������ּ���.\n");
		for(int i=0;i<wishList.length;i++) {
			System.out.printf("%d.%s ",i,wishList[i]);
		} System.out.print("\n: ");
		select = sc.nextInt();
		
		System.out.printf("���� ���� ��ǰ: %s\n",wishList[select]);
		
		
		maxMethod(prices);
		
		String[] cheap = puchasedMethod(prices);
		
		System.out.println("��պ��� ������ ��ǰ ���");
		for(int i=0;i<cheap.length;i++) {
			System.out.printf("-%s\n",cheap[i]);
		}

		sc.close();
	}
	
	
	
	
	static String[] wishList = {"TV","�����","��Ź��","������","��ǻ��","���ڷ�����"};
//	static String wishList[] = new String[6];
//	wishList = new String[] {"TV","�����","��Ź��","������","��ǻ��","���ڷ�����"};
	
	
	static String rMethod(int i) {
		return wishList[i];
	}
	
	
	static void maxMethod(int[] prices) {
		String maxG;
		int max=0,no=100;
		
		for(int i=0;i<wishList.length;i++) {
			if(prices[i]>max) {
				max = prices[i];
				no = i;
			}
		}
		System.out.printf("�ְ� ��� ��ǰ �̸�: %s\n�ְ� ��� ��ǰ ����: %d\n",wishList[no],prices[no]);
	}
	
	
	static String[] puchasedMethod(int prices[]) {
		int sum=0;
		double avg;


		int count = 0;
		for(count=0;count<wishList.length;) {
			sum += prices[count];
			count++;
		} avg = (double)sum/count;
		
		count = 0;
		for(int i=0;i<wishList.length;i++) {
			if(prices[i]<avg) {
				count++;
			}
		} String[] cheaper = new String[count];
		
		count = 0;
		for(int i=0;i<wishList.length;i++) {
			if(prices[i]<avg) {
				cheaper[count] = wishList[i];
				count++;
			}
		}
		
		return cheaper;
	}
}

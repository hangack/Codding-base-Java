package ch05_practice;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. arr[3].length�� ��
		int arr2[][] = {{5,5,5,5,5},{10,10,10},{20,20,20,20},{30,30}};
		System.out.println(arr2[3].length);
//		System.out.println(arr2.length);
		
		
//		2. �迭�� ��� ������ ��
		int arr1[] = new int[] {10,15,47,23,51};
		int sum2=0;
		for(int i:arr1) sum2+=i;
		System.out.println(sum2); 
		
		
//		3. 2���� �迭�� ��� ��� ������ ���հ� ����� ���ϴ� ���α׷�
		arr2 = new int[][] {{ 5, 5, 5, 5, 5},{10,10,10,10,10},
							{20,20,20,20,20},{30,30,30,30,30}};
		int sum3=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				sum3+=arr2[i][j];
			}
		}
		System.out.println(sum3);
		
		
//		4. 1~9�� ���ڷ� �̷���� 3�ڸ� ���ڸ� ����� ���� ���α׷�. ��, ������ �ߺ��� �־ �ȵȴ�.
		arr1 = new int[3];
//		for(int i:arr1) {
//			for(int j:arr1) {
//				for(int k:arr1) {
//					if((i!=j)&&(i!=k)&&(j!=k)) System.out.printf("%d%d%d ",i,j,k);
		int a = (int)(Math.random()*9+1);
		arr1[0]=a;
		while(a==arr1[0]) {
			a = (int)(Math.random()*9+1);
		}
		arr1[1]=a;
		while((a==arr1[0])||(a==arr1[1])) {
			a = (int)(Math.random()*9+1);
		}
		arr1[2]= a;
		for(int i=0;i<=2;i++)	System.out.print(arr1[i]);
		System.out.println();
		
		
//		5. �ִ밪�� �ش��ϴ� index�� ���
		arr1 = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max5=arr1[0];
		for (int i=0;i<arr1.length;i++) {
			if(max5>arr1[i]) max5=arr1[i];
		}
		System.out.println(max5);
		
		
//		6.�迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ�
//		-1. Ű���忡�� ������ �� ���� �׼��� �Է¹޾� ������/����/õ��/500��/100��/50��/10��/1��¥���� �� ��� ��ȯ�Ǵ��� ����ϼ���.
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
		int money = scan.nextInt(), 
				change[] = new int[8], 
				paper[] = {50000,10000,1000,500,100,50,10,1};
		String bill[] = {"50000","10000","1000","500","100","50","10","1"};
		for(int i=0;i<change.length;i++) {
			change[i] = money/paper[i];
			money -= change[i]*paper[i];
			System.out.printf("%s���� %d�� ",bill[i],change[i]);
		}System.out.println();
		
		
//		7. �迭�� ��� ���ڸ� �о ���ڸ�ŭ *�� ��� ���α׷�
		arr1 = new int[]{3,2,5};
		for(int i=0;i<arr1.length;i++) {
			for(int n=arr1[i];n>0;n--) {
				System.out.print('*');
			}System.out.println();
		}
		
		
//		8. a�� b�� ������ c�� ����
		int a8[]= {10,20,30}, b8[] = {40,50,60}, c8[] = new int[a8.length+b8.length];
		char num[] = {'0','1','2','3','4','5'};
		for(int i=0;i<(a8.length+b8.length);i++) {
			switch (i%2) {
			case 0: {
				c8[i] = a8[i/2];
				System.out.printf("%c�� �ּ�: %d	",num[i],c8[i]); continue;
			}
			case 1: {
				c8[i] = b8[(i-1)/2];
				System.out.printf("%c�� �ּ�: %d	",num[i],c8[i]); continue;
			}
			}
		}
		
		
//		9. ��ȭ�� �¼�����(�¼� ��: 7��)
		/*	����ڷκ��� �¼���ȣ(index)�� �Է� �޾� �����ϴ� �ý���.
		 *	���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� ����
		 *	�̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 *	�� �¼��� ���� ������ 12,000���̴�.
		 *	���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
		 */
		int nseat=7, a9, price = 12000;
		int seat[] = new int[nseat];
		String cseat[] = new String[nseat];
		for(int i=0;i<nseat;i++) cseat[i] = "���Ű���";
//		String cseat[] = {"���Ű���","���Ű���","���Ű���","���Ű���","���Ű���","���Ű���","���Ű���"};
		while(true) {
			System.out.printf("�¼� ��Ȳ\n");
			for(int i=0;i<seat.length;i++) {
				System.out.printf("%d��: %s	",i+1,cseat[i]);
				if (i==4) System.out.println();
			}
			System.out.printf("\n�¼� ����: ");;
			a9 = scan.nextInt()-1;
			
			if(seat[a9] != 1) {
				seat[a9] = 1;
				cseat[a9] = "���źҰ�";
				System.out.printf("�¼�%d ���ſϷ�\n",a9+1);
			}
			else System.out.println(cseat[a9]);
			System.out.println("1. ���\n0. ����");
			int quit = scan.nextInt();
			if (quit == 0) break;
		}
		
		int count = 0;
		for(int i=0;i<seat.length;i++) {
			if(seat[i]!=0) count++;
		}System.out.printf("���� ����: %d,000",price*count/1000);
		
		
		
		scan.close();
	}

}

package ch05_practice;

import java.util.Scanner;

public class parctice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	�迭�� ����� �л� ������ ����
		 * - �л� 5�� name[] = {"��浿","��浿","�̱浿","�ڱ浿","ȫ�浿"};
		 * - ���� 3�� sub[] = {"����","����","����"} -> �л��� ���� 3�� score[] = { , , }
		 * -1. �л� �̸����� �������� ������ ��ȸ
		 * -2. ��ü �л� ������ ���񺰷� ��ȸ
		 * -3. �� �л��� ��� �������� ���� ��ȸ
		 * �������� ������ �޴��� �ݺ������� ��� menu[] = {"�����Է�","������ȸ","������ȸ","����"}
		 * ���� ��ȸ �� ���κ� ������ȸ & ���� ��ü ������ȸ
		 */
/*q
59 59 59
54 26 90
90 88 82
01 45 23
76 66 86
*/
		String name[] = {"��浿","��浿","�̱浿","�ڱ浿","ȫ�浿"},
				sub[] = {"����","����","����"},
				menu[] = {"����","������ȸ","������ȸ","��������"};
		int score[][] = new int[name.length][sub.length],
			sum[] = new int[name.length],
			rank[] = new int[name.length];
		double avg[] = new double[name.length];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
			
			System.out.print("\t");
			for(int j=0;j<sub.length;j++) {
				System.out.printf("%s ",sub[j]);
			}
			
			System.out.printf("\n%s:    ",name[i]);
			for(int j=0;j<sub.length;j++) {
				int s = scan.nextInt();
				score[i][j] = s;
			}
		}
		
		for(int i=0;i<name.length;i++) {
			sum[i]=0;
			for(int j=0;j<sub.length;j++) {
				sum[i]+=score[i][j];
			}
			avg[i] = (double)sum[i]/sub.length;
		}
		rank = new int[name.length];
		for(int i=0;i<name.length;i++){
			rank[i]++;
			for(int j=0;j<name.length;j++) {
				if(sum[i]<sum[j]) rank[i]++;
			}
		}
		
		
		while (true) {
			System.out.printf("\n1.%s 2.%s 3.%s 0.%s\n: ",menu[1],menu[2],menu[3],menu[0]);
			int a = scan.nextInt(), b;
			switch (a) {
			
			case 1:
				System.out.println("  ������ȸ");
				System.out.print("1. ���μ���  2.���� ��ü����\n: ");
				b = scan.nextInt();
				if (b==1) {
					System.out.println("���μ���");
					for(int i=0;i<name.length;i++)	System.out.printf("%d.%s\t",i,name[i]);
					System.out.println(": ");
					b = scan.nextInt();
					System.out.print("\t");
					for(int i=0;i<sub.length;i++)	System.out.printf("%s\t",sub[i]);
					System.out.printf("\n%s\t",name[b]);
					for(int i=0;i<sub.length;i++)	System.out.printf("%2d\t",score[b][i]);
				}
				
				else if(b==2) {
					System.out.println("���� ��ü����");
					for(int i=0;i<sub.length;i++)	System.out.printf("%d.%s\t",i,sub[i]);
					System.out.println(": ");
					b = scan.nextInt();
					System.out.printf("\t%s",sub[b]);
					for(int i=0;i<name.length;i++)	System.out.printf("\n%s\t%2d",name[i],score[i][b]);
					
				} else System.out.println("error");
				break;
				
			case 2:
				System.out.println("\t����");
				for(int i=0;i<name.length;i++)	System.out.printf("%s\t%d\n",name[i],rank[i]);
				break;
				
			case 3:
				System.out.println("��������");
				for(int i=0;i<name.length;i++) {
					System.out.printf("%d.%s ",i,name[i]);
				}
				System.out.print("\n: ");
				b = scan.nextInt();
				System.out.printf("%s: ",name[b]);
				for(int i=0;i<sub.length;i++) {
					System.out.printf("%d.%s ",i,sub[i]);
				}
				System.out.print("\n: ");
				int c = scan.nextInt();
				System.out.printf("\'%s\' <%s>���� ����: ",name[b],sub[c]);
				score[b][c] = scan.nextInt();
				
				sum[b]=0;								// ���� ����
				for(int j=0;j<sub.length;j++) {
					sum[b]+=score[b][j];
				}
				avg[b] = (double)sum[b]/sub.length;		// ��� ����
				
				rank = new int[name.length];			// ���� ����
				for(int i=0;i<name.length;i++){
					rank[i]++;
					for(int j=0;j<name.length;j++) {
						if(sum[i]<sum[j]) rank[i]++;
					}
				}
				break;
				
			case 0:
				System.out.print("exit");break;
				
			default:
				System.out.println("error");break;
			}
			if (a==0) break;
		}
		

	}

}

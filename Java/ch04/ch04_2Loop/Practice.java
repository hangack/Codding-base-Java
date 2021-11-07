package ch04_2Loop;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1~100 sum
		int i,isum=0;
		for(i=1;i<=100;i++) isum +=i;
		System.out.printf("sum:%4d\n",isum);
		
		//2. 1~100 sum���� sum>1000 �� �� break.
		i=0;isum=0;
		for(i=1;i<=100;i++) {
			isum +=i;
			if(isum>=1000) break;
		}
		System.out.printf("sum:%4d\n",isum);
		Scanner scan = new Scanner(System.in);
		//3. �α��� ��� ����	id:	'grean',	pw: '123456'
		String IDs = "grean",PWs = "123456",id,pw;
		System.out.println("Id: ");
		id = scan.next();
		System.out.println("Pw: ");
		pw = scan.next();
		if (!(IDs.equals(id))) {
			System.out.println("error: ID mismatched");
		} 
		if (!(PWs.equals(pw))) {
			System.out.println("error: wrong PW");
		}
		else System.out.println("logged in");
//		if ((IDs.equals(id))&&(PWs.equals(pw))) {
//		System.out.println("logged in");
//		else System.out.println("error: ID or PW mismatched" );
		
		
		//4. ������ ¦���� ���
		int times;
		for(times=2;times<=9;times++) {
			if(times%2!=0) continue;
			System.out.printf("%dtimes\n",times);
			for(i=1;i<=9;i++) {
				System.out.printf("%2d*%2d=%3d\n",times,i,times*i);
			}
		}
		
		
		//5. ����������
		int game = (int)(Math.random()*3),play = 1000;
		String com= " ",player;
		switch (game) {
		case 0: com = "����"; break;
		case 1: com = "����"; break;
		case 2: com = "��"; break;
		default: System.out.println("computer's error"); 
		}
		System.out.print("����,����,��: ");
		player = scan.next();
		switch (player) {
		case "����": play = 0; break;
		case "����": play = 1; break;
		case "��": play = 2; break;
		default: System.out.println("player's error");
		}
		System.out.printf("computer: %s\n",com);
		if (((play-game) == -1)||((play-game) == 2)) System.out.println("you lose");
		else if((play-game) == 0) System.out.println("draw");
		else if(((play-game) == 1)||((play-game) == -2))System.out.println("winner winner");
		
		
		/*6. ���� ���� {���� ��� �ܾ���ȸ ����}
		 * 	�� �޴� ���ý� �ش� ����� �����ϵ��� �ۼ�
		 *	 ���� ���ý� �Ա� �ݾ��� �Է��ϸ� "���ݿϷ�" ��� �� �ٽ� �޴� ȣ��
		 *	 ��� ���ý� ��� �ݾ��� �Է��ϸ� �ܾװ� ���ؼ� �ܾ׺��� ���� �ݾ� ��ݽ� "�ܾ� ����"
		 *	�ܾ��� ������� "��� �Ϸ�" �޼��� ��� �� �ٽ� �޴� ȣ��
		 *	 �ܾ���ȸ ���ý� "�ܰ�: \\\��" ��� �� �޴� ȣ��
		 *	 ���� ���ý�: "���α׷� ����" �޼��� �˾� �� ����
		 *	 �׿� �޴� ���ý� "error" �޼��� ��� �� �ٽ� �޴� ȣ��
		 */
		String menu="���";
		int money=0, account=100000;
//		while (!(menu.equals("����"))) {
		while (true) {
			System.out.print("���� ��� �ܾ���ȸ ����: ");
			menu=scan.next();
			if(menu.equals("����")) {
				System.out.print("�ݾ�: ");
				money = scan.nextInt();
				account+=money; continue;
			}
			else if(menu.equals("���")) {
				System.out.print("�ݾ�: ");
				money = scan.nextInt();
				if (money>account) {
					System.out.println("�ܾ� ����");
				}
				else {
					System.out.println("��� �Ϸ�");
					account -= money;	continue;
				}
			}
			else if(menu.equals("�ܾ���ȸ")) {
				System.out.printf("�ܰ�: %8d\n",account); continue;
			}
			else if(menu.equals("����")) {
				System.out.println("���α׷� ����"); break;
			}
			else System.out.println("error: menu");
			
		}
		
		
		
		
		
		scan.close();
	}

}

package Practice;

public class Practice_05 {
	static String[] account = new String[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu, task;
		boolean tf = true;
		Account ac = new Account();
		
		while(tf) {
			System.out.print("1.���»���  2.�����   0.����\n: ");
			menu = ac.scan.nextInt();
			
			if(menu == 0) {
				System.out.println("����");
				tf = false;
			}
				
			else if(menu == 1) {
				System.out.print("������: ");
				account[0] = ac.scan.next();
				System.out.print("���¹�ȣ: ");
				account[1] = ac.scan.next();
				System.out.print("���ݾ�: ");
				account[2] = ac.scan.next();
				ac.user(account[0], account[1], Integer.parseInt(account[2]));
			}
			
			else if(menu == 2) {
				System.out.print("���¹�ȣ�Է�: ");
				if(ac.scan.next().equals(account[1])){
					System.out.print("1.�Ա�\t2.���\t3.�ܾ���ȸ\n: ");
				
					task = ac.scan.nextInt();
					if (task == 1) {
						ac.deposit();
					}
					else if(task == 2) {
						ac.withdraw();
					}
					else if(task == 3) {
						System.out.println("�ܰ�: "+ac.balance);
					}else System.out.println("error");
				
				}else System.out.println("error");
			}else System.out.println("�̵�� ����");
		}
		ac.scan.close();
	}

}

package ch09_1Extends;

public class Extends_1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child01 child = new Child01("�ڹ���", "����", 10);		//�ڽ� Ŭ���� ��� -> �θ� ��ü �Բ� ����
		
		//�θ� Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��ӹ��� ��: "+child.model);
		System.out.println("��ӹ��� ����: "+child.color);
		//�ڽ� Ŭ���� �ʵ�
		System.out.println("�ڽ� Ŭ���� ä��: "+child.channel);
		
		//��ӹ��� �޼ҵ� ȣ��
		child.powerOn();
		child.bell();
		child.sendVoice("�ȳ��ϼ���");
		child.receiveVoice("�ȳ��ϼ���~");
		child.sendVoice("���� �� �����Ű���?");
		child.hongUp();
		
		//�ڽ�Ŭ���� �޼ҵ� ȣ��
		child.turnOn();
		child.changeChannel(56);
		child.turnOff();

	}

}

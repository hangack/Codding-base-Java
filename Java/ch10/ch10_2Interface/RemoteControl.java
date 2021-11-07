package ch10_2Interface;

public interface RemoteControl {
	//��� (public static final)�� interface �ʵ��� �⺻��
	//�������̽� ������ �빮�ڿ� _�� �ۼ��ϴ°� �������
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//interface���� �޼ҵ�� �߻� Ŭ���� ����(Abstract)�� ����Ѵ�. 
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}

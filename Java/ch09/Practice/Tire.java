package Practice;

public class Tire {
	int maxRoll,countRoll;
	String locate;
	Tire(){}
	Tire(String locate, int num){
		this.locate = locate;
	}
	
	boolean roll() {
		if(countRoll<maxRoll) {
			System.err.println(locate+"Ÿ�̾����: "+countRoll+"/"+maxRoll);
			countRoll++;
			return true;
		}else {
			System.out.println(locate+"Ÿ�̾� ��ü �ʿ�");
			return false;
		}
	}

}

class HankookTire extends Tire{
	
}

class KumhoTire extends Tire{
	
}

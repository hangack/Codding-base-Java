package class_1;

public class Class_TV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.OnOff = true;
		System.out.printf("tv ä��: %d, ����: %d, ������: %b\n", tv.channel, tv.volume, tv.OnOff);
		

		Television mytv,urtv;
		mytv = new Television();
		urtv = new Television();
		mytv.channel = 7; urtv.channel = 9;
		mytv.volume = 9; urtv.volume = 12;
		mytv.OnOff = true; urtv.OnOff = false;
		
		System.out.printf("MY; ä��:%3d, ����:%3d, ������:%5b\n",mytv.channel,mytv.volume,mytv.OnOff);
		System.out.printf("UR; ä��:%3d, ����:%3d, ������:%5b\n",urtv.channel,urtv.volume,urtv.OnOff);

		mytv.tv();
		urtv.tv();

//		int ch = mytv.channal
		int ch = mytv.ch_get();
		System.out.printf("����ä��: %d\n", ch);
		mytv.ch_set(11);
		ch = mytv.ch_get();
		System.out.printf("����ä��: %d\n", ch);
		
	}
}

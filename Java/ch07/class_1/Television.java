package class_1;

public class Television {
	int channel, volume;
	boolean OnOff;

	public void tv() {
		System.out.printf("MY; ä��:%3d, ����:%3d, ������:%5b\n",channel,volume,OnOff);
	}
	
	int ch_get() {
		return channel;
	}
	void ch_set(int set) {
		channel = set;
	}

}

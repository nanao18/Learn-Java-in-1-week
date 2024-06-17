package problemex1;
 
public class Counter {
	//	カウント
	private int count = 0;
	private static int totalCount = 0;
	//	コンストラクタ
	public void reset(){
		totalCount = totalCount - count;
		count = 0;
	}
	//	カウント
	public void count(){
		totalCount++;
		count++;
	}
	//	値の取得
	public int getCount(){
		return count;
	}

	public static int getTotalCount(){
		return totalCount;
	}
 
}

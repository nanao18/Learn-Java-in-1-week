package problem3;

public class Problem3_18 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(45))-10; 	//( 最大値 - 最小値 ) + 最小値
		System.out.println("摂氏"+ num +"度");
		if(num >= 30){
			System.out.println("真夏日です。");
		} else if(num >= 25){
			System.out.println("夏日です。");
		} else if(num < 0){
			System.out.println("真冬日です。");
		}
	}
}

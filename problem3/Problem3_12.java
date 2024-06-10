package problem3;

public class Problem3_12 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)-10;
		System.out.println(num);
		if(num < 0){
			System.out.println("負の値です");
		} else if(num > 0){
			System.out.println("正の値です");
		} else {
			System.out.println("0です");
		}
	}
}

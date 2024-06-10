package problem4;

public class Problem4_14{

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		String str;
		if(num%2 == 0) {
			str = "★";
		} else {
			str = "☆";
		}
		for(int i=1; i<=num; i++) {
			System.out.print(str);
		}
	}
}

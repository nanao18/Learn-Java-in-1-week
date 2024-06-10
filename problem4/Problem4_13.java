package problem4;

public class Problem4_13{

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		if(num < 5) {
			System.out.println("発生した数値："+ num);
		} else {
			for(int i=1; i<=num; i++) {
				System.out.print("★");
			}
		}
	}
}

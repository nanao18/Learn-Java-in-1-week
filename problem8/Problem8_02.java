package problem8;

public class Problem8_02{

	public static void main(String[] args) {
		//ピタゴラス数（Pythagorean triple）重複なし
		for(int c=1; c<=100; c++) {
			for(int b=1; b<c; b++) {
				for(int a=1; a<b; a++) {
					if(a*a + b*b == c*c) {
						System.out.println("("+ a +","+ b +","+ c +")");
					}
				}
			}
		}
	}
}

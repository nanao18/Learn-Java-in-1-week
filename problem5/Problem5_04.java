package problem5;

public class Problem5_04{

	public static void main(String[] args) {
		int data[] = new int[10];	//大きさは実行結果の例に合わせている
		for(int i=0; i<a.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数 : ");
		for(int i=0; i<a.length; i++) {
			if(data[i] >= 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数 : ");
		for(int i=0; i<a.length; i++) {
			if(data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println()
	}
}

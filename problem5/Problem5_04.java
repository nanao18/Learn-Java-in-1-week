package problem5;

public class Problem5_04{

	public static void main(String[] args) {
		//実行結果の例に合わせて、「大きさは、10」「値は、1から100の乱数」
		int data[] = new int[10];
		for(int i=0; i<data.length; i++) {
			data[i] = (int)(Math.random()*100)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数 : ");
		for(int i=0; i<data.length; i++) {
			if(data[i] >= 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数 : ");
		for(int i=0; i<data.length; i++) {
			if(data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println()
	}
}

package problem5;

public class Problem5_13{

	public static void main(String[] args) {
		int data[][] = new int[3][3];
		int max = 0;
		int min = 0;
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j] = (int)(Math.random()*9);
				System.out.print(data[i][j] + " ");
				max = Math.max(max, data[i][j]);
				min = Math.min(min, data[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}

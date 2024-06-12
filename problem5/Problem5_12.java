package problem5;

public class Problem5_12{

	public static void main(String[] args) {
		int data[][] = new int[3][3];
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j] = (int)(Math.random()*9);
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}

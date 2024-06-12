package problem5;

public class Problem5_10{

	public static void main(String[] args) {
		int data[] = new int[7];
		for(int i=0; i<a.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();

		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<data[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package problem5;

public class Problem5_05{

	public static void main(String[] args) {
		int data[] = new int[10];
		for(int i=0; i<a.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("3の倍数 : ");
		for(int i=0; i<a.length; i++) {
			if(data[i]%3 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("3の倍数以外の数 : ");
		for(int i=0; i<a.length; i++) {
			if(data[i]%3 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println()
	}
}

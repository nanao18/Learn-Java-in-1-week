package problem5;

public class Problem5_08{

	public static void main(String[] args) {
		int data[] = new int[5];
		int plus = 0;
		int minus = 0;
		int zero = 0;
		for(int i=0; i<data.length; i++) {
			data[i] = (int)(Math.random()*20)-10;
			System.out.print(data[i] + " ");
			if(data[i] > 0) {
				plus++;
			} else if(data[i] < 0) {
				minus++;
			} else {
				zero++;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("0より大きい数 : " + plus + "個");
		System.out.println("0より小さい数 : " + minus + "個");
		System.out.println("0の個数 : " + zero + "個");
	}
}

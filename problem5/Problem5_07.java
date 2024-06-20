package problem5;

public class Problem5_07{

	public static void main(String[] args) {
		int data[] = new int[5];
		int sum = 0;
		int avg = 0;
		for(int i=0; i<data.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
			sum += data[i];
		}
		avg = sum / data.length;

		System.out.println();
		System.out.println("合計値 : " + sum);
		System.out.println("平均値 : " + avg);

		System.out.println();
		System.out.print("平均値より大きい数 : ");
		for(int i=0; i<data.length; i++) {
			if(data[i] > avg) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい数 : ");
		for(int i=0; i<data.length; i++) {
			if(data[i] < avg) {
				System.out.print(data[i] + " ");
			}
		}
	}
}

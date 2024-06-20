package problem5;

public class Problem5_06{

	public static void main(String[] args) {
		int data[] = new int[10];
		int sum = 0;
		int max = 0;
		int min = 0;
		for(int i=0; i<data.length; i++) {
			data[i] = (int)(Math.random()*100)+1;
			System.out.print(data[i] + " ");
			sum += data[i];
			max = Math.max(max, data[i]);
			min = Math.min(min, data[i]);
		}
		System.out.println();
		System.out.println("最大値 : " + max);
		System.out.println("最小値 : " + min);
		System.out.println("平均値 : " + sum / data.length);
	}
}

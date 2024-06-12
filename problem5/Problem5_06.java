package problem5;

public class Problem5_06{

	public static void main(String[] args) {
		int data[] = new int[10];
		int sum;
		int max;
		int min;
		for(int i=0; i<a.length; i++) {
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

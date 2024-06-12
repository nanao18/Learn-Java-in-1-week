package problem5;

public class Problem5_11{

	public static void main(String[] args) {
		int data[] = new int[5];
		String a = "";
		String b = "";
		String c = "";
		for(int i=0; i<data.length; i++) {
			data[i] = (int)(Math.random()*100)+1;
			System.out.print(data[i] + " ");
			if(data[i] >= 0 && data[i] < 60) {
				a += data[i] + " ";
			} else if(data[i] >= 60 && data[i] < 80) {
				b += data[i] + " ";
			} else {
				c += data[i] + " ";
			}
		}
		System.out.println();

		System.out.println();
		System.out.println("0以上60未満 : " + a);
		System.out.println("60以上80未満 : " + b);
		System.out.println("80以上：" + c);
	}
}

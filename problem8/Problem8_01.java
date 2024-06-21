package problem8;

public class Problem8_01{

	/* ピタゴラス数（Pythagorean triple）
	 * ★重複あり
	 * ①　(3,4,5) と順番が違うだけの (4,3,5) が出てくる。（合同な三角形）
	 * ②　(3,4,5) の整数倍 (6,8,10) などが出てくる。（相似な三角形）
	 * ③　表示される順番が不自然。(13,84,85) の後に (20,21,29) が出てくる。
	 * ④　大きい数まで出そうとすると時間がかかりすぎる。
	 */
	public static void main(String[] args) {
		for(int a=1; a<=100; a++) {
			for(int b=1; b<=100; b++) {
				for(int c=1; c<=100; c++) {
					if(a*a + b*b == c*c) {
						System.out.println("("+ a +","+ b +","+ c +")");
					}
				}
			}
		}
	}
}

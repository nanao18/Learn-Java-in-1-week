package problem8;

public class Problem8_02{

	/* ピタゴラス数（Pythagorean triple）
	 * ★重複なし（Problem8_01に比べて①と③を解決）
	 * ①　(3,4,5) と順番が違うだけの (4,3,5) が出てくる。（合同な三角形）
	 * ②　(3,4,5) の整数倍 (6,8,10) などが出てくる。（相似な三角形）
	 * ③　表示される順番が不自然。(13,84,85) の後に (20,21,29) が出てくる。
	 * ④　大きい数まで出そうとすると時間がかかりすぎる。
	 */
	public static void main(String[] args) {
		for(int c=1; c<=100; c++) {
			for(int b=1; b<=c; b++) {
				for(int a=1; a<=b; a++) {
					if(a*a + b*b == c*c) {
						System.out.println("("+ a +","+ b +","+ c +")");
					}
				}
			}
		}
		System.out.println();
		System.out.println("③も解決させる場合");
		//参考：https://note.com/omori55/n/naa25826c3f90
		boolean chk;
		for(int c=1; c<=100; c++) {
			for(int b=1; b<=c; b++) {
				for(int a=1; a<=b; a++) {
					if(a*a + b*b == c*c) {
						chk = true;
						for(int i=2; i<=a; i++) {
							if(a%i==0 && b%i==0 && c%i==0) {
								chk = false;
							}
						}
						if(chk) {
							System.out.println("("+ a +","+ b +","+ c +")");
						}
					}
				}
			}
		}
		
	}
}

package class5;
 
public class SampleClass01 {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "one,two,three";
		String str2 = "apple orange pineapple";
		String[] strarray1 = str1.split(",");	// ","を基準に文字列を分割し配列に格納
		String[] strarray2 = str2.split(" ");	// スペースを基準に文字列を分割し配列に格納
		//拡張forループを使って配列の中身を出力
		for(String s : strarray1){
			System.out.println(s);
		}
		System.out.println();
		for(String s : strarray2){
			System.out.println(s);
		}
	}
 
}

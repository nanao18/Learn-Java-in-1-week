package class6;
 
public class SampleClass2 {
 
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Apple ");		//オブジェクトを生成
		sb.append("Piniapple"); 	//	文字列を末尾に追加
		sb.insert(6,"Banana "); 	//	文字列を末尾に追加
		System.out.println(sb); 	//	内容を表示
	}
 
}

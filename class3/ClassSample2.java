package class3;
 
import java.io.*;
 
public class ClassSample2 {
 
	public static void main(String[] args) {
		PrintWriter pw = null;
		//FileWriterオブジェクトを生成する際にIOExceptionがスローされる可能性がある
		try {
			//PrintWriterクラスでラップしてコマンドライン引数でファイルを指定
			pw = new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.println("Line1");
		pw.println("Line2");
		pw.flush(); 			//	フラッシュ処理
		System.out.println("Data Writing Finished.");
		//pw.close();
	}
 
}

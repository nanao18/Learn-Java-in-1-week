package class3;
 
import java.io.*;
 
public class ClassSample1 {
 
	public static void main(String[] args) {
		PrintWriter pw = null;
		//FileWriterオブジェクトを生成する際にIOExceptionがスローされる可能性がある
		try {
			//PrintWriterクラスでラップしてコマンドライン引数でファイルを指定
			pw = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.print("printによる出力（改行なし）:");	   //print()メソッドで出力
		pw.println("printlnによる出力(改行あり)");		 //println()メソッドで出力
		pw.printf("printfによる出力 %s",5); 			 //printf()メソッドで出力
		System.out.println("Data Writing Finished.");
 
		pw.close();
	}
 
}

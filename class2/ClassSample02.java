package class2;
 
import java.io.*;
 
public class ClassSample2 {
 
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String s;
				System.out.print("InputData（q : finish） ： ");
				s = br.readLine();
				//	qが入力されたら終わり
				if(s.equals("q")){
					break;
				}
				System.out.println("Input Data:" + s);
				System.out.println();
			}
		}catch(IOException e2){
			System.out.println("IOエラー");
		}finally{
			try{
				if(br != null) br.close();
			}catch(IOException e){
				System.out.println("IOエラー");
			}
		}
	}
 
}

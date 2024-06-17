package problemex1;
 
public class Problemex1_3 {
 
	public static void main(String[] args) {
		int row = (int)(Math.random() * 10)  + 1; 
		int col = (int)(Math.random() * 10)  + 1; 
		System.out.println("たて：" + row);
		System.out.println("よこ：" + col);
		System.out.println();
		square(row,col);	//	二つの数の積を求める
	}

	static void square(int row,int col){
		if(row > 0 && col > 0) {
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					System.out.print("■");
				}
				System.out.println();
			}
		}
	}
}

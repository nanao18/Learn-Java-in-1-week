package problemex1;
 
public class Problemex1_1 {
 
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10)  + 1; 	//	1～10の乱数を発生
		int b = (int)(Math.random() * 10)  + 1; 	//	1～10の乱数を発生
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a + " + " + b + " = " + add(a,b));
		System.out.println(a + " - " + b + " = " + minus(a,b));
	}
	//	足し算
	static int add(int a,int b){
		return a + b;
	}
	//	引き算
	static int minus(int a,int b){
		return a - b;
	}
}

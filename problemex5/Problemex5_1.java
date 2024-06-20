package problemex5;

import java.util.ArrayList;

public class Problemex5_1 {
	public static void main(String[] args) {
		int num;
		ArrayList<Integer> eve = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		while(true) {
			num = (int)(Math.random()*10)+1;
			System.out.println("0～10の値を出力:" + num);
			if(num == 0) {
				break;
			}
			if(num%2 == 0) {
				eve.add(num);
			}
			if(num%2 != 0) {
				odd.add(num);
			}
		}
		System.out.println();
		System.out.print("偶数 :");
		for(Integer i : eve){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("奇数 :");
		for(Integer i : odd){
			System.out.print(i + " ");
		}
	}
}

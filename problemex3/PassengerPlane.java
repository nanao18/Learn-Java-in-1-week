package problemex3;
 
//	旅客機クラス
public class PassengerPlane extends AirPlane{
	//	コンストラクタ（引数なし）
	public PassengerPlane(){
		super("旅客機");
	}
	//	飛行する
	public void fly(){
		System.out.println("乗客を乗せて目的地まで飛行します。");
	}
	//	戦闘する
	public void carryPassengers(){
		System.out.println("乗客を目的地まで運びます。");
	}
}

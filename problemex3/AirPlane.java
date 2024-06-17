package problemex3;
 
public abstract class AirPlane{
	//タイプフィールド
	private String type;
	//	引数つきコンストラクタ
	AirPlane(String type) {
		this.type = type;
	}
	//	タイプの取得
	public String getType(){
		return type;
	}
	//	飛行する
	public abstract void fly();
}

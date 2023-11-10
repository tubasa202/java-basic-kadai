package kadai_017;

abstract public class Kato_Chapter17 {
	
	//姓フィールド
	public String familyName ;
	
	//名を表すフィールド
	public String givenName;
	
	//住所を表すフィールド
	public String address;
	
	//共通の紹介メソッド
	public void commonlntroduce() {
		System.out.println("名前は"+familyName + givenName +"です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介メソッド
	public abstract void eachIntroduce();

	public void execlntroduce() {
		commonlntroduce();
		eachIntroduce();
	}
}

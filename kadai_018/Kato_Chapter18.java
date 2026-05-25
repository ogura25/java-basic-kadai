package kadai_018;//親クラス（設計図）

abstract public class Kato_Chapter18 {
	
	public String FamilyName ="加藤";
	public String givenName ="";
	public String address ="東京都中野区〇×";
	
	
	
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + FamilyName+  givenName +"です");
		System.out.println("住所は" + address+ "です");
	}
	
	//★抽象メソッド　個別の紹介を出力
	abstract public void eachIntroduce();
	
	//紹介を実行するメソッド
	public void execIntroduce () {
		commonIntroduce();
        eachIntroduce();
	}

}

package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//		コンストラクト　クラス名同じ
	public  Dictionary_Chapter21 (String [] keyDateArray) {
		HashMap<String,String> dictionary = new HashMap <String,String>();
		//値のデータを持つ
	
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
	
		
		for(String shi : keyDateArray) {
			String val= dictionary.get(shi);
			
			if(val!=null) {
				System.out.println(shi +"の意味は" + val );	
				
			}
			else {
				System.out.println(shi + "は辞書に存在しません");	
				
			}
		}
	

	

}
}
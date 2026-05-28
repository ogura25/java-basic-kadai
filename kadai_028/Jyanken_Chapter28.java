package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 { 
	

	public String getMyChoice(){
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//自分のじゃんけんの手を入力する
		Scanner scanner = new Scanner(System.in);
		
	     //入力した内容を取得する
	      
	      while(true) {
	    	  String input = scanner.next();
	    	  if(input.equals("r") ||
	      
	    		  input.equals("s")||
	    		  input.equals("p")) {
	    	  return input;
	    	  }
	    	  System.out.println("正しいじゃんけんの手を入力してください");
	      }

	   }

		
	public String getRandom(){
	    // じゃんけんの手を配列に入れる
	    String[] choices = {"r", "s", "p"};

	    // 0〜2 の乱数を作る
	    int random = (int)Math.floor(Math.random() * 3);

	    // 配列からランダムな手を返す
	    return choices[random];
		
		
	}
	
	
	
	public void playGame(){
		
		// 自分の手を取得
	    String myChoice = getMyChoice();

	    // 相手の手を取得
	    String randomChoice = getRandom();

	    // じゃんけんの手を日本語に変換するHashMap
	    HashMap<String, String> map = new HashMap<>();

	    map.put("r", "グー");
	    map.put("s", "チョキ");
	    map.put("p", "パー");

	    // 手を表示
	    System.out.println(
	        "自分の手は" + map.get(myChoice) +
	        ",対戦相手の手は" + map.get(randomChoice)
	    );

	    // 勝敗判定
	    if (myChoice.equals(randomChoice)) {

	        System.out.println("あいこです");

	    } else if (
	        (myChoice.equals("r") && randomChoice.equals("s")) ||
	        (myChoice.equals("s") && randomChoice.equals("p")) ||
	        (myChoice.equals("p") && randomChoice.equals("r"))
	    ) {

	        System.out.println("自分の勝ちです");

	    } else {

	        System.out.println("自分の負けです");
	    }
		
	}
	
}

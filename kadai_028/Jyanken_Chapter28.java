package kadai_028;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter28 {



//自分のじゃんけんの手をに入力
	public String getMyChoice() {
		Scanner scanner=new Scanner(System.in);
		String input = "";

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			input = scanner.nextLine();

			if (input.equals("r") || input.equals("s") || input.equals("p")) {
	            return input;
	        } else {
	            System.out.println("エラー：r / s / p のいずれかを入力してください");
	        }
	    }

	   
	}
		
		
//相手のじゃんけんの手を乱数で入力

	public String getRandom() {
		 String[] hands = {"r", "s", "p"};
		 return hands[(int)(Math.random() * 3)];
		
	}
	
	
	//じゃんけんを行う
	public void playGame(String myHandKey, String opponentHandKey) {
		 // HashMapで手を管理
	    HashMap<String, String> handMap = new HashMap<>();
	    handMap.put("r", "グー");
	    handMap.put("s", "チョキ");
	    handMap.put("p", "パー");
	    
	    
	    
	 // キーから手に変換
	    String myHand = handMap.get(myHandKey);
	    String opponentHand = handMap.get(opponentHandKey);
	    
	 // 入力チェック
	    if (myHand == null || opponentHand == null) {
	        System.out.println("エラー：無効な手が入力されました");
	        return;
	    }
	    
	 // 手の表示
	    System.out.print("あなたの手は " + myHand);
	    System.out.println("相手の手は " + opponentHand);
	    
	    // 勝敗判定
	    if (myHandKey.equals(opponentHandKey)) {
	        System.out.println("あいこです");
	    } else if (
	        (myHandKey.equals("r") && opponentHandKey.equals("s")) ||
	        (myHandKey.equals("s") && opponentHandKey.equals("p")) ||
	        (myHandKey.equals("p") && opponentHandKey.equals("r"))
	    ) {
	        System.out.println("自分の勝ちです");
	    } else {
	        System.out.println("自分の負けです");
	    }

		}
	
}

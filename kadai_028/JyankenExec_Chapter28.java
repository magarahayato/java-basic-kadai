package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken=new Jyanken_Chapter28();
		
		 // 自分の手を入力
        String myHand = jyanken.getMyChoice();

        // 相手の手をランダム取得
        String opponentHand = jyanken.getRandom();

        // じゃんけん実行（←これが重要）
        jyanken.playGame(myHand, opponentHand);
	}

}

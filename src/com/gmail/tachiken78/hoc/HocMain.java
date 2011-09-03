package com.gmail.tachiken78.hoc;

public class HocMain {
	private static int playerCount;
	private static int turnPlayer;

	public static void main(String[] args) {
		decidePlayerNumber();

		initializeSystem();

		selectMarketSet();

		initializeMarket();

		decideFirstPlayer();

		prepearHandOfEachPlayer();

		while(true){
			doTurn();
			if(isGameEnd()){
				break;
			}
			turnPlayer++;
			if(turnPlayer > playerCount){
				turnPlayer = 1;
			}
		}

		finalizeSystem();
		return;
	}

	/**
	 * システム全体の初期化処理を行う。
	 * このメソッドは１度だけ呼ばれることを想定している。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int initializeSystem() {
		return 0;
	}

	/**
	 * システム全体の終了処理を行う。
	 * このメソッドは１度だけ呼ばれることを想定している。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int finalizeSystem() {
		return 0;
	}

	/**
	 * そのゲームで使用するマーケットセットを選択＆決定する。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int selectMarketSet()
	{
		return 0;
	}

	/**
	 * マーケットの初期化処理を行う。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int initializeMarket() {
		/* TODO: サプライのシャッフル */
		/* TODO: ベーシックマーケットの準備（枚数設定など） */

		/* ランダムマーケットの補充 */
		refillMarket();
		return 0;
	}

	/**
	 * 何人でプレーするかを決定する。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int decidePlayerNumber() {
		/* COMMENT: 今は２人固定としておく */
		playerCount = 2;
		return 0;
	}

	/**
	 * 最初のターンプレーヤーを決定する。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int decideFirstPlayer() {
		/* COMMENT: ひとまず何も考えずに１番のプレーヤーをファーストプレーヤーとする */
		turnPlayer = 1;
		return 0;
	}

	/**
	 * 各プレーヤの初期手札を準備する。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int prepearHandOfEachPlayer()
	{
		return 0;
	}

	/**
	 * ターン進行処理を行う。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int doTurn() {
		return 0;
	}

	/**
	 * ゲーム終了判定を行う。
	 * @return ゲームが終了したと判定されればtrue。それ以外はfalseを返す。
	 */
	private static boolean isGameEnd() {
		/* TODO: ゲーム終了判定を実装 */
		return false;
	}

	/**
	 * ランダムマーケットの補充処理を行う。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int refillMarket() {
		/* 山が８個あれば何もせずリターン */
		/* 繰り返し ここから */
		/* サプライの残カード数が０枚であればリターン */
		/* サプライを上から１枚めくる */
		/* めくった１枚と同じカードが既に表になっていたら、その上に重ねる */
		/* めくった１枚と同じカードが表になっていなければ、新たな山を作る */
		/* 繰り返し ここまで */
		return 0;
	}
}


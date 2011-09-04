package com.gmail.tachiken78.hoc;

import java.util.EnumSet;

import com.gmail.tachiken78.hoc.cmn.obj.Card;
import com.gmail.tachiken78.hoc.cmn.obj.CardType;
import com.gmail.tachiken78.hoc.cmn.obj.Hand;
import com.gmail.tachiken78.hoc.cmn.obj.Talon;

public class HocMain {
	private static int playerCount;
	private static int turnPlayer;
	private static int totalTurn;

	private static final int MAX_PLAYER_COUNT = 4 ;
	private static final int DEFAULT_HAND_COUNT = 5 ;
	private static Talon yamafuda[];
	private static Hand tefuda[];

	private static final int TEST_PLAYER_INDEX = 0 ;

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
			if(turnPlayer >= playerCount){
				turnPlayer = 0;
				totalTurn++;
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
		totalTurn = 1;

		yamafuda = new Talon[MAX_PLAYER_COUNT];
		tefuda = new Hand[MAX_PLAYER_COUNT];
		for(int cnt=0; cnt<MAX_PLAYER_COUNT; cnt++){
			yamafuda[cnt] = new Talon();
			tefuda[cnt] = new Hand();
		}

		for(int cnt=1; cnt<8; cnt++){
			Card card = new Card("農村" + cnt, 1, EnumSet.of(CardType.領地), 1);
			yamafuda[TEST_PLAYER_INDEX].add(card);
		}
		for(int cnt=1; cnt<4; cnt++){
			Card card = new Card("見習い侍女" + cnt, 1, EnumSet.of(CardType.継承権), 2);
			yamafuda[TEST_PLAYER_INDEX].add(card);
		}
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
		/* COMMENT: 今は１人固定としておく */
		playerCount = 1;
		return 0;
	}

	/**
	 * 最初のターンプレーヤーを決定する。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int decideFirstPlayer() {
		/* COMMENT: ひとまず何も考えずに０番のプレーヤーをファーストプレーヤーとする */
		turnPlayer = TEST_PLAYER_INDEX;
		return 0;
	}

	/**
	 * 各プレーヤの初期手札を準備する。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int prepearHandOfEachPlayer()
	{
		for(int cnt=0; cnt<playerCount; cnt++){
			yamafuda[cnt].doSuffle();
			for(int i=0; i<DEFAULT_HAND_COUNT; i++){
				tefuda[cnt].add(yamafuda[cnt].drawFromTop());
			}
		}
		return 0;
	}

	/**
	 * ターン進行処理を行う。
	 * @return 正常終了時は0を返す。それ以外はエラー。
	 */
	private static int doTurn() {
		System.out.println("Turn:" + totalTurn + " 開始。");
		System.out.println("プレーヤー" + turnPlayer + "の手札:");
		tefuda[0].printAllCardInfo();
		/* メインフェイズ */
		System.out.println("メインフェイズ開始");
		while(true){
			break;
		}

		/* セカンドフェイズ */
		System.out.println("セカンドフェイズ開始");
		System.out.println("プレーヤー" + turnPlayer + "の手札:");
		tefuda[0].printAllCardInfo();
		/* TODO: ユーザにセカンドフェイズの行動選択をさせる */
		/* 1: カードの購入 */
		/* 2: 継承権カードのセット */
		/* 3: プリンセスの擁立 */

		/* クリンナップフェイズ */
		System.out.println("クリンナップフェイズ開始");
		/* TODO: 手札を全て捨て札にする */
		/* TODO: 台札を全て捨て札にする */

		/* 手札補充フェイズ */
		System.out.println("手札補充フェイズ開始");
		/* TODO: 山札から手札を補充する */

		/* マーケット補充フェイズ */
		System.out.println("マーケット補充フェイズ開始");
		refillMarket();

		return 0;
	}

	/**
	 * ゲーム終了判定を行う。
	 * @return ゲームが終了したと判定されればtrue。それ以外はfalseを返す。
	 */
	private static boolean isGameEnd() {
		/* TODO: ゲーム終了判定を実装 */
		return true;
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


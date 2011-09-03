package com.gmail.tachiken78.hoc;

import java.util.EnumSet;

/**
 * ゲームで取り扱うカードを抽象化したクラス。
 * @author tachiken
 */
public class Card {
	private String name;
	private int cost;
	private EnumSet<CardType> type;
	private int linkSymbol;
	private boolean isPublic = false;

	public Card(String name, int cost, EnumSet<CardType> type, int linkSymbol){
		this.name = name;
		this.cost = cost;
		this.type = type;
		this.linkSymbol = linkSymbol;
	}

	/**
	 * カード種別を確認するメソッド。
	 * @param checkType 確認するカード種別
	 * @return そのカードが引数に指定した種別であればtrue,そうでなければfalse
	 */
	public boolean isCardType(CardType checkType)
	{
		return type.contains(checkType);
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String toString(){
		return name;
	}
}

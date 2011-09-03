package com.gmail.tachiken78.hoc;

/**
 * 山札を表すクラス。
 * @author tachiken
 *
 */
public class Talon extends CardSet {
	public void add(Card card){
		/* 山札に加える場合、デフォルトでは非公開で末尾に加える */
		card.setPublic(false);
		list.add(card);
	}

	public Card drawFromTop(){
		Card card = list.get(0);
		list.remove(0);
		return card;
	}

	public void doSuffle(){
		java.util.Collections.shuffle(list);
		return;
	}
}

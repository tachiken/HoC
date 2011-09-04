package com.gmail.tachiken78.hoc.cmn.obj;

/**
 * 手札を表すクラス。
 * @author tachiken
 *
 */
public class Hand extends CardSet {
	public void add(Card card){
		/* 手札に加える場合、デフォルトでは非公開で末尾に加える */
		card.setPublic(false);
		list.add(card);
	}
}

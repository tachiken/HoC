package com.gmail.tachiken78.hoc.cmn.obj;

import java.util.ArrayList;

/**
 * カードの集まりを表すクラス。
 * @author tachiken
 */
public abstract class CardSet {
	protected ArrayList<Card> list;

	public CardSet(){
		list = new ArrayList<Card>();
	}

	public void printAllCardInfo(){
		for(int cnt=0; cnt<list.size(); cnt++){
			System.out.println(cnt + ":" + list.get(cnt).toString());
		}
	}
}

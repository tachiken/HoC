package com.gmail.tachiken78.hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HocMain {
	public static void main(String[] args) {
		BufferedReader L00 = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("文字列を入力してください：");
			String L01 = L00.readLine();
			System.out.printf("入力 = %s%n長さ = %d文字%n", L01, L01.length());
		} catch(IOException L02) {
			System.out.println("入力エラー");
		}
		return;
	}
}

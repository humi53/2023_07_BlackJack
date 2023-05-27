package com.ny.aenean.service.impl;

import java.util.Scanner;

import com.ny.aenean.cardconfig.InputConfig.HitStay;

public class AeneanInputServiceV4 {
	
	Scanner scan;
	public AeneanInputServiceV4() {
		scan = new Scanner(System.in);
	}
	
	public int scanPlayerPrompt() {
		System.out.println("\t\t다른키를 입력시 반응하지 않습니다.");
		System.out.println("-".repeat(90));
		System.out.print("입력 : 1.Hit(H,Y,1)  2.Stay(S,N,2) >> ");
		String str = scan.nextLine();
		int result = -1;
		try {
			if(str.equalsIgnoreCase("H") ||
					str.equalsIgnoreCase("Y") ||
					str.equalsIgnoreCase("1") ) {
				result = HitStay.HIT;
			}else if(str.equalsIgnoreCase("S") ||
					str.equalsIgnoreCase("N") ||
					str.equalsIgnoreCase("2") ) {
				result = HitStay.STAY;
			}
		}catch (Exception e) { result = -1;}
		
		return result;
	}
	
	public void scanPassMain() {
		System.out.print("\t\t\t Enter키를 입력하면 게임이 진행됩니다. ");
		scan.nextLine();
	}
	
	public void scanPassGameResult() {
		System.out.print("\t 다음게임을 하려면 Enter키를 누르세요. ");
		scan.nextLine();
	}

	public int scanBetting(int betMul) {
		int intMul = betMul;
		System.out.println("\t 베팅값은 1 ~ 5 사이 입니다. ");
		System.out.print("\t Betting >> ");
		try {
			String bet = scan.nextLine();
			intMul = Integer.valueOf(bet);
			if(intMul < 1 || intMul > 5 ) {
				intMul = betMul;
			} 
		} catch (Exception e) { intMul = betMul;}
		
		return intMul;
	}

}
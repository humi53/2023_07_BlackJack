package com.ny.aenean.config;

import java.util.Arrays;

public class Config {
	public class ColorConfig{
		public class ViewColor{
			public static final String BLACK = "\u001B[30m";
			public static final String WHITE = "\u001B[37m";
			public static final String YELLOW = "\u001B[33m";
			public static final String GREEN = "\u001B[32m";
			public static final String RED = "\u001B[31m";
			public static final String PURPLE = "\u001B[35m";
			public static final String CYAN = "\u001B[36m";
			public static final String END = "\u001B[0m";
		}
		public static final String setViewColor(String viewColor, String message) {
			return String.format("%s%s%s", viewColor, message, ViewColor.END);
		}
		public static final String BLACK(String text) {
			return setViewColor(ViewColor.BLACK,text);
		}
		public static final String RED(String text) {
			return setViewColor(ViewColor.RED,text);
		}
		public static final String GREEN(String text) {
			return setViewColor(ViewColor.GREEN,text);
		}
		public static final String YELLOW(String text) {
			return setViewColor(ViewColor.YELLOW,text);
		}
		public static final String PURPLE(String text) {
			return setViewColor(ViewColor.PURPLE,text);
		}
		public static final String CYAN(String text) {
			return setViewColor(ViewColor.CYAN,text);
		}
		public static final String WHITE(String text) {
			return setViewColor(ViewColor.WHITE,text);
		}
	}
	public class CardConfig {
		public class SuitAP{
			public static final int SPADE = 0;
			public static final int DIAMOND = 1;
			public static final int HART = 2;
			public static final int CLOVER = 3;
		}
		private static String[] cardSuit = {"S","D","H","C"};
		public static final String[] CARDSUIT = Arrays.copyOf(cardSuit, cardSuit.length);
		private static String[] viewSuit = {"♠","♦","♥","♣"};
		public static final String[] VIEWSUIT = Arrays.copyOf(viewSuit, viewSuit.length);
				
		public class NumAP{
			public static final int A = 0;
			public static final int T = 1;
			public static final int J = 2;
			public static final int Q = 3;
			public static final int K = 4;
		}
		private static String[] viewNum = {"A","T","J","Q","K"};
		public static final String[] VIEWNUM = Arrays.copyOf(viewNum, viewNum.length);
		private static int[] numScore = {1,10,10,10,10};
		public static final int[] NUMSCORE = Arrays.copyOf(numScore, numScore.length);
		
		
		
		public class CardNum{
			public static final String A = "A";
			public static final String T = "T";
			public static final String J = "J";
			public static final String Q = "Q";
			public static final String K = "K";
		}
		public class CardScore{
			public static final int A = 1;
			public static final int T = 10;
			public static final int J = 10;
			public static final int Q = 10;
			public static final int K = 10;
		}
		
		public class ViewSuit{
			public static final String SPADE = "♠";
			public static final String DIAMOND = "♦";
			public static final String HART = "♥";
			public static final String CLOVER = "♣";
		}
		
		public class CardSuit{
			public static final String SPADE = "S";
			public static final String DIAMOND = "D";
			public static final String HART = "H";
			public static final String CLOVER = "C";
		}
	}
	
	public class StateConfig {
		public class HitStay{
			public static final int HIT = 0;
			public static final int STAY = 1;
			
		}
		public class IsBust{
			public static final boolean BUST = true;
			public static final boolean NOTBUST = false; 
		}
		
		public class Score17IsOver{
			public static final boolean OVER = true;
			public static final boolean NOTOVER = false; 
		}
		public class GameState{
			public static final int MAIN = 0;	// 메인화면
			public static final int EXIT = 1;	// 종료화면
			
			public static final int GAMEREADY = 11;		// 카드를 받기전 대기 상태 (덱만있고 테이블이 비어있는 상태)
			public static final int WINNERCHECK = 12;	// 승자를 확인하는 상태
			public static final int BETTING = 13;		// 베팅을 하고 있는 상태 상태
			public static final int GAMESTAND = 14;		// 승자확인 후 다음게임 여부를 대기상태
			public static final int WINNERPLAERY = 15;	// 결과 : 플레이어 승리
			public static final int WINNERDEALER = 16;	// 결과 : 딜러 승리
			public static final int GAMEDEALING = 17;	// 초반 2장씩 나눠주고 있는 상태. (V1 : 구버전 명칭)
			public static final int GAMEPUSH = 18;		// 결과 : 무승부
			public static final int DISTRIBUTE = 19;	// 초반 2장씩 나눠주고 있는 상태. (새 명칭)
			
			public static final int PLAYERPROMPT = 51;		// 플레이어의 HitStay를 대기
			public static final int PLAYERHIT = 52;		// 플레이어어가 HIT를 고른 상태
			public static final int PLAYERDEAL = 53;	// 플레이어어가 카드를 받은 상태
			public static final int PLAYERSTAY = 54;	// 플레이어어가 Stay를 고른 상태
			public static final int PLAYERCALC = 55;	// 플레이어어 점수를 확인하는 상태
			public static final int PLAYERISBUST = 56;	// 플레이어가 BUST인지 확인하는 상태 
			public static final int PLAYERBLACKJACK = 57;	// 플레이어가 블랙잭
			
			public static final int DEALERREADY = 71;	// 딜러가 대기상태
			public static final int DEALEROPEN = 72;	// 딜러가 2번째 카드를 오픈한 상태
			public static final int DEALERDEAL = 73;	// 딜러가 카드를 받은 상태 
			public static final int DEALERCALC = 74;	// 딜러 점수를 확인하는 상태
			public static final int DEALER17OVER = 75;	// 딜러가 17점에 도달했는지 확인		
			public static final int DEALERISBUST = 76;	// 딜러가 BUST인지 확인하는 상태
		}
	}	
}

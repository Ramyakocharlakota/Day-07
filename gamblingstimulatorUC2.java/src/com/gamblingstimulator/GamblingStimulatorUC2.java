package com.gamblingstimulator;

public class GamblingStimulatorUC2 {
		public static void Gambler() {
			int stake = 100;
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				System.out.println("Gambler won !");	
				}else {
	System.out.println("oops ! Gambler lost");
				}
			public static void main(String[] args) {
			 Gambler();
		// TODO Auto-generated method stub

	}

}

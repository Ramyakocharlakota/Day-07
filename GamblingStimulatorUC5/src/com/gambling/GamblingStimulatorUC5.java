package com.gambling;

public class GamblingStimulatorUC5 {
	public static void Gambler() {
		int stake = 100;
		int won = 0;
		int lost = 0;
		for(int daysofmonth = 1; daysofmonth <= 30; daysofmonth++) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				won++;
			}else {
				lost++;
			}
		}
		System.out.println("Total amount of win in a month is " +won+ "$");	
		System.out.println("Total amount of lost in a month is " +lost+ "$");
	}

	public static void main(String[] args) {
		Gambler();
		// TODO Auto-generated method stub

	}

}

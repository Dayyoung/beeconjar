package beeconjartest;

import beeconjar.BEECODE;
import beeconjar.Bee;
import beeconjar.BeeButton;
import beeconjar.HoneyComb;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bee TestBee = new Bee("BeeconJar",100);
		
		BeeButton beeButton1 = new BeeButton(1, "J") {
			
			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("J");
			}
			
		};

		BeeButton beeButton2 = new BeeButton(5, "A") {
			
			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("A");				
			}
			
		};				
		
		BeeButton beeButton3 = new BeeButton(9, "R") {
			
			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("R");				
			}			
		};		
		
		TestBee.addButton(beeButton1);
		TestBee.addButton(beeButton2);
		TestBee.addButton(beeButton3);
		
		HoneyComb honeyComb= new HoneyComb();
		honeyComb.setRegion(BEECODE.ASIA);
		honeyComb.addBee(TestBee);		
		honeyComb.hangOn();		
		
	}
}

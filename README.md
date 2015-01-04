beeconjar
=========
BeeconJS - remote control javascript library

 BeeconJS Java Library v0.0.1
 http://beeconjs.com/
 
 Copyright 2015, Dayyoung You
 Dual licensed under the MIT or GPL Version 2 licenses.
 Visit http://beeconjs.com/license 
 
This is  BeeconJS Java Library for Java 

See license : [JavaScript client](https://github.com/Automattic/socket.io-client), [Engine.IO-client.java](https://github.com/nkzawa/engine.io-client.java) , [socket.io-client.java](https://github.com/nkzawa/socket.io-client.java)

## Installation

Import beeconJar-X.X.X.jar

## Usage
		
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
		
## Features

This library supports all of the features the JS client does, including events, options and upgrading transport. Android is fully supported.

## License

Dual licensed under the MIT or GPL Version 2 licenses.
 
 

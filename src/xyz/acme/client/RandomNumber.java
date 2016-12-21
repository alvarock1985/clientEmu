package xyz.acme.client;


import java.util.Random;

public class RandomNumber {
	
	int value;
	
	public int genInt(){
		
		Random randomGen = new Random();
		
		value = randomGen.nextInt(30);
		return value;
		
		
		
		
		
		
		
	}
	

}

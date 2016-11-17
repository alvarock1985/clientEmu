package xyz.acme.client;


import java.util.Random;

public class RandomInt {
	
	int value;
	
	public void genInt(){
		
		Random randomGen = new Random();
		
		value = randomGen.nextInt(30);
		
		System.out.println(value);
		
		
		
		
	}
	

}

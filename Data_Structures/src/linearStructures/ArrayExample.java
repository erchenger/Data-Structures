package linearStructures;

import interfaces.DSBaseClass;

import java.io.IOException;

public class ArrayExample implements DSBaseClass{
	private int[] intArray;
	private String[] stringArray;
	
	@Override
	public void run(){
		System.out.println("What type of array would you like to use?\n1) String\n2) Integer\n");
		try {
			int intInput = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package linearStructures;

import java.io.IOException;

public class ArrayExample {
	private int[] intArray;
	private String[] stringArray;
	
	public void run(){
		System.out.println("What type of array would you like to use?\n1) String\n2) Integer\n");
		try {
			int intInput = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

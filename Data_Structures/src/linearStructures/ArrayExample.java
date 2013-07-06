package linearStructures;

import interfaces.DSBaseClass;

import java.util.Arrays;

import utils.MenuUtils;
import algorithms.BinarySearch;

public class ArrayExample implements DSBaseClass{
	private int[] intArray;
	private MenuUtils menu;
	@Override
	public void run(){
		menu = MenuUtils.getInstance();
		menu.setMessage("Running example array and algorithms",false);
		menu.show();
		instantiateArray(10);
		populateArray();
		displayArray();
		int answer = BinarySearch.intArray(intArray);
		menu.setMessage("The binary search found: "+answer, false);
		menu.show();
	}
	
	
	private void instantiateArray(int size){
		intArray = new int[size];
		menu.setMessage("An array with the size "+size+" was instantiated.", false);
		menu.show();
	}
	
	private void populateArray(){
		for (int x=0;x<intArray.length;x++){
			menu.setMessage("Please enter a number: ", true);
			intArray[x] = menu.show();
		}
	}
	
	private void displayArray(){
		System.out.println(Arrays.toString(intArray));
	}
	
	
}

package linearStructures;

import interfaces.DSBaseClass;

import java.util.Arrays;

import utils.MenuUtils;
import algorithms.BinarySearch;
import algorithms.HeapSort;
/**
 * @author Elliott Chenger
 *
 */
public class ArrayExample implements DSBaseClass{
	private int[] intArray;
	private MenuUtils menu;
	
	/**
	 * @see DSBaseClass
	 */
	@Override
	public void run(){
		menu = MenuUtils.getInstance();
		menu.setMessage("Running example array and algorithms",false);
		menu.show();
		instantiateArray(10);
		populateArray();
		displayArray();
		intArray = HeapSort.sort(intArray);
		displayArray();
		int answer = BinarySearch.intArray(intArray);
		menu.setMessage("The binary search found: "+answer, false);
		menu.show();
	}
	
	/**
	 * Instantiate the array that will be under test
	 * @param size
	 */
	private void instantiateArray(int size){
		intArray = new int[size];
		menu.setMessage("An array with the size "+size+" was instantiated.", false);
		menu.show();
	}
	
	/**
	 * populate the array with integers to be used for the example
	 */
	private void populateArray(){
		for (int x=0;x<intArray.length;x++){
			menu.setMessage("Please enter a number: ", true);
			intArray[x] = menu.show();
		}
	}
	
	/**
	 * displays the array so that any augmentation to the 
	 * 	array can be easily seen visually.
	 */
	private void displayArray(){
		System.out.println(Arrays.toString(intArray));
	}
	
	
}

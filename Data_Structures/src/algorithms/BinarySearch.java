package algorithms;

import utils.MenuUtils;
/**
 * @author Elliott Chenger
 *
 */
public class BinarySearch {
	private static MenuUtils menu;

	/**
	 * This is a usual implementation of the binary search
	 * I made one change on to the last comparison, @see the comment
	 * below.
	 * @param inputArray
	 * @return
	 */
	public static int intArray(int[] inputArray){
		menu = MenuUtils.getInstance();
		menu.setMessage("What number do you want to find? ",true);
		int target = menu.show();

		int left = 0;
		int right = inputArray.length-1;
		while(left<=right){
			int mid = (left+right)/2;
			if(target == inputArray[mid]){
				return inputArray[mid]; 
			}
			else if(target<inputArray[mid]){
				right = mid -1;
			}
			else{
				left = mid +1;
			}
		}
		
		//Rather then making a left>=right I decided that it should be equal
		if(left==right){
			return inputArray[left];
		}
		else{
			return -1;
		}

	}

}

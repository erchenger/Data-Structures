package algorithms;

import utils.MenuUtils;

public class BinarySearch {
	private static MenuUtils menu;

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
		
		if(left==right){
			return inputArray[left];
		}
		else{
			return -1;
		}
		
	}
	
}

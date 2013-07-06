package algorithms;

import java.util.Arrays;

import utils.MenuUtils;

public class HeapSort {
	private static int inArraySize;
	private static MenuUtils menu = MenuUtils.getInstance();
	private static boolean debug = true;
	
	public static int[] sort(int[] inputArray){
		menu.setMessage("Heap Sort",false);
		menu.show();
		
		inArraySize = inputArray.length;
		heapify(inputArray);
		
		int end = inputArray.length-1;
		while(end>0){
			swap(inputArray,end, 0);
			end--;
			siftDown(inputArray, 0, end);
		}
		return inputArray;
	}
	
	private static void heapify(int[] inputArray){
		int start = (inArraySize -1)/2;
		
		while (start >=0){
			siftDown(inputArray, start, inArraySize-1);
			start--;
			printArray(inputArray);
		}
	}
	
	private static void siftDown(int[] inputArray, int start, int end){
		int root = start;
		
		while(root*2+1<=end){
			int child = root *2+1;
			int swap = root;
			if (inputArray[swap]<inputArray[child])
				swap = child;
				
			
			if (child+1<=end && inputArray[swap]<inputArray[child+1])
				swap = child+1;
			
			if (swap!= root){
				swap(inputArray, root, swap);
				root = swap;
			}
			else
				return;
		}
	}
	
	private static void swap(int[] inputArray, int root, int swap){
		int rootNum = inputArray[root];
		int swapNum = inputArray[swap];
		inputArray[root] = swapNum;
		inputArray[swap] = rootNum;
	}
	
	private static void printArray(int[] inputArray){
		if(debug)
			System.out.println(Arrays.toString(inputArray));
	}
}

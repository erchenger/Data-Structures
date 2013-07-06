package main;

import linearStructures.ArrayExample;
import exceptions.ArgumentException;

/**
 * @author Elliott Chenger
 *
 */
public class DataStructures {
	
	public static void main (String args[]){
		//This is where the entire project will run and allow you to try different data structures
		int argsLen = args.length;
		
			//Expecting an argument for this to run a specific part of the program
			try{
				if(argsLen!=1){
					throw new ArgumentException("Was expecting 1 argument but recieved "+argsLen+" arguments.");
				}
				argumentChoice(Integer.parseInt(args[0]));
			}
			//Catch when there are too many or not enough arguments
			catch (ArgumentException e){
				System.out.println(e.toString());
			}
			//Catch when the argument can't be converted into an int 
			catch (NumberFormatException e){
				System.out.println("Argument is not an int");
			}
	}
	
	/**
	 * argumentChoice handles user selection from args
	 * @param choice
	 */
	private static void argumentChoice(int choice){
		
		switch(choice){
			case 1:
				printSectionName("Arrays");
				ArrayExample ae = new ArrayExample();
				ae.run();
				break;
			case 2:
				printSectionName("Linked Lists");

				break;
			case 3:
				printSectionName("Trees");

				break;
			case 4:
				printSectionName("Hashmaps");

				break;
			default:
				break;
		}
	}
	
	/**
	 * printSectionName does exactly what it sounds like it prints the section
	 * 	that the user is about to enter.
	 * @param name
	 */
	private static void printSectionName(String name){
		System.out.println(name);
	}
	
	
}

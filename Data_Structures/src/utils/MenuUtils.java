package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Elliott Chenger
 *	The MenuUtils class is used for easily handling menu selection and input
 *	this class will be used for numerous things so this code is being abstracted for
 *	reusability. 
 */
public class MenuUtils {
	private String message;
	private BufferedReader keyboard;
	private static MenuUtils instance;
	private boolean responseFlag;
	
	/**
	 * Private constructor class so that it can't be called outside of the class
	 * this is using the singleton pattern. I have adapted it a bit, usually
	 * the constructor is protected, however I thought that for more security
	 * private would make more sense.
	 */
	private MenuUtils(){
		InputStreamReader unbuffered = new InputStreamReader(System.in);
		keyboard = new BufferedReader( unbuffered );
	}
	
	/**
	 * Static method to return a new instance of the class if one hasn't be instantiated
	 * or it simply just returns the singleton.
	 * @return
	 */
	public static MenuUtils getInstance(){
		if (instance == null){
			instance = new MenuUtils();
		}
		return instance;
	}
	
	/**
	 * Set the message and a flag to the class to say whether you are expecting user input
	 * right now it is only set to accept ints however that will be changed later.
	 * @param msg
	 * @param flag
	 */
	public void setMessage(String msg, boolean flag){
		message = msg;
		responseFlag = flag;
	}
	
	/**
	 * The show is used to display the message to the user as well as to ask for response
	 * if the necessary flag is set @see setMessage for the flag.
	 * @return
	 */
	public int show(){
		System.out.println(message);
		if(responseFlag){
			String inputText;
			try {
				inputText = keyboard.readLine();
				return Integer.parseInt(inputText);
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		return -1;
	}
}

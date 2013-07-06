package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuUtils {
	private String message;
	private BufferedReader keyboard;
	private static MenuUtils instance;
	private boolean responseFlag;
		
	protected MenuUtils(){
		InputStreamReader unbuffered = new InputStreamReader(System.in);
		keyboard = new BufferedReader( unbuffered );
	}
	
	public static MenuUtils getInstance(){
		if (instance == null){
			instance = new MenuUtils();
		}
		return instance;
	}
	
	public void setMessage(String msg, boolean flag){
		message = msg;
		responseFlag = flag;
	}
	
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

package exceptions;

/**
 * @author Elliott Chenger
 *
 */
public class ArgumentException extends Exception{
	
	static final long serialVersionUID = 10L; 

	public ArgumentException(){

	}

	public ArgumentException(String message){
		super(message);
	}
}

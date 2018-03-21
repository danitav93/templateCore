package rextart.com.templateCore.exceptions;


/**
 * Created by Daniele Tavernelli on 3/19/2018.
 * This exception is thrown when an invalid value format is passed
 * to a Feature type, the feature type is not able to recognize it
 * and ccannot set that value in the fields
 */

public class InvalidValueForTypeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param locale, the current selected language
	 */
	public InvalidValueForTypeException(String message) { 
		
		super(message); 
		
	};

}

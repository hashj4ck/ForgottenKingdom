/**
 * 
 */
package com.game.hobby.Exception;

/**
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
@SuppressWarnings("serial")
public class PlayerAlreadyExistsException extends Exception{

	/**
	 * Diese Exception wird geworfen, wenn auf ein Spieler zu einer Welt hinzugefügt wird,
	 * der bereits vorhanden ist.
	 */
	public PlayerAlreadyExistsException(String message) {
		super(message);
	}

}

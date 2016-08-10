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
public class PlayerNotInWorldExeption extends Exception{

	/**
	 * Diese Exception wird geworfen, wenn auf ein Spieler auf einer Welt zurückgegriffen wird,
	 * der nicht exisitert.
	 */
	public PlayerNotInWorldExeption(String message) {
		super(message);
	}

}

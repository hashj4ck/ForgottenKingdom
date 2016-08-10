/**
 * 
 */
package com.game.hobby.materialien;

/**
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
public class Raum {
	int _x = -1;
	int _y = -1;
	String _identifier;

	/**
	 * Erstelle einen Raum.
	 * @param x
	 * @param y
	 * @param identifier
	 */
	public Raum(int x, int y, String identifier) {
		_x = x;
		_y = y;
		_identifier = identifier;
	}
}

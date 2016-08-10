/**
 * 
 */
package com.game.hobby.fachwerte;

/**
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
public class Coordinate {
	private int _x;
	private int _y;
	
	/**
	 * Erstellt ein Koordinate. Parameter markieren den Maximumwert
	 * @param max_x
	 * @param max_y
	 */
	public Coordinate(int x, int y) {
		_x = x;
		_y = y;	
	}

	/**
	 * @return the _x
	 */
	public int get_x() {
		return _x;
	}

	/**
	 * @param _x the _x to set
	 */
	public void set_x(int _x) {
		this._x = _x;
	}

	/**
	 * @return the _y
	 */
	public int get_y() {
		return _y;
	}

	/**
	 * @param _y the _y to set
	 */
	public void set_y(int y) {
		_y = y;
	}
}

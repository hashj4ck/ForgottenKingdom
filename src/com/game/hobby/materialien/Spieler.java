/**
 * 
 */
package com.game.hobby.materialien;

import com.game.hobby.fachwerte.Coordinate;

/**
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
public class Spieler {
	private String _name;

	/**
	 * TODO: Diese Klasse ist die Superklasse. Wenn wir von "Spieler" mehrere
	 * Vererbungen haben, dann erben sie von dieser Klasse.
	 * 
	 * @param name
	 */
	public Spieler(String name, Coordinate coord) {
		_name = name;
	}

	/**
	 * Gibt den Namen des aktuellen Spielers wieder.
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}

}



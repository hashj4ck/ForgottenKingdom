/**
 * 
 */
package com.game.hobby.materialien;

/**
 * Diese Klasse ist eine Oberklasse, von der Später andere Klasse wie "Wiese", "Gebirge" usw. erben können.
 * Gedanke: Sie teilen vielleicht eine Gemeinsamkeit, wie die Begehbarkeit des Raums.
 * 
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
public class Land extends Raum {

	/**
	 * @param x
	 * @param y
	 * @param identifier
	 */
	public Land(int x, int y, String identifier) {
		super(x, y, identifier);
		// TODO Auto-generated constructor stub
	}


}

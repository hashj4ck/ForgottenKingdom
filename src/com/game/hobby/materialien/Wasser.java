/**
 * 
 */
package com.game.hobby.materialien;

/**
 * Diese Klasse ist eine Oberklasse, von der später andere Klasse wie "Meer", "Sumpf", "Fluss" usw. erben können.
 * Gedanke: Sie teilen vielleicht eine Gemeinsamkeit, wie die "Beschwimmbarkeit" des Raums.
 * 
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
public class Wasser extends Raum{

	/**
	 * @param x
	 * @param y
	 * @param identifier
	 */
	public Wasser(int x, int y, String identifier) {
		super(x, y, identifier);
		// TODO Auto-generated constructor stub
	}



}

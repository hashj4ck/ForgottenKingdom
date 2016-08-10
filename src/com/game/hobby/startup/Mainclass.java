package com.game.hobby.startup;

import com.game.hobby.materialien.World;
import com.game.hobby.werkzeuge.GameScreenWerkzeug.GameScreenWerkzeugUI;

/**
 * 
 * {Description of "dummy.java"}
 * <p>
 * Dummy-Klasse f√ºr GIT-Ordnersynchronisation
 *
 * @author Christian
 * @author Vinh
 * @version 09.08.2016
 *
 *
 */
public class Mainclass {
	private static GameScreenWerkzeugUI _gui;
	private static World _world;

	public static void main(String[] args) {

		// Generiere die Welt.
		_world = new World(300, 300, "Atlantis");

		// Starte die Benutzeroberfl‰che.
		_gui = new GameScreenWerkzeugUI();
		_gui.zeigeFenster();
	}

}

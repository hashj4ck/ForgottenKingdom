package com.game.hobby.startup;

import com.game.hobby.materialien.World;
import com.game.hobby.werkzeuge.GameScreenWerkzeug.GameScreenWerkzeugUI;

/**
 * 
 * {Description of "dummy.java"}
 * <p>
 * Dummy-Klasse für GIT-Ordnersynchronisation
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
		_world = generate_World();
		start_Gui();
	}

	/**
	 * @return
	 */
	private static World generate_World() {
		World world = new World(300, 300, "Atlantis");
		return world;
	}

	private static void start_Gui() {
		GameScreenWerkzeugUI gui = new GameScreenWerkzeugUI();
		gui.zeigeFenster();
	}
}

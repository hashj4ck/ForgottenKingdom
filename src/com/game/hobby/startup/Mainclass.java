package com.game.hobby.startup;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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

		//Nur temporär, Swing nimmt den System Look and Feel an!
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Generiere die Welt.
		_world = new World(300, 300, "Atlantis");

		// Starte die Benutzeroberfl�che.
		_gui = new GameScreenWerkzeugUI();
		_gui.zeigeFenster();
	}

}

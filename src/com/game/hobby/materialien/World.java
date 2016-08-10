/**
 * 
 */
package com.game.hobby.materialien;

import java.util.HashMap;
import java.util.Map;

import com.game.hobby.Exception.PlayerNotInWorldExeption;
import com.game.hobby.fachwerte.Coordinate;

/**
 * Diese Klasse modelliert die Spielwelt. Diese Klasse enthält alle Räume.
 * 
 * @author Vinh
 * @edited 10.08.2016
 * @year 2016
 */
public class World {
	private int _worldwidth = 500;
	private int _worldheight = 500;
	private String _name;
	private Map<Spieler, Coordinate> _spielern = new HashMap<Spieler, Coordinate>();
	public Raum[][] _world;

	public World(int worldwidth, int worldheight, String name) {
		_worldheight = worldheight;
		_worldwidth = worldwidth;
		_name = name;
		_world = new Raum[_worldwidth][_worldheight];
	}

	public void add_Player(Spieler spieler, Coordinate coord) {
		if (!_spielern.containsKey(spieler)) {

		}
	}

	/**
	 * @return the _worldwidth
	 */
	public int get_worldwidth() {
		return _worldwidth;
	}

	/**
	 * @return the _worldheight
	 */
	public int get_worldheight() {
		return _worldheight;
	}

	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * @return the _world
	 */
	public Raum[][] get_world() {
		return _world;
	}

	/**
	 * Gibt die Koordinate eines Spielers wieder.
	 * 
	 * @param spieler
	 * @return
	 */
	public Coordinate get_PlayerPosition(Spieler spieler) throws Exception {
		if (!_spielern.containsKey(spieler)) {
			throw new PlayerNotInWorldExeption(
					"Spieler \"" + spieler.get_name() + "\" befindet sich nicht auf der Welt \"" + _name);
		}
		return _spielern.get(spieler);

	}
}

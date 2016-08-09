package com.game.hobby.werkzeuge.GameScreenWerkzeug;

public class GameScreenWerkzeug {

	private GameScreenWerkzeugUI _ui;

	// Subwerkzeuge, ("Widgets") die eingebunden werden können folgen hier:

	// Services, die das Werkzeug benutzt folgen hier:

	// Materialien, die das Werkzeug benutzt folgen hier:

	// Fachwerte, die das Werkzeug benutzt folgen hier:

	/**
	 * 
	 * Constructor of "GameScreenWerkzeug.java" TODO: [09.08.2016 / 22:28:44,
	 * Christian] Finish the Constructor of "GameScreenWerkzeug.java"
	 */
	public GameScreenWerkzeug() {

		// _ui = new StartupWerkzeugUI(werkzeug1.getUIPanel(),
		// werkzeug2.getUIPanel());

		// Services initialisieren

		// Listener für Subwerkzeuge erstellen
		erzeugeListenerFuerSubwerkzeuge();

		// UI erstellen (mit eingebetteten UIs der direkten Subwerkzeuge)

		// UI Aktionen registrieren
		registriereUIAktionen();

		// Fenster anzeigen
		_ui.zeigeFenster();

	}

	/**
	 * 
	 * Erzeugt Listener für die eingebetteten Widgets in dem GameScreenWerkzeug
	 * Hier wird festgelegt, wie die UI sich verhält, wenn Änderungen in den
	 * Subwerkzeugen gemacht wurden.
	 *
	 * "erzeugeListenerFuerSubwerkzeuge" in "StartupWerkzeug.java"
	 */
	private void erzeugeListenerFuerSubwerkzeuge() {

	}

	/**
	 * 
	 * Registriert die einzelnen Listener für Elemente der UI. Hier werden nur
	 * UI-Elemente des eigenen Werkzeuges deklariert. Die UI-Elemente in den
	 * Subklassen werden NICHT hier, sondern in deren Klassen festgelegt.
	 *
	 * "registriereUIAktionen" in "StartupWerkzeug.java"
	 */
	private void registriereUIAktionen() {

	}

	/**
	 * 
	 * Zeigt das Fenster dem Benutzer an.
	 *
	 */
	public void zeigeFenster() {
		_ui.zeigeFenster();
	}

	/**
	 * 
	 * Schließt das Fenster.
	 */
	public void schliesseFenster() {
		_ui.schliesseFenster();
	}

}

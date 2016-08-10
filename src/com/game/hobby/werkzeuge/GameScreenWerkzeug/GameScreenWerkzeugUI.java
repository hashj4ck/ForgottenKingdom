package com.game.hobby.werkzeuge.GameScreenWerkzeug;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class GameScreenWerkzeugUI {

	// Titel des Frames:
	private static final String TITEL = "ForgottenKingdom [PROTOTYP a0.01]";

	// Der Hauptframe, der verschiedene Subwerkzeuge hält
	private JFrame _frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtWald;
	private JTextField textField_4;

	/**
	 * 
	 * Constructor of "GameScreenWerkzeugUI.java" "GameScreenWerkzeugUI.java"
	 */
	public GameScreenWerkzeugUI() {

		_frame = new JFrame();
		_frame.setTitle(TITEL);
		_frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel _hauptAnzeigeWerkzeug = new JPanel();
		_frame.getContentPane().add(_hauptAnzeigeWerkzeug, BorderLayout.CENTER);
		_hauptAnzeigeWerkzeug.setLayout(new BorderLayout(0, 0));
		
		JPanel _KommandoZeilenWerkzeug = new JPanel();
		_hauptAnzeigeWerkzeug.add(_KommandoZeilenWerkzeug, BorderLayout.SOUTH);
		_KommandoZeilenWerkzeug.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		_KommandoZeilenWerkzeug.add(textField);
		textField.setColumns(10);
		
		JButton btnSenden = new JButton("Senden");
		_KommandoZeilenWerkzeug.add(btnSenden, BorderLayout.EAST);
		
		JPanel _textAnzeigeEigenschaftenWerkzeug = new JPanel();
		_textAnzeigeEigenschaftenWerkzeug.setBackground(Color.BLACK);
		_textAnzeigeEigenschaftenWerkzeug.setForeground(Color.WHITE);
		_hauptAnzeigeWerkzeug.add(_textAnzeigeEigenschaftenWerkzeug, BorderLayout.EAST);
		GridBagLayout gbl__textAnzeigeEigenschaftenWerkzeug = new GridBagLayout();
		gbl__textAnzeigeEigenschaftenWerkzeug.columnWidths = new int[]{0, 0, 0};
		gbl__textAnzeigeEigenschaftenWerkzeug.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl__textAnzeigeEigenschaftenWerkzeug.columnWeights = new double[]{1.0, 1.0, 1.0};
		gbl__textAnzeigeEigenschaftenWerkzeug.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		_textAnzeigeEigenschaftenWerkzeug.setLayout(gbl__textAnzeigeEigenschaftenWerkzeug);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(5, 15, 5, 15);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		_textAnzeigeEigenschaftenWerkzeug.add(lblName, gbc_lblName);
		
		JLabel lblNamensanzeige = new JLabel("Namensanzeige");
		lblNamensanzeige.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNamensanzeige = new GridBagConstraints();
		gbc_lblNamensanzeige.anchor = GridBagConstraints.WEST;
		gbc_lblNamensanzeige.insets = new Insets(5, 15, 5, 15);
		gbc_lblNamensanzeige.gridx = 2;
		gbc_lblNamensanzeige.gridy = 0;
		_textAnzeigeEigenschaftenWerkzeug.add(lblNamensanzeige, gbc_lblNamensanzeige);
		
		JLabel lblGesundheit = new JLabel("Gesundheit");
		lblGesundheit.setForeground(Color.WHITE);
		lblGesundheit.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblGesundheit = new GridBagConstraints();
		gbc_lblGesundheit.anchor = GridBagConstraints.WEST;
		gbc_lblGesundheit.insets = new Insets(5, 15, 5, 15);
		gbc_lblGesundheit.gridx = 0;
		gbc_lblGesundheit.gridy = 1;
		_textAnzeigeEigenschaftenWerkzeug.add(lblGesundheit, gbc_lblGesundheit);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(new Color(255, 99, 71));
		progressBar.setStringPainted(true);
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.insets = new Insets(5, 15, 5, 15);
		gbc_progressBar.gridx = 2;
		gbc_progressBar.gridy = 1;
		_textAnzeigeEigenschaftenWerkzeug.add(progressBar, gbc_progressBar);
		
		JLabel lblAusdauer = new JLabel("Ausdauer");
		lblAusdauer.setForeground(Color.WHITE);
		lblAusdauer.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblAusdauer = new GridBagConstraints();
		gbc_lblAusdauer.anchor = GridBagConstraints.WEST;
		gbc_lblAusdauer.insets = new Insets(5, 15, 5, 15);
		gbc_lblAusdauer.gridx = 0;
		gbc_lblAusdauer.gridy = 2;
		_textAnzeigeEigenschaftenWerkzeug.add(lblAusdauer, gbc_lblAusdauer);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBackground(Color.BLACK);
		progressBar_1.setValue(75);
		progressBar_1.setForeground(new Color(34, 139, 34));
		progressBar_1.setStringPainted(true);
		GridBagConstraints gbc_progressBar_1 = new GridBagConstraints();
		gbc_progressBar_1.insets = new Insets(5, 15, 5, 15);
		gbc_progressBar_1.gridx = 2;
		gbc_progressBar_1.gridy = 2;
		_textAnzeigeEigenschaftenWerkzeug.add(progressBar_1, gbc_progressBar_1);
		
		JLabel lblErfahrung = new JLabel("Erfahrung");
		lblErfahrung.setForeground(Color.WHITE);
		lblErfahrung.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblErfahrung = new GridBagConstraints();
		gbc_lblErfahrung.anchor = GridBagConstraints.WEST;
		gbc_lblErfahrung.insets = new Insets(5, 15, 5, 15);
		gbc_lblErfahrung.gridx = 0;
		gbc_lblErfahrung.gridy = 3;
		_textAnzeigeEigenschaftenWerkzeug.add(lblErfahrung, gbc_lblErfahrung);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBackground(Color.BLACK);
		progressBar_2.setValue(90);
		progressBar_2.setForeground(new Color(255, 165, 0));
		progressBar_2.setStringPainted(true);
		GridBagConstraints gbc_progressBar_2 = new GridBagConstraints();
		gbc_progressBar_2.insets = new Insets(5, 15, 5, 15);
		gbc_progressBar_2.gridx = 2;
		gbc_progressBar_2.gridy = 3;
		_textAnzeigeEigenschaftenWerkzeug.add(progressBar_2, gbc_progressBar_2);
		
		JLabel lblXkoordinate = new JLabel("X-Koordinate");
		lblXkoordinate.setForeground(Color.WHITE);
		lblXkoordinate.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblXkoordinate = new GridBagConstraints();
		gbc_lblXkoordinate.anchor = GridBagConstraints.WEST;
		gbc_lblXkoordinate.insets = new Insets(5, 15, 5, 15);
		gbc_lblXkoordinate.gridx = 0;
		gbc_lblXkoordinate.gridy = 5;
		_textAnzeigeEigenschaftenWerkzeug.add(lblXkoordinate, gbc_lblXkoordinate);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBackground(Color.BLACK);
		textField_1.setForeground(Color.WHITE);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(5, 15, 5, 15);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 5;
		_textAnzeigeEigenschaftenWerkzeug.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblYkoordinate = new JLabel("Y-Koordinate");
		lblYkoordinate.setForeground(Color.WHITE);
		lblYkoordinate.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblYkoordinate = new GridBagConstraints();
		gbc_lblYkoordinate.anchor = GridBagConstraints.WEST;
		gbc_lblYkoordinate.insets = new Insets(5, 15, 5, 15);
		gbc_lblYkoordinate.gridx = 0;
		gbc_lblYkoordinate.gridy = 6;
		_textAnzeigeEigenschaftenWerkzeug.add(lblYkoordinate, gbc_lblYkoordinate);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBackground(Color.BLACK);
		textField_2.setForeground(Color.WHITE);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(5, 15, 5, 15);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 6;
		_textAnzeigeEigenschaftenWerkzeug.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblOrt = new JLabel("Ort");
		lblOrt.setForeground(Color.WHITE);
		lblOrt.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblOrt = new GridBagConstraints();
		gbc_lblOrt.anchor = GridBagConstraints.WEST;
		gbc_lblOrt.insets = new Insets(5, 15, 5, 15);
		gbc_lblOrt.gridx = 0;
		gbc_lblOrt.gridy = 7;
		_textAnzeigeEigenschaftenWerkzeug.add(lblOrt, gbc_lblOrt);
		
		txtWald = new JTextField();
		txtWald.setText("Wald");
		txtWald.setBackground(Color.BLACK);
		txtWald.setForeground(Color.WHITE);
		txtWald.setEditable(false);
		txtWald.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtWald = new GridBagConstraints();
		gbc_txtWald.insets = new Insets(5, 15, 5, 15);
		gbc_txtWald.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWald.gridx = 2;
		gbc_txtWald.gridy = 7;
		_textAnzeigeEigenschaftenWerkzeug.add(txtWald, gbc_txtWald);
		txtWald.setColumns(10);
		
		JLabel lblUhrzeit = new JLabel("Uhrzeit");
		lblUhrzeit.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblUhrzeit = new GridBagConstraints();
		gbc_lblUhrzeit.anchor = GridBagConstraints.WEST;
		gbc_lblUhrzeit.insets = new Insets(5, 15, 0, 15);
		gbc_lblUhrzeit.gridx = 0;
		gbc_lblUhrzeit.gridy = 8;
		_textAnzeigeEigenschaftenWerkzeug.add(lblUhrzeit, gbc_lblUhrzeit);
		
		textField_4 = new JTextField();
		textField_4.setText("23:00");
		textField_4.setBackground(Color.BLACK);
		textField_4.setForeground(Color.WHITE);
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(5, 15, 5, 15);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 8;
		_textAnzeigeEigenschaftenWerkzeug.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JPanel _textAnzeigeWerkzeug = new JPanel();
		_hauptAnzeigeWerkzeug.add(_textAnzeigeWerkzeug, BorderLayout.CENTER);
		_textAnzeigeWerkzeug.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		_textAnzeigeWerkzeug.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.BLACK);
		textPane.setForeground(Color.WHITE);
		scrollPane.setViewportView(textPane);

		JMenuBar menuBar = new JMenuBar();
		_frame.setJMenuBar(menuBar);

		JMenu mnSpiel = new JMenu("Spiel");
		menuBar.add(mnSpiel);

		JMenuItem mntmNeuesSpiel = new JMenuItem("Neues Spiel...");
		mnSpiel.add(mntmNeuesSpiel);

		JMenuItem mntmSpielSpeichern = new JMenuItem("Spiel speichern");
		mnSpiel.add(mntmSpielSpeichern);

		JMenu mnEinstellungen = new JMenu("Einstellungen");
		mnSpiel.add(mnEinstellungen);

		JMenuItem mntmGrafik = new JMenuItem("Grafik");
		mnEinstellungen.add(mntmGrafik);

		JMenuItem mntmSteuerung = new JMenuItem("Steuerung");
		mnEinstellungen.add(mntmSteuerung);

		JMenuItem mntmSound = new JMenuItem("Sound");
		mnEinstellungen.add(mntmSound);

		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mnSpiel.add(mntmBeenden);

		JMenu mnCharakter = new JMenu("Charakter");
		menuBar.add(mnCharakter);

		JMenuItem mntmFertigkeiten = new JMenuItem("Fertigkeiten");
		mnCharakter.add(mntmFertigkeiten);

		JMenuItem mntmEigenschaften = new JMenuItem("Eigenschaften");
		mnCharakter.add(mntmEigenschaften);

		JMenuItem mntmInventar = new JMenuItem("Inventar");
		mnCharakter.add(mntmInventar);

		JMenu mnLogbuch = new JMenu("Logbuch");
		menuBar.add(mnLogbuch);

		JMenuItem mntmAuftrge = new JMenuItem("Aufträge");
		mnLogbuch.add(mntmAuftrge);

		JMenuItem mntmEreignislog = new JMenuItem("Ereignislog");
		mnLogbuch.add(mntmEreignislog);
		
		JMenu mnDebug = new JMenu("Debug");
		menuBar.add(mnDebug);
		
		JMenuItem mntmWeltkarte = new JMenuItem("Weltkarte");
		mnDebug.add(mntmWeltkarte);

	}

	/**
	 * Zeigt das Fenster an
	 */
	public void zeigeFenster() {
		_frame.setSize(1367, 768);
		_frame.setVisible(true);
	}

	/**
	 * Schließt das Fenster.
	 */
	void schliesseFenster() {
		_frame.setVisible(false);
		_frame.dispose();
	}
}

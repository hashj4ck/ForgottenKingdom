package com.game.hobby.werkzeuge.GameScreenWerkzeug;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GameScreenWerkzeugUI {

	// Titel des Frames:
	private static final String TITEL = "ForgottenKingdom [PROTOTYP a0.01]";

	// Der Hauptframe, der verschiedene Subwerkzeuge hält
	private JFrame _frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * 
	 * Constructor of "GameScreenWerkzeugUI.java" "GameScreenWerkzeugUI.java"
	 */
	public GameScreenWerkzeugUI() {

		_frame = new JFrame();
		_frame.setTitle(TITEL);
		_frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel_south = new JPanel();
		_frame.getContentPane().add(panel_south, BorderLayout.SOUTH);
		panel_south.setLayout(new BorderLayout(0, 0));

		textField_1 = new JTextField();
		panel_south.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Aktion");
		panel_south.add(btnNewButton, BorderLayout.EAST);

		JPanel panel_west = new JPanel();
		_frame.getContentPane().add(panel_west, BorderLayout.WEST);
		panel_west.setLayout(new BorderLayout(0, 0));

		JPanel panel_east = new JPanel();
		panel_east.setForeground(Color.BLACK);
		panel_east.setBackground(Color.WHITE);
		_frame.getContentPane().add(panel_east, BorderLayout.EAST);
		GridBagLayout gbl_panel_east = new GridBagLayout();
		gbl_panel_east.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel_east.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_east.columnWeights = new double[] { 1.0, Double.MIN_VALUE, 1.0 };
		gbl_panel_east.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_east.setLayout(gbl_panel_east);

		JLabel lblLandkarte = new JLabel("Landkarte");
		lblLandkarte.setForeground(Color.BLACK);
		lblLandkarte.setFont(new Font("Monospaced", Font.BOLD, 18));
		GridBagConstraints gbc_lblLandkarte = new GridBagConstraints();
		gbc_lblLandkarte.insets = new Insets(5, 15, 5, 15);
		gbc_lblLandkarte.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblLandkarte.gridx = 1;
		gbc_lblLandkarte.gridy = 0;
		panel_east.add(lblLandkarte, gbc_lblLandkarte);

		JLabel lblNewLabel = new JLabel("X-Koordinate");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(5, 15, 5, 15);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_east.add(lblNewLabel, gbc_lblNewLabel);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(5, 15, 5, 15);
		gbc_textField_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 1;
		panel_east.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblYkoordinate = new JLabel("Y-Koordinate");
		lblYkoordinate.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lblYkoordinate.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblYkoordinate = new GridBagConstraints();
		gbc_lblYkoordinate.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblYkoordinate.insets = new Insets(5, 15, 5, 15);
		gbc_lblYkoordinate.gridx = 1;
		gbc_lblYkoordinate.gridy = 2;
		panel_east.add(lblYkoordinate, gbc_lblYkoordinate);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(5, 15, 5, 15);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 2;
		panel_east.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblCharakter = new JLabel("Charakter");
		lblCharakter.setForeground(Color.BLACK);
		lblCharakter.setFont(new Font("Monospaced", Font.BOLD, 18));
		GridBagConstraints gbc_lblCharakter = new GridBagConstraints();
		gbc_lblCharakter.anchor = GridBagConstraints.WEST;
		gbc_lblCharakter.insets = new Insets(5, 15, 5, 15);
		gbc_lblCharakter.gridx = 1;
		gbc_lblCharakter.gridy = 4;
		panel_east.add(lblCharakter, gbc_lblCharakter);

		JLabel lblGesundheit = new JLabel("Gesundheit");
		lblGesundheit.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lblGesundheit.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblGesundheit = new GridBagConstraints();
		gbc_lblGesundheit.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblGesundheit.insets = new Insets(5, 15, 5, 15);
		gbc_lblGesundheit.gridx = 1;
		gbc_lblGesundheit.gridy = 5;
		panel_east.add(lblGesundheit, gbc_lblGesundheit);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(128, 0, 0));
		progressBar.setStringPainted(true);
		progressBar.setValue(75);
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.insets = new Insets(5, 15, 5, 15);
		gbc_progressBar.gridx = 2;
		gbc_progressBar.gridy = 5;
		panel_east.add(progressBar, gbc_progressBar);

		JLabel lblAusdauer = new JLabel("Ausdauer");
		lblAusdauer.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lblAusdauer.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblAusdauer = new GridBagConstraints();
		gbc_lblAusdauer.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAusdauer.insets = new Insets(5, 15, 5, 15);
		gbc_lblAusdauer.gridx = 1;
		gbc_lblAusdauer.gridy = 6;
		panel_east.add(lblAusdauer, gbc_lblAusdauer);

		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setForeground(new Color(34, 139, 34));
		progressBar_1.setStringPainted(true);
		progressBar_1.setToolTipText("");
		progressBar_1.setValue(30);
		GridBagConstraints gbc_progressBar_1 = new GridBagConstraints();
		gbc_progressBar_1.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_1.gridx = 2;
		gbc_progressBar_1.gridy = 6;
		panel_east.add(progressBar_1, gbc_progressBar_1);

		JPanel panel_north = new JPanel();
		_frame.getContentPane().add(panel_north, BorderLayout.NORTH);
		panel_north.setLayout(new BorderLayout(0, 0));

		JPanel panel_center = new JPanel();
		_frame.getContentPane().add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(new BorderLayout(0, 0));
		
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Monospaced", Font.BOLD, 20));
		panel_center.add(textPane, BorderLayout.CENTER);
		textPane.setBackground(Color.BLACK);
		textPane.setForeground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane(textPane);
		panel_center.add(scrollPane, BorderLayout.CENTER);

	}

	/**
	 * Zeigt das Fenster an
	 */
	void zeigeFenster() {
		_frame.setSize(525, 335);
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

package codingProblems;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.font.TextAttribute;
import java.util.Collections;

public class ProblemsView extends JPanel {
	Color myBlack = new Color(4,12,14);
	Color myBlue = new Color(19, 34, 38);
	Color myCoffe = new Color(190, 144, 99);
	Color myPale = new Color(164, 151, 142);
	Color myGreen = new Color(82, 91, 86);
	final int buttonCount = 3;
	public ProblemsView() {
		
		int fontSize = 48;
		setVisible(true);
		//setBorder(new BevelBorder(BevelBorder.RAISED));
		//setBorder(new LineBorder(Color.WHITE,5));
		setBorder(null);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setBackground(myBlack);
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		//Add JLabel (Search Problems Title )
		JLabel searchProblemsTitle = new JLabel("Search Problems");
		searchProblemsTitle.setFont(new Font("Century", Font.ITALIC + Font.BOLD, fontSize));
		searchProblemsTitle.setForeground(myPale);
		//searchProblemsTitle.setBorder(new BevelBorder(BevelBorder.RAISED, myGreen, myGreen));
		searchProblemsTitle.setBorder(new LineBorder(Color.WHITE,3));
		searchProblemsTitle.setHorizontalAlignment(JLabel.CENTER);
		//setBackground(myBlack);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 0.1;
		c.gridwidth = buttonCount;
		add(searchProblemsTitle, c);
		
		//Add JTextField for search input
		JTextField searchBar = new JTextField("type or paste in bug, error or problem here.");
		searchBar.setHorizontalAlignment(JTextField.CENTER);
		searchBar.setBackground(null);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		c.weighty = 0.1;
		c.gridwidth = buttonCount;
		add(searchBar, c);
	
		//add action listenet to this that updates the font 
		JList optionList = new JList();
		optionList.setBackground(null);
		optionList.setBorder(new LineBorder(Color.WHITE, 3));
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		c.weighty = 1;
		c.weightx = 1;
		c.gridwidth = buttonCount;
		add(optionList, c);
		
		//put them right at the top
		JButton filterButton = new JButton("Filter Options");
		filterButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
		filterButton.setBackground(myBlack);
		filterButton.setForeground(myGreen);
		filterButton.setFocusPainted(false);
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 0.005;
		add(filterButton, c);
		
		JButton configurationButton = new JButton("Settings");
		configurationButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
		configurationButton.setBackground(myBlack);
		configurationButton.setForeground(myGreen);
		configurationButton.setFocusPainted(false);
		c.gridx = 1;
		add(configurationButton, c);
		
		JButton aboutButton = new JButton("About");
		aboutButton.setBackground(myBlack);
		aboutButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
		aboutButton.setForeground(myGreen);
		aboutButton.setFocusPainted(false);
		c.gridx = 2;
		add(aboutButton, c);
	}

}

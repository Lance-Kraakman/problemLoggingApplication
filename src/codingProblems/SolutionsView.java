package codingProblems;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class SolutionsView extends JPanel {
	
	Color myBlack = new Color(4,12,14);
	Color myBlue = new Color(19, 34, 38);
	Color myCoffe = new Color(190, 144, 99);
	Color myPale = new Color(164, 151, 142);
	Color myGreen = new Color(82, 91, 86);
	
	private JTextArea console;
	private JScrollPane consoleContainer;
	private JButton EditButton;
	private JButton SaveButton;
	
	public SolutionsView() {
		setVisible(true);
		setBorder(new BevelBorder(BevelBorder.LOWERED,myGreen,myGreen));
		setBorder(null);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setBackground(myBlue);	
		//create console for scroll pane
		console = new JTextArea();
		console.setOpaque(false);
		console.setBorder(null);
		console.setForeground(myCoffe);
		console.setFont(new Font("Century", Font.ITALIC, 18));
		console.setLineWrap(true);
		
		//create scroll pane
		JScrollPane consoleContainer = new JScrollPane(console);
		consoleContainer.getViewport().setBackground(myBlue);
		consoleContainer.setEnabled(true);
		consoleContainer.setBorder(null);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.insets = new Insets(1,1,1,1);
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		add(consoleContainer, c);
		
		EditButton = new JButton("Edit Solution");
		EditButton.setBackground(myBlue);
		EditButton.setForeground(myPale);
		EditButton.setFocusPainted(false);
		//EditButton.setBorder(null);
		c.insets = new Insets(0, 0, 0, 0);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.weighty = 0.005;
		add(EditButton, c);
		
		SaveButton = new JButton("Save Solution");
		SaveButton.setBackground(myBlue);
		SaveButton.setForeground(myPale);
		SaveButton.setFocusPainted(false);
		c.weighty = 0.005;
		c.gridx = 1;
		c.gridy = 1;
		add(SaveButton, c);
	}

	//generate default getters and setters
	public JTextArea getConsole() {
		return console;
	}

	public void setConsole(JTextArea console) {
		this.console = console;
	}

	public JScrollPane getConsoleContainer() {
		return consoleContainer;
	}

	public void setConsoleContainer(JScrollPane consoleContainer) {
		this.consoleContainer = consoleContainer;
	}

	public JButton getEditButton() {
		return EditButton;
	}

	public void setEditButton(JButton editButton) {
		EditButton = editButton;
	}

	public JButton getSaveButton() {
		return SaveButton;
	}

	public void setSaveButton(JButton saveButton) {
		SaveButton = saveButton;
	}

}

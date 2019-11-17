package codingProblems;

import java.awt.*;
import javax.swing.*;

public class ProblemAppView extends JFrame {
	/**
	 * Constructor
	 * Creates view for main application 
	 */
	private ProblemsView ProblemsPane;
	private SolutionsView solutionPane;
	
	public ProblemAppView() {
		setTitle("Problem Logger");
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
			
		//theese should actually be sub classes, otherwise
		//this file will be to big #abstraction or polymorphisim
		ProblemsView ProblemsPane = new ProblemsView();
		SolutionsView SolutionsPane = new SolutionsView();
		
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		//play around with c to get desired layout 
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.ipady = 400;
		c.ipadx = 500;
		c.weightx = 1;
		c.weighty = 1;
		getContentPane().add(ProblemsPane, c);
		
		c.fill = GridBagConstraints.BOTH;
		//c.ipadx = 400;
		c.weightx = 0.975;
		c.gridx = 1;
		c.gridy = 0;
		getContentPane().add(SolutionsPane, c);
	}

	public ProblemsView getProblemsPane() {
		return ProblemsPane;
	}

	public void setProblemsPane(ProblemsView problemsPane) {
		ProblemsPane = problemsPane;
	}

	public SolutionsView getSolutionPane() {
		return solutionPane;
	}

	public void setSolutionPane(SolutionsView solutionPane) {
		this.solutionPane = solutionPane;
	}


	
	
}		


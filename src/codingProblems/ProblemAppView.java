package codingProblems;

import java.awt.*;
import javax.swing.*;

public class ProblemAppView extends JPanel {
	/**
	 * Constructor
	 * Creates view for main application 
	 */
	public ProblemsView ProblemsPaneView;
	public SolutionsView SolutionsPaneView;
	
	public ProblemAppView() {
		//setTitle("Problem Logger");
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
			
		//theese should actually be sub classes, otherwise
		//this file will be to big #abstraction or polymorphisim
		ProblemsPaneView = new ProblemsView();
		SolutionsPaneView = new SolutionsView();
		
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		//play around with c to get desired layout 
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.ipady = 400;
		c.ipadx = 500;
		c.weightx = 1;
		c.weighty = 1;
		add(ProblemsPaneView, c);
		
		c.fill = GridBagConstraints.BOTH;
		//c.ipadx = 400;
		c.weightx = 0.975;
		c.gridx = 1;
		c.gridy = 0;
		add(SolutionsPaneView, c);
		
	}

	public ProblemsView getProblemsPane() {
		return ProblemsPaneView;
	}

	public void setProblemsPane(ProblemsView problemsPane) {
		ProblemsPaneView = problemsPane;
	}

	public SolutionsView getSolutionPane() {
		return SolutionsPaneView;
	}

	public void setSolutionPane(SolutionsView solutionPane) {
		this.SolutionsPaneView = solutionPane;
	}


	
	
}		


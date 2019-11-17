package codingProblems;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MainController extends JFrame {
	//Test only -> implement in controller
	
	public ProblemAppView view;
	public MainModel model;
	
	public MainController() {
		super("Problem Logger");
		view = new ProblemAppView();
		model = new MainModel();
		//add action listeners
		addSearchBarControlls();
		getContentPane().add(view);
		setVisible(true);
		setSize(1000, 500);
	}
	
	//the below functions add the events/action listeners
	public void addSearchBarControlls() {
		try {

		JTextField searchBar = view.getProblemsPane().getSearchBar();
			searchBar.addMouseListener(new MouseAdapter() {
			@Override 
			public void mouseClicked(MouseEvent e) {
				 if ((e.getClickCount() == 2) & (searchBar.getText().equalsIgnoreCase("type or paste in bug, error or problem here."))) {
					searchBar.setText("");
				 }  
			 }
		}); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//example of a function that checks tha tthing but dumb so delete it lol 
	 boolean isMouseInComponent(JComponent component) {
		double xMouse = component.getMousePosition().getX();
		double yMouse = component.getMousePosition().getY();
		
		if (((xMouse) < component.getWidth()) & (xMouse > 0)) {
			if ((yMouse < component.getHeight()) & (yMouse > 0)) {
				//do what we need yall
			} 
		}
		return false;
	}
	
	public static void main(String[] args) {
		MainController main = new MainController();
		
	}

}

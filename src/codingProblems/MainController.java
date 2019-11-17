package codingProblems;

public class MainController {
	//Test only -> implement in controller
	public static void main(String[] args) {
		ProblemAppView view = new ProblemAppView();
		view.pack();
		//view.setResizable(false);
		view.setVisible(true);
		view.setSize(1000, 500);
	}

}

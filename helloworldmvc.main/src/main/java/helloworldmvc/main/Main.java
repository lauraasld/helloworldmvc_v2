package helloworldmvc.main;

import helloworldmvc.contract.IModel;
import helloworldmvc.contract.IView;
import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		IModel model = new Model();
		IView view = new View();
		Controller controller = new Controller(view, model);
		controller.run();

	}

}
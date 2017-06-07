package helloworldmvc.controller;

import helloworldmvc.contract.IModel;
import helloworldmvc.contract.IView;

public class Controller {

	private final IView		view;
	private final IModel	model;

	public Controller(IView view2, IModel model2) {
		this.view = view2;
		this.model = model2;
	}

	public void run() {
		this.view.displayMessage(this.model.getHelloWorld());
	}

}

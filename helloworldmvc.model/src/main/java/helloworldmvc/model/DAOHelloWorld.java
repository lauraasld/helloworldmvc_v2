package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;

public class DAOHelloWorld {
	private static String			fileName			= "helloWorld";
	private static DAOHelloWorld	instance			= null;
	private String					helloWorldMessage	= null;

	private DAOHelloWorld() {
		this.readFile();
	}

	private void readFile() {
		BufferedReader bufferstock = null;
		try {
			bufferstock = new BufferedReader(new FileReader(DAOHelloWorld.fileName));
			this.helloWorldMessage = bufferstock.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DAOHelloWorld getInstance() {
		if (instance == null) {
			setInstance(new DAOHelloWorld());
		}
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance2) {
		instance = instance2;
	}

	protected String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	protected void setHelloWorldMessage(String helloWorldMessage2) {
		this.helloWorldMessage = helloWorldMessage2;
	}

}

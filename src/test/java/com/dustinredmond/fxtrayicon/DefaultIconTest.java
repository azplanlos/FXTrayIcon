package com.dustinredmond.fxtrayicon;

import javafx.application.Application;
import javafx.stage.Stage;

public class DefaultIconTest extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Default Icon");

		new FXTrayIcon
				.Builder(primaryStage)
				.menuItem("Option 1", e -> menu1())
				.menuItem("Option 2", e -> menu2())
				.separator()
				.menuItem("Exit", e -> System.exit(0))
				.show()
				.build();
	}

	private void menu1() {System.out.println("Option 1");}
	private void menu2() {System.out.println("Option 2");}

	public static void main(String[] args) {
		launch(args);
	}
}
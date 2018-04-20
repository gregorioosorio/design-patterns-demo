package com.godev.abstractfactory;

import com.godev.abstractfactory.guifactory.GUIFactory;
import com.godev.abstractfactory.guifactory.components.Button;
import com.godev.abstractfactory.guifactory.components.TextBox;
import com.godev.abstractfactory.guifactory.components.Window;

@SuppressWarnings("unused")
public class ClientApplication {
	public static void main(String... args) {
		renderGUI(GUIFactory.of("Microsoft"));
		renderGUI(GUIFactory.of("Linux"));
		renderGUI(GUIFactory.of("Mac"));
	}

	public static void renderGUI(GUIFactory factory) {

		Window window = factory.createWindow();
		Button button = factory.createButton();
		TextBox trextBox = factory.createTextBox();

	}
}

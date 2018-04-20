package com.godev.abstractfactory.guifactory;

import com.godev.abstractfactory.guifactory.components.Button;
import com.godev.abstractfactory.guifactory.components.TextBox;
import com.godev.abstractfactory.guifactory.components.Window;
import com.godev.abstractfactory.guifactory.factories.LinuxGUIFactory;
import com.godev.abstractfactory.guifactory.factories.MSGUIFactory;
import com.godev.abstractfactory.guifactory.factories.MacGUIFactory;

/**
 * A factory for creating GUI objects.
 */
public interface GUIFactory {

	/**
	 * Creates a new GUI object.
	 *
	 * @return the window
	 */
	Window createWindow();

	/**
	 * Creates a new GUI object.
	 *
	 * @return the button
	 */
	Button createButton();

	/**
	 * Creates a new GUI object.
	 *
	 * @return the text box
	 */
	TextBox createTextBox();

	/**
	 * Static Factory Method.
	 *
	 * @param os
	 *            the operating system
	 * @return the GUI factory
	 */
	static GUIFactory of(String os) {
		switch (os.toLowerCase()) {
		case "microsoft":
			return new MSGUIFactory();
		case "linux":
			return new LinuxGUIFactory();
		case "mac":
			return new MacGUIFactory();
		default:
			throw new IllegalArgumentException();
		}
	}
}

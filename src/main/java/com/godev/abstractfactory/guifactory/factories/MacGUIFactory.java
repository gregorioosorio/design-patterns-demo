package com.godev.abstractfactory.guifactory.factories;

import com.godev.abstractfactory.guifactory.GUIFactory;
import com.godev.abstractfactory.guifactory.components.Button;
import com.godev.abstractfactory.guifactory.components.TextBox;
import com.godev.abstractfactory.guifactory.components.Window;
import com.godev.abstractfactory.guifactory.components.mac.MacButton;
import com.godev.abstractfactory.guifactory.components.mac.MacTextBox;
import com.godev.abstractfactory.guifactory.components.mac.MacWindow;

public class MacGUIFactory implements GUIFactory {

	public Window createWindow() {
		return new MacWindow();
	}

	public Button createButton() {
		return new MacButton();
	}

	public TextBox createTextBox() {
		return new MacTextBox();
	}

}

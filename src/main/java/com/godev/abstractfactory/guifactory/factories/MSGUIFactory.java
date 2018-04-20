package com.godev.abstractfactory.guifactory.factories;

import com.godev.abstractfactory.guifactory.GUIFactory;
import com.godev.abstractfactory.guifactory.components.Button;
import com.godev.abstractfactory.guifactory.components.TextBox;
import com.godev.abstractfactory.guifactory.components.Window;
import com.godev.abstractfactory.guifactory.components.microsoft.MSButton;
import com.godev.abstractfactory.guifactory.components.microsoft.MSTextBox;
import com.godev.abstractfactory.guifactory.components.microsoft.MSWindow;

public class MSGUIFactory implements GUIFactory {

	public Window createWindow() {
		return new MSWindow();
	}

	public Button createButton() {
		return new MSButton();
	}

	public TextBox createTextBox() {
		return new MSTextBox();
	}

}

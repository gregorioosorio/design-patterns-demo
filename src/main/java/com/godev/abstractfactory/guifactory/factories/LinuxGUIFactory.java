package com.godev.abstractfactory.guifactory.factories;

import com.godev.abstractfactory.guifactory.GUIFactory;
import com.godev.abstractfactory.guifactory.components.Button;
import com.godev.abstractfactory.guifactory.components.TextBox;
import com.godev.abstractfactory.guifactory.components.Window;
import com.godev.abstractfactory.guifactory.components.linux.LinuxButton;
import com.godev.abstractfactory.guifactory.components.linux.LinuxTextBox;
import com.godev.abstractfactory.guifactory.components.linux.LinuxWindow;

public class LinuxGUIFactory implements GUIFactory {

	public Window createWindow() {
		return new LinuxWindow();
	}

	public Button createButton() {
		return new LinuxButton();
	}

	public TextBox createTextBox() {
		return new LinuxTextBox();
	}

}

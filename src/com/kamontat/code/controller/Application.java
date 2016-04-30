package com.kamontat.code.controller;

import com.kamontat.gui.UIConvertMenu;

/**
 * Created by kamontat on 30/4/59.
 */
public class Application {
	public static void main(String[] args) {
		UnitConverter unitConverter = new UnitConverter();

		UIConvertMenu dialog = new UIConvertMenu(unitConverter);
		dialog.run();
	}
}

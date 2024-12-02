/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : SmartHomeController.java
*/

package main;

import Commands.Command;

public class SmartHomeController {
	private static SmartHomeController instance;
	Command[] commands;

	private SmartHomeController() {
		this.commands = new Command[16];
	}

	public static SmartHomeController getController() {
		if (instance == null) {
			instance = new SmartHomeController();
		}
		return instance;
	}

	public void setCommand(int slot, Command command) {
		commands[slot] = command;
	}

	public void execute(int slot) {
		commands[slot].execute();
	}

}

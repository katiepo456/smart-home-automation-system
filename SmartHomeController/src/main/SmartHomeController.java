package main;

import Commands.Command;

public class SmartHomeController {
	private static SmartHomeController instance;
	Command[] commands;
	private SmartHomeController() {
		this.commands = new Command[16];
		
	}
	public static SmartHomeController getController() {
		if(instance == null) {
			instance = new SmartHomeController();
		}
		return instance;
		
	}
	public void setCommand(int slot, Command command){
		commands[slot] = command;
	}
	
	public void execute(int slot) {
		commands[slot].execute();
	}
}

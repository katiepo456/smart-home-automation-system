package main;

import Commands.Command;

public class SmartHomeController {
	private static SmartHomeController instance;
	Command[] onCommands;
	Command[] offCommands;
	private SmartHomeController() {
		this.onCommands = new Command[8];
		this.offCommands = new Command[8];
		
	}
	public static SmartHomeController getController() {
		if(instance == null) {
			instance = new SmartHomeController();
		}
		return instance;
		
	}
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void onButton(int slot) {
		onCommands[slot].execute();
	}
	public void offButton(int slot) {
		offCommands[slot].execute();
	}
}

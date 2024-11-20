package Observers;

import Commands.Command;

public class EmailNotification implements Observer {

	@Override
	public void update(Command command) {
		System.out.println("Email Notification: " + command.getClass().getSimpleName() + " executed.");
		
	}

}

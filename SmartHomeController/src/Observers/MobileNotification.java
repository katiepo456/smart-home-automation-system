package Observers;

import Commands.Command;

public class MobileNotification implements Observer {

	@Override
	public void update(Command command) {
		System.out.println("Mobile Notification: " + command.getClass().getSimpleName() + " executed.");
		
	}

}

/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : EmailNotification.java
*/

package Observers;

import Commands.Command;

public class EmailNotification implements Observer {

	@Override
	public void update(Command command) {
		System.out.println("Email Notification: " + command.getClass().getSimpleName() + " executed.");
	}

}

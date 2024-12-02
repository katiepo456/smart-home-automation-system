/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : MobileNotification.java
*/

package Observers;

import Commands.Command;

public class MobileNotification implements Observer {

	@Override
	public void update(Command command) {
		System.out.println("Mobile Notification: " + command.getClass().getSimpleName() + " executed.");
	}

}

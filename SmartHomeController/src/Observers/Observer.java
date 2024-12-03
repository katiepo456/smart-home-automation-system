/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : Observer.java
*/

package Observers;

import Commands.*;

public interface Observer {
	void update(Command command);
}

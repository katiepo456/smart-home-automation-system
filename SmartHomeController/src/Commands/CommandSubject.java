/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : CommandSubject.java
*/

package Commands;

import Observers.*;

public interface CommandSubject {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers(Command command);
}

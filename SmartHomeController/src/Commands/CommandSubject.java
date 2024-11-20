package Commands;

import Observers.*;

public interface CommandSubject {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers(Command command);
}

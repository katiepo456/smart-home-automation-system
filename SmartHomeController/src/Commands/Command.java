package Commands;

import java.util.ArrayList;
import java.util.List;

import Observers.*;

public abstract class Command implements CommandSubject {
	private List<Observer> observers = new ArrayList<>();
	
	public abstract void execute();
	
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Command command) {
        for (Observer observer : observers) {
            observer.update(command);
        }
    }

}

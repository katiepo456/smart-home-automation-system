package Observers;

import Commands.*;

public interface Observer {
	void update(Command command);
}

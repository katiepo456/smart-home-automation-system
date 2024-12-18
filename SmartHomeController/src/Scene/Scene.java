/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : Scene.java
*/

package Scene;

import java.util.ArrayList;
import java.util.List;

import Commands.Command;

public class Scene extends Command {
	private List<Command> commands = new ArrayList<Command>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void execute() {
		for (Command command : commands) {
			command.execute();
			notifyObservers(command);
		}
	}

}

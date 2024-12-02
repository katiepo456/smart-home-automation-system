/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : LightOff.java
*/

package Commands;

import Devices.Light;

public class LightOff extends Command {
	private Light light;

	public LightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
		notifyObservers(this);
	}
}

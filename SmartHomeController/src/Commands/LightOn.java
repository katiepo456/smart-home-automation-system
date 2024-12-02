/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : LightOn.java
*/

package Commands;

import Devices.Light;

public class LightOn extends Command {
	private Light light;

	public LightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		notifyObservers(this);
	}

}

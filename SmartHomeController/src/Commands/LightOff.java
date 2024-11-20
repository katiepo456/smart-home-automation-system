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

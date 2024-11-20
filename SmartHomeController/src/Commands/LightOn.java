package Commands;

import Devices.Light;

public class LightOn extends Command{
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

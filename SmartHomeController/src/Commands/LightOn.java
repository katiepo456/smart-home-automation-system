package Commands;

import Devices.Device;

public class LightOn extends Command{
	private Device device;
	public LightOn(Device device) {
		this.device = device;
	}
	@Override
	public void execute() {
		device.on();
		
	}

}

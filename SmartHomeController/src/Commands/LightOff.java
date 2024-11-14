package Commands;

import Devices.Device;

public class LightOff extends Command{
	private Device device;
	public LightOff(Device device) {
		this.device = device;
	}
	@Override
	public void execute() {
		System.out.println("Turning Light on");
		device.off();
	}
}

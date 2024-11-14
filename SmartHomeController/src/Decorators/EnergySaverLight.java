package Decorators;

import Devices.Device;

public class EnergySaverLight extends DeviceDecorator{

	public EnergySaverLight(Device device) {
		super.device = device;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		device.on();
		System.out.println("And saving energy");
		
	}

	@Override
	public void off() {
		device.off();
	}

}

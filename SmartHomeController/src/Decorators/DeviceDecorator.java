package Decorators;
import Devices.Device;

public abstract class DeviceDecorator implements Device{
	protected Device device;
	public abstract void execute();
	public abstract void on();
	public abstract void off();
}

package Decorators;

import Devices.Device;
import Devices.Light;

public abstract class LightDecorator extends Light{
	protected Light light;
	public abstract void execute();
	public abstract void on();
	public abstract void off();
}

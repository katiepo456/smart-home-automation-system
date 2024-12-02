/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : DeviceDecorator.java
*/

package Decorators;

import Devices.Device;

public abstract class DeviceDecorator implements Device {
	protected Device device;

	public abstract void execute();

	public abstract void on();

	public abstract void off();
}

package Factories;

import Devices.Device;

public abstract class DeviceFactory {
	public abstract Device createDevice(String name);
}

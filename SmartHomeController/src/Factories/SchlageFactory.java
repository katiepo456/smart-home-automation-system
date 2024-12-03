package Factories;

import Devices.Device;
import Devices.Lock;
import Devices.SchlageLock;
import Devices.SchlageLockAadpter;

public class SchlageFactory extends DeviceFactory{

	public Lock createLock() {
	return new SchlageLockAadpter(new SchlageLock());
		
	}

	@Override
	public Device createDevice(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
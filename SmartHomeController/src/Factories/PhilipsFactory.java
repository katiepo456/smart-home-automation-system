package Factories;

import Devices.Device;
import Devices.Light;
import Devices.PhilipsLight;
import Devices.PhilipsLightAdapter;

public class PhilipsFactory extends DeviceFactory{

	public Light createLight() {
	return new PhilipsLightAdapter(new PhilipsLight());
		
	}

	@Override
	public Device createDevice(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

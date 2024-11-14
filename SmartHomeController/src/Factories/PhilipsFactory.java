package Factories;

import Devices.Device;
import Devices.PhilipsLight;
import Devices.PhilipsLightAdapter;

public class PhilipsFactory extends DeviceFactory{

	@Override
	public Device createDevice(String name) {
		if(name == "light") {
			return new PhilipsLightAdapter(new PhilipsLight());
		}
		else {
			System.out.println("Not A device");
		}
		return null;
	}

}

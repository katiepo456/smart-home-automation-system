/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : PhilipsFactory.java
*/

package Factories;

import Devices.*;

public class PhilipsFactory extends DeviceFactory {

	public Light createLight() {
		return new PhilipsLightAdapter(new PhilipsLight());
	}

	@Override
	public Device createDevice(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

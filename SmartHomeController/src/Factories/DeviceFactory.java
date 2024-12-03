/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : DeviceFactory.java
*/

package Factories;

import Devices.*;

public abstract class DeviceFactory {

	public abstract Device createDevice(String name);

}

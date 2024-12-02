/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : EnergySaverLight.java
*/

package Decorators;

import Devices.Light;

public class EnergySaverLight extends LightDecorator {

	public EnergySaverLight(Light light) {
		super.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}

	@Override
	public void on() {
		light.on();
		System.out.println("And saving energy");
	}

	@Override
	public void off() {
		light.off();
	}

}

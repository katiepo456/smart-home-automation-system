/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : PhilipsLightAdapter.java
*/

package Devices;

public class PhilipsLightAdapter extends Light {
	PhilipsLight light;

	public PhilipsLightAdapter(PhilipsLight light) {
		this.light = light;
	}

	public void on() {
		light.turnOnPhilips();
	}

	public void off() {
		light.turnOffPhilips();
	}

}

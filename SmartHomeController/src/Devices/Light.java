/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : Light.java
*/

package Devices;

public class Light implements Device {

//	public void execute() {
//		System.out.println("turning on light");
//	}

	public void on() {
		System.out.println("turning on light");
	}

	public void off() {
		System.out.println("turning off light");
	}

}

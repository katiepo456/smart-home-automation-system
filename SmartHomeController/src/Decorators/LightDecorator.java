/*
Author        : Cole Heigis & Kathryn James
Class         : CSI-340 : Software Design Patterns
Assignment    : Smart Home Automation System
File Name     : LightDecorator.java
*/

package Decorators;

import Devices.*;

public abstract class LightDecorator extends Light {
	protected Light light;

	public abstract void execute();

	public abstract void on();

	public abstract void off();
}

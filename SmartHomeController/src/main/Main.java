package main;

import Commands.LightOff;
import Commands.LightOn;
import Decorators.EnergySaverLight;
import Devices.Device;
import Devices.Light;
import Devices.PhilipsLight;
import Devices.PhilipsLightAdapter;
import Factories.PhilipsFactory;

public class Main {
	public static void main(String[] args){
        SmartHomeController controller1 = SmartHomeController.getController();
        PhilipsFactory philipsFactory = new PhilipsFactory();
        Device light1 = philipsFactory.createDevice("light");
        light1 = new EnergySaverLight(light1);
        controller1.setCommand(0, new LightOn(light1), new LightOff(light1));
        controller1.onButton(0);
        
        }
}

package main;

import Commands.LightOff;
import Commands.LightOn;
import Decorators.EnergySaverLight;
import Devices.Device;
import Devices.Light;
import Devices.PhilipsLight;
import Devices.PhilipsLightAdapter;
import Factories.PhilipsFactory;
import Scene.Scene;

public class Main {
	public static void main(String[] args){
        SmartHomeController controller1 = SmartHomeController.getController();
        PhilipsFactory philipsFactory = new PhilipsFactory();
        Light light1 = philipsFactory.createLight();
        light1 = new EnergySaverLight(light1);
        Light light2 = philipsFactory.createLight();
        Scene LightsOn = new Scene();
        LightsOn.addCommand(new LightOn(light1));
        LightsOn.addCommand(new LightOn(light2));
        controller1.setCommand(0, new LightOn(light1));
        controller1.setCommand(1, new LightOff(light1));
        controller1.execute(0);
        controller1.execute(1);
        controller1.setCommand(2, LightsOn);
        controller1.execute(2);
        
        }
}

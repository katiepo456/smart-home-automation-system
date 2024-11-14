package Devices;

public class PhilipsLightAdapter extends Light{
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

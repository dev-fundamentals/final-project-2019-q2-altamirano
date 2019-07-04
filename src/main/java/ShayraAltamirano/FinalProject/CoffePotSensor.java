package main.java.ShayraAltamirano.FinalProject;

public class CoffePotSensor extends Sensor {
	public static boolean status;//true OK - false NOT OK
	
	public static boolean setStatus(boolean isCoffeePotEmpty, boolean isCoffeePotPlaced) {
		if (isCoffeePotEmpty==true && isCoffeePotPlaced==true) {
			status=true;
		}
		else {
			status=false;
		}
		return status;
		
	}
	public void printDescription() {
		if (status) {
			System.out.println("Coffee Pot Sensor: OK");
		}
		else {
			System.out.println("Coffee Pot Sensor: FAIL - Review the Container is not full and in Place");
		}
	}
}

package main.java.ShayraAltamirano.FinalProject;

public class WaterSensor extends Sensor{
	public static boolean status;//true OK - false NOT OK
	
	public static boolean setStatus(boolean isContainerEmpty) {
		if (isContainerEmpty==true) {
			status=false;
		}
		else {
			status=true;
		}
		return status;
		
	}
	public void printDescription() {
		if (status==true) {
			System.out.println("Water Sensor: OK");
		}
		else {
			System.out.println("water Sensor: FAIL - Review the Container is filled with water");
		}
	}
}

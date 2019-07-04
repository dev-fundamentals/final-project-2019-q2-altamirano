package main.java.ShayraAltamirano.FinalProject;

public class PotContainer extends Container {
	public boolean isEmpty;
	
	public boolean inPlace;
	
	public void setinPlace(boolean inPlace) {
	    this.inPlace=inPlace;
	}
	public void setisEmpty(boolean isEmpty) {
	    this.isEmpty=isEmpty;
	}
	
	public void printDescription() {
		
		if(this.isEmpty==true) {
			System.out.println("The pot is Empty or half full");
		}
		else {
		System.out.println("The pot is Full");
		}
		if(this.inPlace==true) {
			System.out.println("The pot is placed");
		}
		else {
		System.out.println("The pot is not placed");
		}
	}
}

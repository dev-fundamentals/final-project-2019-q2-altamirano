package main.java.ShayraAltamirano.FinalProject;

public class BoilerContainer extends Container {
	public boolean isEmpty;
	
	public BoilerContainer () {
	 }
	public void setisEmpty(boolean isEmpty) {
	    this.isEmpty=isEmpty;
	}
	
	public void printDescription() {
		
		if(this.isEmpty==true) {
			System.out.println("The water container is Empty");
		}
		else {
		System.out.println("The water container is Filled");
		}
	}
}

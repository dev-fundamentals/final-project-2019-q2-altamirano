package main.java.ShayraAltamirano.FinalProject;

public class Container {
	
	protected boolean isEmpty;

	public void setisEmpty(boolean isEmpty) {
	    this.isEmpty=isEmpty;
	}
	
	public void printDescription() {
		
		if(this.isEmpty==true) {
			System.out.println("The container is Empty");
		}
		else {
		System.out.println("The container is Filled");
		}
	}
}

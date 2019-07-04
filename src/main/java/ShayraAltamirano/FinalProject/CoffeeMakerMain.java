package main.java.ShayraAltamirano.FinalProject;

import java.io.IOException;
import java.io.InputStreamReader;


public class CoffeeMakerMain {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader on =null;
		InputStreamReader boilerContIn =null;
		InputStreamReader potContainerIn =null;
		InputStreamReader potIsEmpty =null;
		BoilerContainer boilerContainer = new BoilerContainer();
		PotContainer potContainer = new PotContainer();
		WaterSensor waterSensor= new WaterSensor();
		CoffePotSensor coffeePotSensor= new CoffePotSensor();
		BoilerPlate boilerPlate= new BoilerPlate();
		PotPlate potPlate= new PotPlate();
		Boolean onCoffeMaker=false;
		Boolean openValveRelief=false;
		try {
			
			//boilerContainer = new InputStreamReader(System.in);
			char c;
			
			do {
				
				//ON coffee Maker:
				on = new InputStreamReader(System.in);
				System.out.println("ON CoffeMaker?");
				System.out.println("1.- Yes");
				System.out.println("2.- No");
				System.out.println("0.- Exit");
			
				c = (char) on.read();
				
				if (c=='1') {
					
					onCoffeMaker=true;
					openValveRelief=false;
					System.out.println("*********Coffee Maker ON, and Valve Relief Closed************");
				}
				if (c=='2') {
					
					onCoffeMaker=false;
					System.out.println("*********Please ON the coffeeMaker************");
					break;
				}
				
				
				//Fill the boiler:
				boilerContIn = new InputStreamReader(System.in);
				System.out.println("Fill the Boiler Container?");
				System.out.println("1.- Yes");
				System.out.println("2.- No");
				System.out.println("0.- Exit");
			
				c = (char) boilerContIn.read();
				
				if (c=='1') {
					
					boilerContainer.setisEmpty(false);
				}
				if (c=='2') {
					
					boilerContainer.setisEmpty(true);
				}
				
				//Put Pot in Place:
				potContainerIn = new InputStreamReader(System.in);
				System.out.println("Place the Pot?");
				System.out.println("1.- Yes");
				System.out.println("2.- No");
				System.out.println("0.- Exit");
			
				c = (char) potContainerIn.read();
				
				if (c=='1') {
					
					potContainer.setinPlace(true);
				}
				if (c=='2') {
					
					potContainer.setinPlace(false);
				}
				//Weight the pot:
				potIsEmpty = new InputStreamReader(System.in);
				System.out.println("Enter the weigth of the pot");
				System.out.println("1.- 0.50gr (empty or not full)");
				System.out.println("2.- more than 0.50gr (full)");
				System.out.println("0.- Exit");
				c = (char) potIsEmpty.read();
				
				if (c=='1') {
					
					potContainer.setisEmpty(true);
				}
				if (c=='2') {
					
					potContainer.setisEmpty(false);
				}
				
				
				/*boilerContainer.printDescription();
				potContainer.printDescription();
				
				System.out.println(boilerContainer.isEmpty);
				System.out.println(potContainer.isEmpty);
				System.out.println(potContainer.inPlace);*/
				
			
				
				//System.out.println("***************************");
				//Leer sensores:
				waterSensor.setStatus(boilerContainer.isEmpty);
				coffeePotSensor.setStatus(potContainer.isEmpty, potContainer.inPlace);
				
				//Encender Plate				
				boilerPlate.status=waterSensor.status;
				potPlate.status=coffeePotSensor.status;
				if(boilerPlate.status==true && potPlate.status==true ) {
					System.out.println("Boiling Water");
					System.out.println("*******COFFEE READY********");
					openValveRelief=true;
					break;
				}
				else {
					if(boilerPlate.status==false) {
						System.out.println("*****CHECK IF THE BOILER IS FILLED*****");
					}
					else {
						System.out.println("*****CHECK IF THE COFFEE POT IS NOT FULL AND PLACED*****");
					}
				}
				//c='0';
				
			}while (c!='0');
		}
		finally {
			if (boilerContIn != null) {
				boilerContIn.close();
			}
		}	
	
}

	
}

/*
ClothesApp.java
@ author C Sullivan
7 Feb 2017
*/
import java.util.*;
public class ClothesApp{
	public static void main(String args[]){


		//variables
		int tshirts;
		int hoodies;
		int caps;
		double tshirtsCost;
		double hoodiesCost;
		double capsCost;
		double totalCost;

		Scanner keyboard;
		keyboard = new Scanner(System.in);
		Clothes myClothes;
		myClothes=new Clothes();


			System.out.println("How many tshirts would you like?");
			tshirts=keyboard.nextInt();
			myClothes.setTshirts(tshirts);

			System.out.println("How many hoodies would you like?");
			hoodies=keyboard.nextInt();
			myClothes.setHoodies(hoodies);

			System.out.println("How many caps would you like?");
			caps=keyboard.nextInt();
			myClothes.setCaps(caps);


		//process
		myClothes.compute();



		//output
		totalCost=myClothes.getTotalCost();
		System.out.println("The total cost of your items is "+totalCost);


	}








}
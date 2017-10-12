/*
Clothes.java
@ author C Sullivan
7 Feb 2017
*/


public class Clothes{

	int tshirts;
	int hoodies;
	int caps;
	double tshirtsCost;
	double hoodiesCost;
	double capsCost;
	double totalCost;

	public Clothes(){
		tshirts=0;
		hoodies=0;
		caps=0;
		tshirtsCost=10;
		hoodiesCost=20;
		capsCost=5;
		totalCost=0;
	}


	public void setTshirts(int tshirts){
		this.tshirts=tshirts;
	}


	public void setHoodies(int hoodies){
		this.hoodies=hoodies;
	}

	public void setCaps(int caps){
			this.caps=caps;
	}


	public void compute (){
		totalCost=(tshirts*tshirtsCost)+(hoodies*hoodiesCost)+(caps*capsCost);
	}


	public double getTotalCost(){
		return totalCost;
	}



}
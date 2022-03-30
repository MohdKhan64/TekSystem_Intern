package com.teksystems.shahrukh.composition;

public class textComposition {
	
	public static void main(String[] args) {
		BoxCase boxCase = new BoxCase("220B","Dell", "244");
		Monitor monitor = new Monitor("27 inch", "Acer", 27);
		MotherBoard mb = new MotherBoard("BJ-200","Asus",4,6,"v2.444");
		PC pc = new PC(boxCase,mb,monitor);
		pc.powerUp();
		
	}

}

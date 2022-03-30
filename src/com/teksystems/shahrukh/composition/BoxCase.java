package com.teksystems.shahrukh.composition;

public class BoxCase {
	
	private String mode1;
	private String manufacture;
	private String powerSupply;

	public BoxCase(String mode1, String manufacture, String powerSupply) {
		this.mode1 = mode1;
		this.manufacture = manufacture;
		this.powerSupply = powerSupply;
	}

	public void pressPowerButton() {
		// TODO Auto-generated method stub
		System.out.println("Power Button Pressed");
	}

}

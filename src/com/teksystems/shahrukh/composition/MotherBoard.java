package com.teksystems.shahrukh.composition;

public class MotherBoard {
	private String mode;
	private String manufacture;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public MotherBoard(String mode, String manufacture, int ramSlots, int cardSlots, String bios) {
		this.mode = mode;
		this.manufacture = manufacture;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	public void loadProgram(String string) {
		// TODO Auto-generated method stub
		System.out.println("Program " + string + " is now loading...");
	}
	
	

}

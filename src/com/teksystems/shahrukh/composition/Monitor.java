package com.teksystems.shahrukh.composition;

public class Monitor {
	private String mode1;
	private String manufacture;
	private int size;
	
	public Monitor(String mode1, String manufacture, int size) {
		this.mode1 = mode1;
		this.manufacture = manufacture;
		this.size = size;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
	}

}

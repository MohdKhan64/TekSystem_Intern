package com.teksystems.encapsulation;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel >= 1 && tonerLevel <= 100)
			this.tonerLevel = tonerLevel;
		else
			this.tonerLevel = -1;
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (tonerLevel+tonerAmount > 100) 
	           return -1; // invalid tonerAmount
		    this.tonerLevel += tonerAmount;
		    return tonerLevel;
		}
		else 
			return -1;//invalid tonerAmount
		    
	}
	
	public int printPages(int pages) {
		System.out.println("Printing " + pages + " number of pages");
		int pagesToPrint = pages;
		if (this.duplex) {
			pagesToPrint = (pages/2) + (pages %2);
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}

}

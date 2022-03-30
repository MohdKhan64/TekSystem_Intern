package com.teksystems.shahrukh.composition;

public class PC {
	
	private BoxCase boxCase;
	private MotherBoard motherBoard;
	private Monitor monitor;
	
	public PC(BoxCase boxCase, MotherBoard motherBoard, Monitor monitor) {
		this.boxCase = boxCase;
		this.motherBoard = motherBoard;
		this.monitor = monitor;
	}
	
	public void powerUp() {
		boxCase.pressPowerButton();
		drawLogo();
		motherBoard.loadProgram("Windows 10");
	}

	public void drawLogo() {
		monitor.drawPixelAt(1200,50,"yellow");
	}
}

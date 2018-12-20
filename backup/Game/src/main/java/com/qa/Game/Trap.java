package com.qa.Game;

public abstract class Trap {
	private String trap;
	double positionX;
	double positionY;
	
	public Trap() {
		
	}

	public String trapType() {
		return trap;

	}

	public String getTrap() {
		return trap;
	}

	public void setTrap(String trap) {
		this.trap = trap;
				setPosition();
	}

	public double getPositionX() {
		return positionX;
	}

	public void setPosition() {
		this.positionX = (int) ((Math.random() * ((0 - 10) + 1)) + 0);
		this.positionY = (int) ((Math.random() * ((0 - 10) + 1)) + 0);
	}

	public double getPositionY() {
		return positionY;
	}

}
